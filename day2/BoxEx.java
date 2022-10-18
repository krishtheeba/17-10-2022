package day2;

import java.util.ArrayList;
import java.util.List;

class Box<T>{
	
	private T t;
	
	public void setData(T t) {
		this.t =t;
	}
	
	public T getData() {
		return this.t;
	}
	
}

class BoxDemo{

static <U>	void inputBox(U element, ArrayList<Box<U>> list) {
		Box<U> obj = new Box<>();
		obj.setData(element);
		list.add(obj);
	
	}

static <U>	void OutputBox(ArrayList<Box<U>> list) {
	
	for( Box<U> obj : list) {
		U content = obj.getData();
		System.out.println("Box :" + content);
	}

}

	
}
/*
 * T---> Object
 * java compilation 
 */


public class BoxEx {

	public static void main(String[] args) {
		Box<String> box1 = new Box<String>(); // Valid
		
		box1.setData("Three");
		box1.setData("Four");
		
		Box<Integer> box2 = new Box<>();// valid
		box2.setData(11);
		box2.setData(33);
		
	/*	
		List l= new ArrayList();
		l.add(10);
		
		l.add("String");
		
		// generic prog
		List<String> l1= new ArrayList<>();
		l1.add("hello");
	//	l1.add(10);
		
	*/	//----------------------------------
		
		ArrayList<Box<String>> slist = new ArrayList<>();
		BoxDemo.inputBox("Hello1", slist);
		BoxDemo.inputBox("Hello2", slist);
		BoxDemo.inputBox("Hello3", slist);
		BoxDemo.inputBox("Hello4", slist);
		
		slist.
		
		BoxDemo.OutputBox(slist);
		
		

		ArrayList<Box<Integer>> ilist = new ArrayList<>();
		BoxDemo.inputBox(10, ilist);
		BoxDemo.inputBox(20, ilist);
		BoxDemo.inputBox(30, ilist);
		BoxDemo.inputBox(40, ilist);
		
		BoxDemo.OutputBox(ilist);
		
		
	}

}
