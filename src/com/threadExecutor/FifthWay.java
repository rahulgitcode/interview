package com.threadExecutor;

import java.util.concurrent.TimeUnit;
/*
 * Quick and dirty way of creating thread
 * 	Use anonymous block of code to define thread task rather than separating it
 */
public class FifthWay {
	public static void main(String[] args) {
		System.out.println("Starting main thread...");
		
		new Thread(new Runnable() {
			public void run() {
				for(int i=10; i>0; i--) {
					System.out.println("TICK TICK "+ i);
					try {
						TimeUnit.MILLISECONDS.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		System.out.println("Main thread has ended...");
	}
}
