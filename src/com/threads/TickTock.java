package com.threads;

public class TickTock{
	
	synchronized void Tick(boolean running){
		if(!running){
			notify();
			return;
		}
		System.out.println("Tick");
		notify();
		
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	synchronized void Tock(Boolean running){
		if(!running){
			notify();
			return;
		}
		
		System.out.println("Tock");
		notify();
		
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
