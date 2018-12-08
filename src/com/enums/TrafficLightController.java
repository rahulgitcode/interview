package com.enums;

enum TrafficLight{
	RED, YELLOW, GREEN
}

public class TrafficLightController implements Runnable{
	private Thread th;
	TrafficLight tlc;
	boolean stop = false;
	
	public TrafficLightController(TrafficLight init) {
		tlc = init;
		th = new Thread(this);
		th.start();
	}
	
	public void run() {
		while(!stop) {
			try {
				switch(tlc) {
					case RED:
						Thread.sleep(10000);
						break;
					case YELLOW:
						Thread.sleep(2000);
						break;
					case GREEN:
						Thread.sleep(12000);
						break;
				}
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			changeColor();			
		}
		
	}

	synchronized void changeColor() {
		switch(tlc) {
		case RED:
			tlc = TrafficLight.GREEN;
			break;
		case YELLOW:
			tlc = TrafficLight.RED;
			break;
		case GREEN: 
			tlc = TrafficLight.YELLOW;
		}
		notify();
	}
	
	synchronized void waitForChange() {
		try {
			wait();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	TrafficLight getColor() {
		return tlc;
	}

	public void cancel() {
		stop = true;
		
	}
	
	
}
