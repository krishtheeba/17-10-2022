package day4;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierEx {


	public static void main(String[] args) {
		
		// Supplier - doesnot accept any value, return value
	// infinite stream of objects	
	/*	
		final i=10;
		int f1=0; 
		int f2= 1; // effective final-> var immutable
		Stream.generate(()->{
	
			int r=f2; // 
			int f3= f1 + f2;   
			f1 = f2;
			f2 = f3;
			System.out.println("return "+ r);
			return r;
		})// 
		.collect((Collectors.toList())) // List
		.forEach(x->System.out.println(x));
		
		// variables used inside lambda exp should be final/ effectively final
		
		
	*/
		
		//mutable obj-> using local var in enclosed scope inside my lambda exp
		
		int[] f = {0,1}; // f0x11(ox22f) ---->0x22f[0](33)
		Stream.generate(()->{
			
			int r=f[1];
			int f3= f[0] + f[1];
			f[0] = f[1];
			f[1] = f3;
			System.out.println("return "+ r);
			return r;
		})
		.limit(10)
		.collect((Collectors.toList())) // List
		.forEach(x->System.out.println(x));
		
		
		Stream.iterate(0, x->x+2)
		.limit(10);
		
		Stream.iterate(0, i-> i<100, i->i+2)
		.collect(Collectors.toList())
		.forEach(x->System.out.println(x));
		
		
		
		
// 0 1 1 2 3- fibonacci
	}

}
