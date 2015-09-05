/**
 * @autor pathmasri
 * May 3, 2015 9:04:24 PM
 */
package com.sample.assertrion;

public class AssertDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int x =2;	
		try {
			assert(x<0);
			
		} catch(Error e){
		 System.out.println("assert error");
		}		
		System.out.println("assert error2");

	}

}
