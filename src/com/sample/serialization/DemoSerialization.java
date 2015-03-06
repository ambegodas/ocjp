/**
 * @autor pathmasri
 * Mar 6, 2015 4:52:57 PM
 */
package com.sample.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DemoSerialization {
	
	  public static void main(String [] args)
	   {

	  Student s = new Student("Pathmasri",1);
	  s.setAddress("sharjah");

      try
      {
         FileOutputStream fileOut = new FileOutputStream("/tmp/student.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(s);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in /tmp/employee.ser");
      }catch(IOException i)
      {
          i.printStackTrace();
      }
	   }

}
