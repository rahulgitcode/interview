package com.threads;

public class MyThread extends Thread {
	
	TickTock ttOb;
	Thread th;
	
	public MyThread(String name, TickTock tt){
		super(name);
		ttOb = tt;
		this.start();
	}
	
	public void run(){
		
		if(this.getName().equals("Tick")){
			for(int i=0; i<5; i++) ttOb.Tick(true);
			ttOb.Tick(false);
		}else{
			for(int i=0; i<5; i++) ttOb.Tock(true);
			ttOb.Tock(false);
		}
	}

}
