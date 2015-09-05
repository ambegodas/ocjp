/**
 * @autor pathmasri
 * May 6, 2015 7:35:42 AM
 */
package com.sample.innerclasses;

public class InnerClassesDemo {
	
	public static void main(String args[]){
		
		testMethodLocalInnerClasses();
		
	
	
	}
	
	private static void testRegulaInnserClasses(){
		
		OuterForReguler outer = new OuterForReguler();
		
		OuterForReguler.MyInner inner = outer.new MyInner();
		
		String s = "test";
		
		
		
		inner.seeOuter();
	}
	
	private static void testMethodLocalInnerClasses(){
		OuterForMethodLocal outer = new OuterForMethodLocal();
		outer.doStuff();
	}
	
	class A {}

}
