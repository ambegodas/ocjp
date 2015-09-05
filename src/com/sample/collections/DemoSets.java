/**
 * @autor pathmasri
 * Aug 16, 2014 7:34:46 PM
 */
package com.sample.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoSets {

	public static void main(String[] args){
		//testHashSet();
		//testLinkedHashSet();
		testTreeSet();
		
	}

	/*
	 * No duplicates, No ordering, Fast access
	 * To have no duplicates, you need to implement hascode and equals methods
	 * 
	 */
	public static void testHashSet(){
		
		Set<Student> testHashSet = new HashSet<Student>();
		Student s =  new Student("Pathmasri", 1);
		Student s1 = new Student("Pathmasri1",1);		
		testHashSet.add(s);
		testHashSet.add(s1);
		
		for(Student st: testHashSet){
			System.out.println(st.getName());
		}
		
		Iterator<Student> it = testHashSet.iterator();
		while(it.hasNext()){
			System.out.println(it.next().getName());
		}
		
	}
	
	/*
	 * No duplicates. Iterates using insertion order.
	 * 
	 * 
	 */
	private static void testLinkedHashSet(){
		
		Set<Student> testLinkedHashSet = new LinkedHashSet<Student>();
		Student s =  new Student("Pathmasri", 1);
		Student s1 = new Student("Pathmasri1",1);	
		Student s2 = new Student("Pathmasri2",1);
		Student s3 = new Student("Pathmasri3",1);
		Student s4 = new Student("Pathmasri4",1);
		testLinkedHashSet.add(s);
		testLinkedHashSet.add(s2);
		testLinkedHashSet.add(s3);
		testLinkedHashSet.add(s4);
		testLinkedHashSet.add(s1);
		
		Iterator<Student> it = testLinkedHashSet.iterator();
		while(it.hasNext()){
			System.out.println(it.next().getName());
		}
	}
	
	/*
	 * You need to implement the comparable or comparator interface to add elements 
	 * to TreeSet. Sorting will be done base on the implemented compare method
	 * 
	 */
	
	private static void testTreeSet(){
		TreeSet<Student> testTreeSet = new TreeSet<Student>();
		Student s2 = new Student("Pathmasri2",1);
		Student s3 = new Student("Pathmasri3",2);
		Student s4 = new Student("Pathmasri4",3);
		Student s =  new Student("Pathmasri", 4);
		Student s1 = new Student("Pathmasri1",5);	
		
		
		testTreeSet.add(s3);
		testTreeSet.add(s4);
		testTreeSet.add(s);
		testTreeSet.add(s1);
		testTreeSet.add(s2);
		
		
		
		Iterator<Student> it = testTreeSet.iterator();
		while(it.hasNext()){
			System.out.println(it.next().getName());
		}
		
	}
	
}


