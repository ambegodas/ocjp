/**
 * @autor pathmasri
 * Mar 6, 2015 9:33:35 AM
 */
package com.sample.serialization;

import java.io.Serializable;

public class Student implements Serializable{

	private String name;
	private int studentId;
	private transient String address;
	
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

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
