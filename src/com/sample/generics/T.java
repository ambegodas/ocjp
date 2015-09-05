/**
 * @autor pathmasri
 * May 5, 2015 1:50:33 PM
 */
package com.sample.generics;

public class T <E extends Number>{
	
   E number1 ;
  
   E number2 ;
   
   int sum;
  
  
   public int addNumbers (){
	   
	   return number1.intValue() + number2.intValue();
   }
	

}
