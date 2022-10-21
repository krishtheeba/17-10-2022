package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomGroupByEx {

	public static void main(String[] args) {
		City c1 = new City("Bangalore");
		City c2 = new City("Hyderabad");
		Person p1 = new Person("sam",c1);
		Person p2 = new Person("Kayal",c2);
		Person p3 = new Person("Ram",c1);
		Person p4 = new Person("Seetha",c2);
		
		List<Person> PersonList = new ArrayList<>();
		PersonList.add(p1);
		PersonList.add(p2);
		PersonList.add(p3);
		PersonList.add(p4);
		
		
		Map<City, List<Person>> group =  PersonList.stream().collect(new CustomGroupingBy());
		
		group.forEach((k,v)-> System.out.println(k.getCity() + " : " +
					v.stream()
				.map(Person::getName)
				.collect(Collectors.joining(",")) ));
		
		group.forEach((k,v)->System.out.println(k + ": " + v));
				

	}

}
