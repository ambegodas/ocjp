/**
 * @autor pathmasri
 * Apr 24, 2015 11:10:33 AM
 */
package com.sample.casting;

public class DemoCasting {
	
	public static void main(String[] a){		
		checkNullCastin();				
	}
	
	public static void checkNullCastin(){
		Object obj = null;		
		Integer i = (Integer)obj;	
		System.out.print("Cast : " + i);
	}

}
