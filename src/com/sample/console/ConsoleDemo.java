/**
 * @autor pathmasri
 * May 5, 2015 2:17:22 AM
 */
package com.sample.console;

import java.io.Console;

public class ConsoleDemo {
	
	public static void main(String a[]){
		Console c = System.console();
		String u = c.readLine("%s", "username: ");
		System.out.println("hello " + u);
		char[] pw;
		if(c != null && (pw = c.readPassword("%s", "password: ")) != null){
			
		}
	}
	
	

}
