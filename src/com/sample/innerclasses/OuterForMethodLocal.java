/**
 * @autor pathmasri
 * May 6, 2015 7:50:21 AM
 */
package com.sample.innerclasses;

public class OuterForMethodLocal {

	private String x = "Outer2";

	void doStuff() {
	 final	String z = "localvariable";
		class MyInner {
			public void seeOuter() {
				System.out.println("Outer x is " + x);
				System.out.println("Local variable z is " + z); // Won't
																// Compile!
			} // close inner class method
		}
		
		MyInner mi = new MyInner();
		mi.seeOuter();
		// close inner class definition
	}
	// close outer class method doStuff()

}
