package day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class tryCatchFinally {

	public static void main(String[] args)  {
		
	//	Scanner scanner=null;
	/*	
		try {
			scanner= new Scanner(new File("C:\\Users\\Theeba\\git\\17_10_22\\SE2_17Oct22\\src\\day2\\sampl.txt"));
			while(scanner.hasNext()) {
				System.out.println(scanner.next());
			}
		}
		finally {
		try{
			if(scanner!=null) scanner.close();}catch(IOException e){e.printStackTrace();}
		}
		
			// try-> finally
			 * 
			 * */
	// try with single resource	
		/*
		try {
			scanner= new Scanner(new File("C:\\Users\\Theeba\\git\\17_10_22\\SE2_17Oct22\\src\\day2\\sampl.txt"));
			while(scanner.hasNext()) {
				System.out.println(scanner.next());
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			if(scanner!=null) scanner.close();
		}
		*/
	// try with resource
	/*	
		try(Scanner scanner= new Scanner(new File("C:\\Users\\Theeba\\git\\17_10_22\\SE2_17Oct22\\src\\day2\\sampl.txt"))){
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// no need to close resource
		
	*/	
	// try with multiple resource
		
	/*	try(Scanner scanner= new Scanner(new File("C:\\Users\\Theeba\\git\\17_10_22\\SE2_17Oct22\\src\\day2\\sample.txt"));
				PrintWriter  pw = new PrintWriter(new File("C:\\Users\\Theeba\\Desktop\\sampleOut.txt"))){
			while(scanner.hasNext()) {
				pw.write(scanner.nextLine());
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// no need to close resource
		
		*/
	// try construct
		String s=null;
		Scanner scanner=null;
		try{
			scanner = new Scanner(new File("C:\\Users\\Theeba\\git\\17_10_22\\SE2_17Oct22\\src\\day2\\sample.txt"));
			
			while(scanner.hasNext()) {
					s= s+scanner.nextLine();			
				}
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			scanner.close();
		}
		PrintWriter  pw=null;
		try{
			
			pw = new PrintWriter(new File("C:\\Users\\Theeba\\git\\17_10_22\\SE2_17Oct22\\src\\day2\\sample.txt"));
			
					
				pw.write(s+"Updated");
				
			
			
	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally { pw.close();}
		//jvm---> os
		//write--> symcalll-> kernel-> harddisk
		//sample.txt
		//close()--> buffer->
		
		
	}

}
