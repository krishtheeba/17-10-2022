package day4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumerInfEx {

	public static void main(String[] args) {
		
		// Consumer-> accepts an general arg and returns nothing
		// DoubleConsumer, LongConsumer
			//| accepts primitive type .
		//1. foreach()--> iterating through the entries
		
		List<String> l= Arrays.asList("Sam","Jasmine","Viswa");
		l.forEach(name-> System.out.println("Hello " + name)); // Consumer
		
		
		Map<String,Integer> nl= new HashMap<>(); // BiConsumer
		
		nl.put("Hari",33);
		nl.put("Nancy", 55);
		nl.put("Raghav",12);
		
		nl.forEach((name,age)-> System.out.println(name + "is " + age + " years old."));
		
		// ObjIntConsumer, ObjDoubleConsumer, ObjLongConsumer / BiConsumer

	}

}
