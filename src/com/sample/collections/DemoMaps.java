/**
 * @autor pathmasri
 * May 5, 2015 11:13:40 AM
 */
package com.sample.collections;

import java.util.Arrays;
import java.util.SortedMap;
import java.util.TreeMap;

public class DemoMaps {

	public static void main(String a[]){
		 testTreeMap();
	}
	
	private static void testTreeMap(){
		TreeMap<String, String> myMap = new TreeMap<String, String>();
		myMap.put("a", "apple"); myMap.put("d", "date");
		myMap.put("f", "fig"); myMap.put("p", "pear");
		
		System.out.println(myMap.higherKey("f"));
		System.out.println(myMap.ceilingKey("f"));
		System.out.println(myMap.floorKey("f"));
		SortedMap<String, String> sub = new TreeMap<String, String>();
		sub = myMap.tailMap("f");
		System.out.println(sub.firstKey());
		
		
		
		
	}
}
