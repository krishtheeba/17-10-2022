package day4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class User{
	String name;

	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class peekEx {

	public static void main(String[] args) {

		// 1. peek -> to Debugging
		Stream<String> s = Stream.of("One","two","Three");
		List<String> res =
		s.filter(e-> e.length()>3)
		.peek(e-> System.out.println("Filtered Value :" +e))
		.map(String::toUpperCase)
		.peek(e-> System.out.println("Mapped Value :" +e))
		.collect(Collectors.toList());
		
		res.forEach(x-> System.out.println(x));
		System.out.println(res);// toString of List
		
		
		//2. alter inner state of element
		List<User> sl = List.of(new User("Hari"),new User("Samanth"),new User("Prince"),new User("Raghav"));
		Stream<User> s1 = sl.stream();
		List<User> res1 =
		 s1.peek(e->e.setName(e.getName().toLowerCase()))
		.collect(Collectors.toList());
		
		res1.forEach(x-> System.out.println(x.getName()));
		
		sl.forEach(x-> System.out.println(x.getName()));
			
	}

}
