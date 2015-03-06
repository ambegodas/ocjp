/**
 * @autor pathmasri
 * Mar 6, 2015 5:04:37 PM
 */
package com.sample.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoDeserialization {
	
	public static void main(String[] args){
		
		try{
			
			FileInputStream in = new FileInputStream("/tmp/student.ser");
			ObjectInputStream obin = new ObjectInputStream(in);
			Student s = (Student)obin.readObject();
			System.out.print(s.getName()+" "+s.getStudentId());
		}
		catch(IOException e){
			
		} catch (ClassNotFoundException e){
			
		}
		
		  
		
		
	}

}
