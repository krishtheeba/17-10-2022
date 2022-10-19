package day3;

import java.util.ArrayList;
import java.util.Comparator;

class Employee<T> implements Comparable<T>{
	String name;
	int id;
	int ranking;
	int age;
	
	public Employee(String name, int id) {
		
		this.name = name;
		this.id = id;
	}
	
	
	
	public Employee(String name, int id, int ranking, int age) {
		super();
		this.name = name;
		this.id = id;
		this.ranking = ranking;
		this.age = age;
	}



	@Override
	public int compareTo(T o) {
		Employee temp = (Employee) o;
		return Integer.compare(temp.age,this.age);
	}
	
}

class ComparatorImple implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.ranking, o2.ranking);
	}
	
}

public class EmployeeEx {

	public static void main(String[] args) {
		ArrayList<Employee> person = new ArrayList<>();
		
		person.add(new Employee("Theeba",123,22,44));
		person.add(new Employee("Shanthi",987,14,29));
		person.add(new Employee("Vinod", 442, 6, 55));
		
		//System.out.println(e1.compareTo(e2)>0 ? "e1 younger than e2" :"e1 older than e2");
		
		System.out.println("List Created");
		System.out.println("Name\t Age\t Ranking");
		person.forEach(x-> System.out.println(x.name + " " + x.age + " "+ x.ranking));
		

		System.out.println();
		
	// 1. named class imple for comparator interface(SAM)-fn i/f
		System.out.println("Name\t Age\t Ranking");
		person.forEach(x-> System.out.println(x.name + " " + x.age + " "+ x.ranking));
		System.out.println();
		System.out.println("Comparison Based on Ranking");
		ComparatorImple obj = new ComparatorImple();
		person.sort(obj);	// based on ranking	
		person.forEach(x-> System.out.println(x.name + " " + x.age + " "+ x.ranking));
		
		person.forEach(x->System.out.println(x.age+100));
		person.forEach(x-> System.out.println(x.name + " " + x.age + " "+ x.ranking));
		// list.sort(obj)
 // 2. lambda exp
		System.out.println("Comparison on Age");
		person.sort((x,y)->Integer.compare(x.age,y.age));
		person.forEach(x-> System.out.println(x.name + " " + x.age + " "+ x.ranking));

	// 3. method ref
	//	System.out.println("Comparison on Ranking");
	
		/*
		 * (parameter)-> {statements}
		 * 
		 * Consumer<T>- only i/p, no o/p
		 * Function<T,U>- accepts 1 i/p, return 1 value
		 * Supplier<U>- no i/p, only values generated
		 * Predicate<T> - returns boolean value
		 * 
		 * argument to a method
		 * 
		 * 
		 * 
		 * method(value)
		 * 
		 * method(behavior as an agument)--> lambda exp and predefined functionali/f
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
