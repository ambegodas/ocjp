/**
 * @autor pathmasri
 * May 5, 2015 2:01:47 AM
 */
package com.sample.datescalendarlocal;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class CalandarDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Locale l = new Locale("en");
		Calendar c = Calendar.getInstance();
		
		c.add(Calendar.MONDAY, 2);
		c.get(Calendar.DAY_OF_WEEK);
		 
		Date d = c.getTime();

	}

}
