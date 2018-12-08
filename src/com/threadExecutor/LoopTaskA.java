package com.threadExecutor;

import java.util.concurrent.TimeUnit;

public class LoopTaskA implements Runnable {

	private static int count;
	private int id;
	
	public LoopTaskA() {
		++count;
		this.id = count;
	}
	
	@Override
	public void run() {
		
		System.out.println("###### STARTING TASK <"+ id +"> #####");
		for(int i=10; i>0; i--) {
			System.out.println("<"+ id +">TICK TICK "+ i);
			try {
				TimeUnit.MILLISECONDS.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("***** TASK <"+ id +"> IS DONE ******");
	}

}
