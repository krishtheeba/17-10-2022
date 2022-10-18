package day2;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		
		
		Set<String>  treesetImp = new TreeSet<>();
		treesetImp.add("Mercury");
		treesetImp.add("Venus");
		treesetImp.add("Jupiter");
		treesetImp.add("Earth");
		
		System.out.println(treesetImp);
		
		/*
		Set<String>  treesetImp = new TreeSet<>(Comparator.comparing(String::length));
		treesetImp.add("Mercury"); //7
		treesetImp.add("Venus"); // 5
		treesetImp.add("Jupiter"); //7
		treesetImp.add("Earth"); //5
		
		System.out.println(treesetImp);
*/
	}

}
