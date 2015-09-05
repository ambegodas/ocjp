/**
 * @autor pathmasri
 * May 5, 2015 2:07:30 AM
 */
package com.sample.datescalendarlocal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatdemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Date d1 = new Date(1000000000000L);
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/DD");
		DateFormat[] dfa = new DateFormat[6];
		dfa[0] = DateFormat.getInstance();
		dfa[1] = DateFormat.getDateInstance();
		dfa[2] = DateFormat.getDateInstance(DateFormat.SHORT);
		dfa[3] = DateFormat.getDateInstance(DateFormat.MEDIUM);
		dfa[4] = DateFormat.getDateInstance(DateFormat.LONG);
		dfa[5] = DateFormat.getDateInstance(DateFormat.FULL);
		for(DateFormat df : dfa)
		System.out.println(df.format(d1));
		
		System.out.println(sdf.format(d1));

	}

}
