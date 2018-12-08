package com.threadExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingSingleThreadExecutor {
	public static void main(String[] args) {
		ExecutorService execService = Executors.newSingleThreadExecutor();
		
		execService.submit(new LoopTaskA());
		execService.submit(new LoopTaskA());
		execService.submit(new LoopTaskA());
				
		execService.shutdown();
		
	}

}
