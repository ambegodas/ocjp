/**
 * @autor pathmasri
 * Mar 6, 2015 12:15:43 PM
 */
package com.sample.comparable;

public class Student implements Comparable<Student> {
	
	private int studentID;
	private String studentName;
	
	

	
	/**
	 * @return the studentID
	 */
	public int getStudentID() {
		return studentID;
	}


	/**
	 * @param studentID the studentID to set
	 */
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}


	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}


	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	/**
	 * @param string
	 * @param i
	 */
	public Student(String studentName, int studentID) {
		
		this.studentID = studentID;
		this.studentName = studentName; 
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.studentID-o.studentID;
	}
	
	

}
