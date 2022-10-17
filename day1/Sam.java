package day1;

interface i1{ // default specfic
	void m1();// abstract method
	default void m3() {
		System.out.println("Default imple");
	}
	
	static void m4() {
		System.out.println("Static method Imple");
	}
	
}


public class Sam implements i1{

	public static void main(String[] args) {
		Sam obj= new Sam();
		obj.m1();
		obj.m3();
		
		i1.m4();// static method invocation of an interface // interfaceName.staticMethodname()
	}

	@Override
	public void m1() {
		System.out.println("m1 imple");
		
	}

	public void m3() {
		System.out.println("Override Default imple");
	}
}
