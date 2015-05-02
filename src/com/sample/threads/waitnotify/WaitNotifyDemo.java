/**
 * @autor pathmasri
 * May 2, 2015 5:41:40 PM
 */
package com.sample.threads.waitnotify;

public class WaitNotifyDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Message msg = new Message("process it");
        Waiter waiter = new Waiter(msg);
        new Thread(waiter,"waiter").start();
         
        Waiter waiter1 = new Waiter(msg);
        new Thread(waiter1, "waiter1").start();
         
        Notifier notifier = new Notifier(msg);
        new Thread(notifier, "notifier").start();
        System.out.println("All the threads are started");

	}

}
