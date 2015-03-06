/**
 * @autor pathmasri
 * Mar 6, 2015 1:07:29 PM
 */
package com.sample.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {


	@Override
	public int compare(Student o1, Student o2) {
		
		String name1 = o1.getName();
		String name2 = o2.getName();		
		return name1.compareTo(name2);
	}

}
