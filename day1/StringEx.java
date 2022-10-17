package day1;
class Sample{
	int i=100;
}
public class StringEx {

	public static void main(String[] args) {
		
		String s1= new String("Hello");
	//	String s2= new String("Hello");
		String s3= "Hello";
		String s4= "Hello";
		if(s3==s4)
			System.out.println("Stored as same objects");
		else
			System.out.println("Diffrent objects");
		
		System.out.println(s1);
		Sam s= new Sam();
		System.out.println(s);
		
		// hashcode()--> Object class
		
		// toString()--> Object class
		
		// Class.getClass().getName()+ "@" + Integer.toHesString(this.hashcode())
		
	}

}
