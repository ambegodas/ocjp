/**
 * @autor pathmasri
 * Mar 5, 2015 11:14:13 PM
 */
package com.sample.threads;

public class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		t.start();
		
		Thread t2 = new Thread(new MyThreadRunnable());
		t2.start();

	}

}
