package com.threads;

public class MyThreadExecutor implements Runnable {
	Thread th;
	
	public MyThreadExecutor(String name){
		th = new Thread(this,name);
		th.start();
	}
	
	@Override
	public void run() {
		
		for(int i=0; i<10; i++){
			System.out.println("Running thread - "+ Thread.currentThread().getName()+ i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	
}
