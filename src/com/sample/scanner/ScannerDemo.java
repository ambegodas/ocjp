/**
 * @autor pathmasri
 * Apr 17, 2015 9:29:50 AM
 */
package com.sample.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo {
	
	public static void main(String[] t){
		
	   //test2();
		
		test1();
		
	}
	
	 private static void test2(){
			Scanner s = new Scanner(System.in);
			
			System.out.println("what is the age? ");
			
			System.out.println(s.nextInt());
	 }
	
	private static void test1(){

		File f = new File("/home/pathmasri/workspace/ocjp/src/com/sample/scanner/test.txt");
		try {
			Scanner sc = new Scanner(f);
			sc.nextLine();
			while(sc.hasNext()){
				
				System.out.println(sc.nextInt());
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
