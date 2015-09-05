/**
 * @autor pathmasri
 * May 3, 2015 10:52:13 PM
 */
package com.sample.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

	public static void main(String arngs[]) {
		//test1(); //basic regex
		
		//test2(); //matcher will not re use the match already found
		
		//test3(); // Search for digits. using \d....
		
		//test4(); // Search for word characterns. Letters, digits or underscore. \\w
		
	     // test5(); // Seatch for characters in a range. [a-f], [A-F]
		
		//test6(); // Search using quantifiers. + one or more characters
		 
		//test7(); //
		
		test10();
	
	
	}
	
	private static void test1(){
		Pattern p = Pattern.compile("ab");
		// the expression
		Matcher m = p.matcher("abaaaba");
		// the source
		while (m.find()) {
			System.out.print(m.start() + " ");
		}
	}
	
	private static void test2(){
		Pattern p = Pattern.compile("aba");
		Matcher m = p.matcher("ababababa"); 
		// this will return 0 and 4. Text starting from index 2 will not be taken as match.
		//		
		 while(m.find()){
			System.out.println(m.start()); 
		 }
	}
	
	private static void test3(){
		Pattern p = Pattern.compile("\\d");
		Matcher m = p.matcher("a12c3e456f");
		
		 while(m.find()){
				System.out.println(m.start()); 
			 }
	}
	
	private static void test4(){
	
		Pattern p = Pattern.compile("\\w");
		Matcher m = p.matcher("a 1 56 _Z");
		
		 while(m.find()){
				System.out.println(m.start()); 
			 }
	}
	
	private static void test5(){
		//Pattern p = Pattern.compile("[a-f]");  // characters from a to f, small case
		//Pattern p1 = Pattern.compile("[A-F]"); // characters from A to F upper case
		Pattern p2 = Pattern.compile("[a-fA-F]"); //Any case
		Matcher m = p2.matcher("Aabcdehfjslfjsl");
		
		while(m.find()){
			System.out.println(m.start()); 
		 }		
	}
	
	private static void test6(){
		Pattern p = Pattern.compile("0[xX][0-9a-fA-F]");
		Matcher m = p.matcher("12 0x 0x12 0Xf 0xg");
		
		while(m.find()){
			System.out.println(m.start()); 
		 }
	}
	
	private static void test7(){
		Pattern p = Pattern.compile("0[xX]([0-9a-fA-F])+");
		Matcher m = p.matcher("12 0x 0x12 0Xf 0xg423423424");
		
		while(m.find()){
			System.out.println(m.start()); 
		 }
		
	}
	
	private static void test8(){
		Pattern p = Pattern.compile("proj1([^,])*"); // To find strings starting with proj1
		Pattern p1 = Pattern.compile("x[^abc]");
		Matcher m = p1.matcher("proj3.txt,proj1sched.pdf,proj1,proj2,proj1.java");
		
		while(m.find()){
			System.out.println(m.start()); 
		 }
	}
	
	private static void test9(){
		Pattern p = Pattern.compile("a.c");  // dot is to represent any character
		Matcher m = p.matcher("ac abc a c"); 
		
		while(m.find()){
			System.out.println(m.start()); 
		 }
	}
	
	private static void test10(){
		
		Pattern p = Pattern.compile("\\d*");
		Matcher m = p.matcher("");
		boolean b = false;
		while(b = m.find()) {
		//System.out.print(m.start() + m.group());
		System.out.print(m.start());
		}
	}
	
	private static void ipValidator(String ip){
		 System.out.println("ip".matches("(((0{0,2}[0-9])|(0{0,1}[0-9][0-9])|(1[0-9][0-9])|(2[0-5][0-5])).){3}((0{0,2}[0-9])|(0{0,1}[0-9][0-9])|(1[0-9][0-9])|(2[0-5][0-5]))"));
	}
	

}


