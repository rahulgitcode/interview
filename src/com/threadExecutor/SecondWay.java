package com.threadExecutor;

import java.util.concurrent.TimeUnit;

public class SecondWay {
	public static void main(String[] args) {
		System.out.println("Starting main thread...");
		
		new SecondTask().start();
		
		Thread t = new SecondTask();
		t.start();
		
		System.out.println("Main thread has ended...");
	}
}

class SecondTask extends Thread{
	private static int count;
	private int id;
	
	public SecondTask() {
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
