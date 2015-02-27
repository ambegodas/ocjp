/**
 * @autor pathmasri
 * Feb 27, 2015 7:50:34 PM
 */
package com.sample.chapter1.enums;

public class TestEnum {
	
	public static void main(String args[]){
		
		System.out.println(Season.SUMMER);
	}
	
	
	
	public enum UserStatus {
		PENDING("P"), ACTIVE("A"), INACTIVE("I"), DELETED("D");
	 
		private String statusCode;
	 
		private UserStatus(String s) {
			statusCode = s;
		}
	 
		public String getStatusCode() {
			return statusCode;
		}
	}
	
	enum Season {SUMMER,VINTER}

}
