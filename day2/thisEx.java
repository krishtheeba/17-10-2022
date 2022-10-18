package day2;
class A{
	int i;
	
	public A(int i) {
		this.i=i; // 0=0
	}
	void p() {
		System.out.println("Parent imple");
	}
	private void m3() {
		System.out.println("m3");
	}
}

class B extends A{
	int j; //10,100
	public B(int j,int i) {
	//	System.out.println("gee");
		super(i);// first line
		this.j=j;
	}
	
	void m1() {
		System.out.println("some");
		super.p();
	}
	void p() {
		System.out.println("Child Imple");
	}
	
	public void m3() {
		System.out.println("m3"); // 
	}
}
public class thisEx {

	public static void main(String[] args) {
		B obj = new B(10,100);
		System.out.println(obj.i);
		System.out.println(obj.j);
		
		obj.p();//child
		obj.m1();

	}

}
