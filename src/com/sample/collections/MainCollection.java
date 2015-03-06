/**
 * @autor pathmasri
 * Aug 16, 2014 7:34:46 PM
 */
package com.sample.collections;

import java.util.HashSet;
import java.util.Set;

public class MainCollection {

	public static void main(String[] args){
		testSet();
	}

	
	public static void testSet(){
		
		Set<Student> testHashSet = new HashSet<Student>();
		Student s = new Student("Pathmasri", 1);
		Student s1 = new Student("Pathmasri",1);
		
		
		testHashSet.add(s);
		testHashSet.add(s1);
		
		for(Student st: testHashSet){
			System.out.println(st.getName());
		}
	}
	
}


