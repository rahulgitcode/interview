package com.threadExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingFixedThreadPool {
	
	public static void main(String[] args) {
		ExecutorService execService = Executors.newFixedThreadPool(3);
		
		execService.submit(new LoopTaskA());
		execService.submit(new LoopTaskA());
		execService.submit(new LoopTaskA());
		
		execService.submit(new LoopTaskA());
		execService.submit(new LoopTaskA());
		execService.submit(new LoopTaskA());
		
		execService.shutdown();
		
	}

}
