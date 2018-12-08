package com.threadExecutor;

import java.util.concurrent.TimeUnit;

/*
 * Advantages to this technique
 *  You are separating the task from the thread object
 *  More flexibility on when to start the thread execution since you get handle to thread obj
 *  This technique is usable by executor framework as well
 */

public class FourthWay {
	public static void main(String[] args) {
		System.out.println("Starting main thread...");
		
		new Thread(new FourthTask()).start();;
		
		Thread t = new Thread(new FourthTask());
		t.start();
		
		System.out.println("Main thread has ended...");
	}
}

class FourthTask implements Runnable{
	private static int count;
	private int id;
	
	public FourthTask() {
		++count;
		this.id = count;
	}
	
	public void run() {
		for(int i=10; i>0; i--) {
			System.out.println("<"+ id +">TICK TICK "+ i);
			try {
				TimeUnit.MILLISECONDS.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
