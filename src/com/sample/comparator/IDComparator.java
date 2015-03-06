/**
 * @autor pathmasri
 * Mar 6, 2015 1:27:59 PM
 */
package com.sample.comparator;

import java.util.Comparator;

public class IDComparator implements Comparator<Student> {


	@Override
	public int compare(Student o1, Student o2) {
		return o1.getStudentId()-o2.getStudentId();
	}

}
