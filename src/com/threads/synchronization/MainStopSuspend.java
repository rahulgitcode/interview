package com.threads.synchronization;

public class MainStopSuspend {
	public static void main(String[] args){
		MyThreadStopSuspend th = new MyThreadStopSuspend("HelloThread");
		
		try{
			th.suspend();
			Thread.sleep(2000);
			
			th.resume();
			
			th.suspend();
			Thread.sleep(6000);
			
			th.resume();
			
		}catch(InterruptedException ex){
			ex.printStackTrace();
		}
		
		
		
	}
}
