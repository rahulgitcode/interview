package com.threads;

public class MyThreadRunnable implements Runnable{
	Thread mt;
	
	MyThreadRunnable(String name){
		mt = new Thread(this, name);
		mt.start();
	}
	
	@Override
	public void run() {
		System.out.println(mt.getName()+" has started running..");
		int i=10;
		do{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(mt.getName() + i);
			i--;
		}while(i>0);
		System.out.println("My thread has completed running...");
	}

}
