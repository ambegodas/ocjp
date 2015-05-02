/**
 * @autor pathmasri
 * Mar 6, 2015 6:22:26 PM
 */
package com.sample.strings;

public class DemoStringCreation {
	
	public static void main(String[] args){
		
		String s1 = "Pathmasri";
		
		// New String will not be created because "Pathmasri" is already there in the string pool
		
		String s2 = "Pathmasri";
		
		//New object will be created regardles of the pool with new key word
		String s3 = new String("Pathmasri");
	}

}
