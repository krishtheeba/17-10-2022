package day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListCreation {

	public static void main(String[] args) {
	
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		
		List<String> slist = Arrays.asList("a","b","c"); // an anonymous array
	//	List<String> slist1 = Arrays.asList(new String[]{"a","b","c"}); 
		System.out.println(slist);
		
		
		list.add(40);
		//slist.add("Theeba");// UnSupportedOperationException
		
		System.out.println(list);
		System.out.println(slist);
		
		List<String> slist1 = new ArrayList<>(Arrays.asList("a","b","c"));
		slist1.add("Hai");
		System.out.println(slist1); // dynamic
		
		ArrayList<String>  l = new ArrayList<>();
		
		Collections.addAll(l,"a","b","c" );
		System.out.println(l);
		
		// 4. stream
		l.stream().map(x->x+":Hello").collect(Collectors.toList());
		
		
		
	}

}
