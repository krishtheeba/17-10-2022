package day1;

import java.util.ArrayList;
import java.util.List;

class Animal{
	public void eat() {
		System.out.println("Animal eats");
	}
}

class Cat extends Animal{
	
	public void eat() {
		System.out.println("Cat eats");
	}
	
	public void meow() {
		System.out.println("Cat meow");
	}
}


public class castingDriver {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		cat.eat();
		cat.meow();
		
		Animal animal = cat;// upcast
		animal = (Animal) cat; // downcast
		
		List<Animal> animals = new ArrayList<>();
		
		animals.add(new Cat());
		
		animals.add(new Animal());
		
		
		//animals.foreach() -->iterate over elements
		
		animals.forEach(a-> {a.eat();
		if( a instanceof Cat)
		((Cat)a).meow();
		});
		
		

	}

}
