package com.threadExecutor;

import java.util.concurrent.Callable;

public class CallableLoopTask implements Callable<Integer>{
	int a;
	int b;
	
	public CallableLoopTask(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	@Override
	public Integer call() throws Exception {
		Thread.sleep(4000);
		return a+b;
	}

}
