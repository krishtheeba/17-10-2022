package day2;

class MyResource1 implements AutoCloseable{

	
	public MyResource1() {
		System.out.println("Constructor->MyResource1 ");
	}
	
	public void some() {
		System.out.println("Operation-> MyResource1");
	}
	@Override
	public void close() throws Exception {
		System.out.println("MyResource1--> Closing");
		
	}
	
}

class MyResource2 implements AutoCloseable{

	
	public MyResource2() {
		System.out.println("Constructor->MyResource2 ");
	}
	
	public void some() {
		System.out.println("Operation-> MyResource2");
	}
	@Override
	public void close() throws Exception {
		System.out.println("MyResource2--> Closing");
		
	}
	
}
class MyResource3 implements AutoCloseable{

	
	public MyResource3() {
		System.out.println("Constructor->MyResource3 ");
	}
	
	public void some() {
		System.out.println("Operation-> MyResource3");
	}
	@Override
	public void close() throws Exception {
		System.out.println("MyResource3--> Closing");
		
	}
	
}

public class CustomResourceEx {

	public static void main(String[] args) throws Exception {
		try(MyResource1 obj1 = new MyResource1();MyResource2 obj2 = new MyResource2();MyResource3 obj3 = new MyResource3();){
			obj1.some();
			obj2.some();
			obj3.some();
			
			//opened first resource closed at last 
		}
		

	}

}
