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
		//New object called "durgasoftware will be created. But s will point to the same object"
		
		StringBuilder sb = new StringBuilder("durga");
		sb.append("software");
		System.out.println(sb);
		//Same object will be modified. Not mutable
		
		A a1 = new A();
		a1.a = 1;
		
		A a2 = a1;
		
		//a1 = new A();
		a1.a = 5;
		
		System.out.println(a2.a);
		
		
	
	}
	


}

class A{
	int a;
}
