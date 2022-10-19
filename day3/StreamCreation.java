package day3;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamCreation {

	public static void main(String[] args) {
		
		// stream() of Iterable obj
		
		Stream<Integer> s = Arrays.asList(1,2,3,4).stream();
		
		Stream<Integer> empty = Stream.empty();
		
		Stream<Integer> s1 = Stream.of(2,4,6,7,8);
		
		System.out.println(s1.count());// s1 stream is used. not available
		
		s1.map(x-> x+50).count();
		
		Stream<Integer> s2 = Stream.of(12,43,62,71,8);
		
		Stream.concat(s1, s2);
		
		

	}

}
