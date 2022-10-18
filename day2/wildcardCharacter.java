package day2;

import java.util.ArrayList;

class Parent{}

class c1 extends Parent{}

class c2 extends c1{}

class c3 extends c2{}

class c4 extends c3{}
/* Multilevel inheritance
P
|
c1
|
c2
|
c3
|
c4

*/


class Container< T extends Parent>{
	
	public void show(ArrayList<? extends c2 > obj) {}// upperbound- c2 or its subcls obj acceptable as type
	
	public void display(ArrayList<? super c2> obj) {}// lowerblound - c2 or its parent cls objects as type
	
}

public class wildcardCharacter {

	public static void main(String[] args) {
	
		Container<Parent> p = new Container<>();
		Container<c1> oc1 = new Container<>();
		Container<c3> oc3 = new Container<>();
		
		p.display(new ArrayList<Parent>());//c2,c1,Parent
		
		p.show(new ArrayList<c4>());  //c2,c3,c4
	}

}
