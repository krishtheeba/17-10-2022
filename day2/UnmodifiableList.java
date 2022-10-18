package day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableList {

	public static void main(String[] args) {


		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		
		List<Integer> newList = Collections.unmodifiableList(list);// Not Immutable list
		System.out.println("Before add : " +newList);
	//	newList.add(50); //UnSupportedOperationException
		System.out.println("After add : " +newList);
		list.add(100);
		System.out.println("After add in original list : " +newList);
		
		
		// Immutable - List.copyof()------->
		System.out.println("Immutable list");
		List newList1 = List.copyOf(list);
	//	newList1.add(200);  //UnSupportedOperationException
		System.out.println("Before add in original list : " +newList);
		list.add(60);
		System.out.println("After add in original list : " +newList1);
		
		List newList2 = List.of(list);
		System.out.println(newList2 == list ? "Same" : "Diffrent");
		System.out.println("Before add in original list : " +newList2);
	//	newList2.add(90);
		list.add(5000);
		System.out.println("After add in original list : " +newList2);

	}

}
