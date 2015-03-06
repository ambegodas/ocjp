/**
 * @autor pathmasri
 * Mar 6, 2015 1:30:41 PM
 */
package com.sample.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class DemoComparator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Student s1 = new Student("A",1);
		Student s2 = new Student("B",2);
		Student s3 = new Student("C",3);
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(s2);
		students.add(s1);
		students.add(s3);
		
		String[] studentsArray = new String[3];
		
		//Arrays.sort(studentsArray,new IDComparator());
		
		Collections.sort(students,new NameComparator());

	}

}
