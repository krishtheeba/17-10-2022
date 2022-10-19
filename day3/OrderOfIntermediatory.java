package day3;

import java.util.stream.Stream;

public class OrderOfIntermediatory {

	public static void main(String[] args) {
		
	long c=	Stream.of("Production","Sales","HRDepartment")
		.map(x->{
			   System.out.println("Map Called");
		               return x.substring(0,3);
		})
		.skip(2)
		.count();
	
	System.out.println(c);
	long c1=	Stream.of("Production","Sales","HRDepartment")
			.skip(2)
			.map(x->{
				   System.out.println("Map Called");
			               return x.substring(0,3);
			})
			
			.count();
	
	System.out.println(c1);

	}

}
