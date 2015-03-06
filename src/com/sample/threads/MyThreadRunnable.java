/**
 * @autor pathmasri
 * Mar 5, 2015 11:15:28 PM
 */
package com.sample.threads;

public class MyThreadRunnable implements Runnable{

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		System.out.println("Thread using Runnable class is running...");		
	}

}
