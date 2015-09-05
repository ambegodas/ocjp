/**
 * @autor pathmasri
 * May 6, 2015 7:44:27 AM
 */
package com.sample.innerclasses;

public class OuterForReguler {
	
	private int x = 7;
	
	class MyInner {
		
		private int x = 3;
		public void seeOuter() {
		System.out.println("Outer x is " + this.x);
		}
		}

}
