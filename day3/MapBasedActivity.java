package day3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapBasedActivity {

	public static void main(String[] args) {
		
		try(BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Users\\Theeba\\git\\17_10_22\\SE2_17Oct22\\src\\config.log")));
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("C:\\Users\\Theeba\\git\\17_10_22\\SE2_17Oct22\\src\\newconfig.log")))){			
		
			Map<String,String> map = new HashMap<>();
			String line;
			while((line=br.readLine())!=null)//Interface=eth0==> {Interface,eth0}==>0 index, 1 index
				map.put(line.split("=")[0],line.split("=")[1]); // map.put(K,V)
			
			
			map.replace("Interface","eth1");
			map.replace("onboot", "none", "true");
			
			List<String> l= new ArrayList<>();
			Iterator<String> iter;
			
			map.forEach((k,v)-> l.add(k+"="+v));
			while((iter=l.listIterator()).hasNext())
				bw.write(iter.next());
			
		}catch(FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
