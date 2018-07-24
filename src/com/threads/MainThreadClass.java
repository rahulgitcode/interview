package com.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainThreadClass {
	
	public static void main(String[] args){
		ExecutorService executor = Executors.newFixedThreadPool(1);
		
		Runnable worker = new MyThreadExecutor("  Rahul  ");

        executor.execute(worker);
        
        executor.shutdown();

        while (!executor.isTerminated()) { }

	}

}
