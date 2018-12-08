package com.threadExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingCachedThreadPool {
	public static void main(String[] args) {
		ExecutorService execService = Executors.newCachedThreadPool();
		
		execService.submit(new LoopTaskA());
		execService.submit(new LoopTaskA());
		execService.submit(new LoopTaskA());
		execService.submit(new LoopTaskA());
		execService.submit(new LoopTaskA());
		execService.submit(new LoopTaskA());
		
		execService.shutdown();
		
	}

}
