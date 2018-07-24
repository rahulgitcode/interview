package com.threads;

public class TickTockMain {
	
	public static void main(String[] args){
		TickTock tt = new TickTock();
		
		MyThread t1 = new MyThread("Tick", tt);
		MyThread t2 = new MyThread("Tock", tt);
		
		try{
			t1.join();
			t2.join();
		}catch(InterruptedException ex){
			ex.printStackTrace();
		}
		
	}

}
