package day1;

import java.util.function.Function;

public class AnonymousClassEx {

	public static void main(String[] args) {

		i1 intRef= new i1() {

			@Override
			public void m1() {
				System.out.println("Display imple");
				
			}
			
		};
		// Anonymous inner class imple of Functional interface
		MyInterface intRef2 = new MyInterface() {
			
			@Override
			public int m2(int i) {
				return ++i;
			}
		};
		
		
		intRef.m1();
		System.out.println(intRef2.m2(10));
		//marker interface
		/* class A implement Cloneable{
		 * 	int i1=0;
		 * int i2=90;
		 * Employee e= new Employee();
		 * }
		 * 
		 * A o1 = new A();
		 * A o2 = o1.clone();----> A o2=o1;
		 * 
		 * 
		 */
		
		
		// Functional Interface
		//--> SAM 
		// |implement with Anonymous inner class
		// java.util.Function pkg------> no.of predefined FunctionalInterfaces
		
		//LAmbda exp
		
			//       syntax:-
			//				arg-> statements;
			//   (args)-> {statements};	
			//  Anonymous method
		
		 /* returnType methodName (arg){
			statements;
			}
			
		*/
		
		Function<Integer,Integer> ref = x-> ++x;
		// 1. making use of predefined Functional interface java.util.function. No need of MyInterface code
		// 2. implemented with lambda ex. so no need of Anonymous inner class
		
		
		System.out.println(ref.apply(10));
		
		
		Function<String,String> strRef = x->{System.out.println("inside lambda"); return x.toUpperCase();};
		
		System.out.println(strRef.apply("oracle"));
		
		// method reference way
		
		/* syntax 
					objectname :: Instancemethod    // instance method
					x::toUpperCase
					
					ClassName :: staticMethodName
					
					String :: copyValueOf()
					
					String.copyValueOf(x);
					
		
		
		
		*/
		
		char c[] = {'a','e','i','o','u'};
		Function<char[], String> r= x-> String.copyValueOf(x);   // Lambda Exp way 
		
		Function<char[],String> rMethodRef = String::copyValueOf; // Method Ref way
		
		System.out.println(r.apply(c));
		
		System.out.println(rMethodRef.apply(c));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 
		
	}

}
