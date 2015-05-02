/**
 * @autor pathmasri
 * Mar 6, 2015 6:13:16 PM
 */
package com.sample.strings;

public class DemoImmutability {
	
	public static void main(String[] args){
		
		String s = "durga";
		s.concat("software");
		System.out.println(s);
		//New object called "durgasoftware will be created. But S will points to the same object"
		
		StringBuilder sb = new StringBuilder("durga");
		sb.append("software");
		System.out.println(sb);
		//Same object will be modified. Not mutable
	
	}

}

