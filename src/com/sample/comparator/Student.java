/**
 * @autor pathmasri
 * Mar 6, 2015 9:33:35 AM
 */
package com.sample.comparator;

public class Student {

	private String name;
	private int studentId;
	
	public Student(String name, int studentId){
		this.name = name;
		this.studentId = studentId;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the studentId
	 */
	public int getStudentId() {
		return studentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


}
