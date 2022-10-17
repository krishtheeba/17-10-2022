package day1;


class Employee{
	public String name="Theeba"; // Default- access - package-specific access
	// pkg-> no. of classes-> 
	
	//private String DOB="12/10/1988";
	protected String DOB="12/10/1988"; // visible only to the child class
	// DOB- within Employee
	
	
	/*
	 * accessSpecifier returnType methodName(parametr){
	 * 
	 * statement
	 * }
	 */
	
	public void display() {
		System.out.println("NAME :"+ this.name);
		System.out.println("DOB :" + this.DOB);
		
	}
	final public void SayHello() {}// restricts method overriding
}

class Manager extends Employee{
	// child class inherits parent class-- methods, fields not constructor 
	public double salary;//0.0- Wrapper
	public void display() {
		System.out.println("SALARY :" +  this.salary);
	}
	
	public void SayHello() {
		
	}
}


public class Driver{
	
	public static void show() {
		System.out.println("SHOW");
	}
	
	
	public static void main(String args[]) {
		Manager obj = new Manager();// child obj, Child refvar
		obj.display();
		Employee obj1= new Manager(); // child obj , parent refvar // implicit typecasting done -upcast
		// only parent fields
		Manager m2= (Manager)obj1;
	 // access child feature
		// method overriding->same signature
		Manager m1= (Manager)new Employee();// downcast not implicit
	
		
	}
}