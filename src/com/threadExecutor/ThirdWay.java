package com.threadExecutor;

import java.util.concurrent.TimeUnit;

/*
 * 
 * This technique uses runnable interface to create thread
 * 
 */
public class ThirdWay {
	public static void main(String[] args) {
		System.out.println("Starting main thread...");
		
		new ThirdTask();
		
		new ThirdTask();
		
		System.out.println("Main thread has ended...");
	}
}

class ThirdTask implements Runnable{
	private static int count;
	private int id;
	
	public ThirdTask() {
		++count;
		this.id = count;
		new Thread(this).start();
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
