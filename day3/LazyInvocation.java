package day3;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyInvocation {

	public static void main(String[] args) {

	/*	Stream<String> s = Stream.of("Production_Sales","Sales","HRDepartment")
		.filter(x->{
			System.out.println("Filter called");
		return x.contains("Sales");});
		
		// stream---> filter()   ---> Stream   (intermediatory
		
		s.count();
		*/
	//	s.distinct().count();
		
/*	Stream.of("Production_Sales","Sales","HRDepartment")
		.filter(x->{
			System.out.println("Filter called");
		return x.contains("Sales");})
		.map(x->{
			System.out.println("Map called :" +x);
			return x.charAt(0);
		})
		.findFirst();
	*/
	Predicate<String> p = x->{
		System.out.println("Filter called");
	return x.contains("Sales");};
/*List<Character> str= Stream.of("P
 * roduction_Sales","Sales","HRDepartment")
	.filter(p)
	.map(x->{
		System.out.println("Map called :" +x);
		return x.charAt(0);
	})
	.collect(Collectors.toList());
*/
	Stream.of("Production_Sales","Sales","HRDepartment")
		.filter(p)
		.forEach(x->{System.out.println("forEach called");x.toLowerCase();});
	

		
	}

}
