package com.threadExecutor;

import java.util.concurrent.TimeUnit;
/*
 * This technique extends thread class to create new threads
 */
public class FirstWay {
	public static void main(String[] args) {
		System.out.println("Starting main thread...");
		new FirstTask();
		new FirstTask();
		System.out.println("Main thread has ended...");
	}
}

class FirstTask extends Thread{
	private static int count;
	private int id;
	
	public FirstTask() {
		++count;
		this.id = count;
		this.start();
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
