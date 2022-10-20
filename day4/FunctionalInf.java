package day4;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class FunctionalInf {

	public static void main(String[] args) {
	//1.compute
		Map<String,Integer> namemap= new HashMap<>();
		
		namemap.computeIfAbsent("George", x->x.length());
	// compose
		
		Function<Integer,String> f1 = x-> x+ "Now it is a String";
		
		Function<String,String>  f2 = s-> "'" + s+ "'";
		
		Function<Integer,String> f3 = f2.compose(f1);
		
		System.out.println(f3.apply(5007));
		
		Function<Integer,String> f4 = f1.andThen(f2);
		
		System.out.println(f4.apply(5007));

		
		// BiFunction
		
		Map<String,Integer> smap= new HashMap<>();
		
		smap.put("Hari", 40000);
		smap.put("Vishnu", 83999);
		smap.put("Sarav", 60000);
		
		smap.replaceAll((name,oldValue)-> name.equals("Vishnu")? oldValue : oldValue+100 ); //replaceAll(BiFunction)
		System.out.println(smap);
	}

}
