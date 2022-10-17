package day1;

class Parent{
	static {
		System.out.println("Static :Parent");
	}
	
	{
		System.out.println("Nonstatic : Parent");
	}
}

class Child extends Parent{
	static {
		System.out.println("Static :Child");
	}
	
	{
		System.out.println("Nonstatic : Child");
	}
}

public class staticBlockEx {

	public static void main(String[] args) {
	
		Child c= new Child();
		//Parent p = new Parent();
	}

}
