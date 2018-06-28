package com.threads;

public class MyThreadExtends extends Thread{
	MyThreadExtends(String name){
		super(name);
		this.start();
	}
	
	public void run(){
		System.out.println(this.getName()+" has started running..");
		int i=10;
		do{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.getName() + i);
			i--;
		}while(i>0);
		System.out.println(this.getName()+" has completed running...");
	}

}
