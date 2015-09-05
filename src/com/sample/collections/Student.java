/**
 * @autor pathmasri
 * Mar 6, 2015 9:33:35 AM
 */
package com.sample.collections;

public class Student implements Comparable<Student>{

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
	
	public boolean equals(Object o){
		
		if(o != null && o instanceof Student){
			
			Student st = (Student)o;
			
			if(st.getName().equals(this.getName())){
				return true;
			} else {
				return false;
			}
		} else{
			return false;	
		}
		
		
		
	}
	
	public int hashCode(){
		return this.getStudentId();
	}
	

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return o.getName().compareTo(this.getName());
	}
	
	
	
}
