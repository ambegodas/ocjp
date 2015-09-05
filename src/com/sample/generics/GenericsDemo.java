/**
 * @autor pathmasri
 * May 5, 2015 1:49:47 PM
 */
package com.sample.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class GenericsDemo {
	
	public static void main(String args[]){
		testGenericClass();	
		List<Integer> test =  testReturnTypes(new ArrayList<Integer>());
		
		List<Integer> a = new ArrayList<>();
	
		
		
	}
	
	  private static void testGenericClass(){
		    T<Long> t1 = new T<Long>();
			t1.number1 = 100L;
			t1.number2 = 400L;		
			int sum = t1.addNumbers();	
			
			T<Integer> t2 = new T<Integer>();
			t2.number1 = 100;
			t2.number2 = 400;
			System.out.print(t2.addNumbers());
	  }
	  
	  private static List<Integer> testReturnTypes(List<Integer> numbers){
		  
		  ArrayList<Integer> test = new ArrayList<Integer>();
		  
		return test ;
		  
	  }

}
