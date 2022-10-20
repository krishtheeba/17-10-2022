package day4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class takeWhileDropWhile {

	public static void main(String[] args) {

// takeWhile--> Predicate --> elements
			//-> returns longest prefix(continuous seq of true elmts)
		/*
		 * 1st elmt of seq 1 elmt of stream that satisfy condition
		 * last elmt is immediately following last elmt which doesnot satisfy predicate
		 * 
		 */
					//	|---> ordered structure
			// -> subset of Stream
					//|--> unordered
		Stream<String> stream1 = Stream.of("Sam","JasmineUnNamed","ViswaUnNamed", "UnNamed"," Jansi", "James");
		
		List<String> lt = stream1.takeWhile(s-> !s.contains("UnNamed")).collect(Collectors.toList());
		System.out.println(lt);
		
		
	//dropwhile
	Stream<String> stream2 = Stream.of("Sam","JasmineUnNamed","ViswaUnNamed", "UnNamed"," Jansi", "James");
		
		List<String> ld = stream2.dropWhile(s-> !s.contains("UnNamed")).collect(Collectors.toList());
		System.out.println(ld);

	}

}
