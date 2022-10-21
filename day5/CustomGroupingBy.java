package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
									//  Collector<Person,    List,          Person[]>

class CustomGroupingBy implements Collector<Person, Map<City, List<Person>>, Map<City, List<Person>>> {
	// 1. get Person object
	// 2. create a map with city as key & List of person obj as vaue    ===> accumulator fn  { banaglore , [p1,p2]}		
	//																						{hyderabad, [p3,p4p}
	// 3. combiner 
	
public static  CustomGroupingBy toCustomGroupingBy() {
   return new CustomGroupingBy();
}

@Override
public Supplier supplier() {
   return HashMap::new; // method ref way of calling constructor of hashap
}

@Override
public BiConsumer<Map<City, List<Person>>, Person> accumulator() {
   return (Map<City, List<Person>>map, Person p) -> {
      map.merge(p.getCity(),
         new ArrayList<>(List.of(p)),
        (List<Person> a, List<Person> b) -> {a.add(p); return a;}); //merge( K,  V,  merging rule)

   };     
}

@Override
public BinaryOperator<Map<City, List<Person>>> combiner() {
   return (Map<City, List<Person>> h1, Map<City, List<Person>> h2) -> { 
       h2.forEach((City c, List<Person> l) -> {
         h1.merge(c, l,
            (List<Person> a, List<Person> b) -> { 
              b.forEach((Person y) -> a.add(y)); 
                  return a;
            });
      });
      return h1;
   };
}
@Override 
public Function<Map<City, List<Person>>,Map<City, List<Person>>>  
   finisher() {
   return Function.identity();
}
@Override
public Set characteristics() {
   return Collections.singleton(Characteristics.IDENTITY_FINISH);
}    
} 
