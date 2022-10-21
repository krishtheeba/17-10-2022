package day5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class reduceEx1 {

	public static void main(String[] args) {
		
		List<Integer> s = Arrays.asList(1,2,3,4,5,6);
		
		System.out.println(s.stream().reduce(0, (x,y)->x+y));// sequential 21
		
		/*
		identity		1	2	3	4	5		6
		0
		-----------------
				1
				-------------
							3
							------
								6
								-------
									10
									------
										15
										-----------
											21
		//	sequential
		 * 
		 *identity		1	2	3	4	5		6
			0 
		 	0  + 1        0 + 2     0+ 3     0+ 4    0 +5     0+ 6   accumulatorfn
		 	1				2			3		4		5		6 = 21
		 	
			
			
		
		
		
		
		
		*/
		System.out.println(s.parallelStream().reduce(0, Integer::sum));// parallel 21
		
		System.out.println(s.stream().reduce(10, (x,y)->x+y));// sequential with identity 10
		System.out.println(s.parallelStream().reduce(10, Integer::sum));// parallel identity 10
		
	/*	10		1		2		3		4		5		6
		
		10+1		10+2	10+3		10+4	10+5	10+6  accumular fn parallel			
		11			12		13		14				15	16   combiner fn -> 
		-------------
					23
							36
									50
													65
														81

											// combiner not used bcaz sequential stream		
		int i= s.stream().parallel().reduce(10, (x,y)->x+y, (a,b)-> {System.out.println("Combiner"); return a+b;});
		System.out.println(i);
	*/	
		int i1= s.parallelStream().reduce(10, (x,y)->x+y, (a,b)-> {System.out.println("Combiner"); return a+b;});
		System.out.println(i1);
		
	}

}
