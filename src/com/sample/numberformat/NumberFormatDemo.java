/**
 * @autor pathmasri
 * May 5, 2015 2:32:17 AM
 */
package com.sample.numberformat;

import java.text.NumberFormat;
import java.text.ParseException;

public class NumberFormatDemo {
	

	public static void main(String a[]){
		String s = "987.123456";
		double d = 987.123456d;
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(5);
		System.out.println(nf.format(d) + " ");
		
		try {
			System.out.println(nf.parse(s));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
