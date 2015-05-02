/**
 * @autor pathmasri
 * Apr 17, 2015 9:29:50 AM
 */
package com.sample.scanner;

import java.util.Scanner;

public class ScannerDemo {
	
	public static void main(String[] t){
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("what is the age? ");
		
		System.out.println(s.nextInt());
		
	}

}
