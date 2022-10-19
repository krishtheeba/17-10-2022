package day3;

import java.util.HashMap;
import java.util.Hashtable;

public class MapEx {

	public static void main(String[] args) {


		// 
		HashMap<Integer,String> hm = new HashMap<>();
		// (k,v)--> item
		//k--> v
		//k should be unique
		// allows null 
		hm.put(1,"Hello");
		hm.put(2,"Safety");
		
		hm.put(null,"Hari");// null as key
		hm.put(null, null); // null as key and value
		
		Hashtable<Integer,String> ht = new Hashtable<>();
		// (k,v)--> item
		//k--> v
		//k should be unique
		// null as key not allowed
		ht.put(1,"Hello");
		ht.put(2,"Safety");
		
	//	ht.put(null,"Hari");
		
		//====================
	}

}
