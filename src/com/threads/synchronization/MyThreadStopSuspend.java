package com.threads.synchronization;

public class MyThreadStopSuspend implements Runnable{
	Thread th;
	volatile boolean suspended;
	volatile boolean stopped;
	
	
	public MyThreadStopSuspend(String name){
		th = new Thread(this,name);
		suspended = false;
		stopped = false;
		th.start();
	}
	
	public void run(){
		try {
			for (int i = 0; i < 100; i++) {
				System.out.println(i + " ");
				if (i % 10 == 0) {
					System.out.println();
				}

				synchronized (this) {
					if (suspended) {
						wait();
					}
					if (stopped)
						break;
				}
			}
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
	
	synchronized void suspend(){
		suspended=true;
	}
	
	synchronized void resume(){
		suspended = false;
		notify();
	}
	
	synchronized void stop(){
		stopped = true;
		suspended = false;
		notify();
	}

}
