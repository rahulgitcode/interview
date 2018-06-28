package com.threads;

public class MainClassRunnable {
	
	public static void main(String[] args){
		
		System.out.println("Main thread has started running..");
		MyThreadRunnable myThread = new MyThreadRunnable("gandu");
		
		
		for(int i=10; i>0; i--){
			System.out.println("Main thread "+ i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("End of main thread");
	}
	
}
