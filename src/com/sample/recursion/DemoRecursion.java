/**
 * @autor pathmasri
 * Aug 1, 2015 4:51:55 PM
 */
package com.sample.recursion;

public class DemoRecursion {
	
	public static void main(String[] args){

	}
	
	private static int fib(int n){
		if(n<=1){
			return n;
		} else {
			return fib(n -1) + fib(n-2);
		}
		
	}

}
