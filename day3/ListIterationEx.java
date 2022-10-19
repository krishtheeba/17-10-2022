package day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListIterationEx {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		
		Iterator<Integer> iter = list.listIterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		
		Iterator<Integer> iter1 = list.listIterator();
		Integer i;
		while(iter1.hasNext()) {
			i= iter1.next();
			if(i==20)list.remove(i);
		}
			System.out.println(list);
			
		List<String> list2 = new ArrayList(Arrays.asList("hello","hai","Welcome"));	
			Iterator<String> iter2 = list2.listIterator();
			String s;
			while(iter2.hasNext()) {
				s= iter2.next();
				if(s.equals("hai")) iter2.remove();// support
				// list.remove()---> concurrentModificationException--> Failfast 
			}
				System.out.println(list2);
				
				
		for(String element : list2)
			list2.remove(element);
		System.out.println(list2);
		
	}

}
