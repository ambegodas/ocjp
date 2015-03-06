/**
 * @autor pathmasri
 * Mar 6, 2015 12:20:18 PM
 */
package com.sample.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {
	
	public static void main(String[] args){
		
		Student s1 = new Student("A",1);
		Student s2 = new Student("B",2);
		Student s3 = new Student("C",3);
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(s2);
		students.add(s1);
		students.add(s3);
		
		
		Collections.sort(students);
		
		for (Student s: students){
			
			System.out.println(s.getStudentName());
		}
		
	}

}
