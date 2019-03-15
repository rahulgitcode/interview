package com.threadExecutor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SixthWayCallable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newSingleThreadExecutor();
		
		Future future = service.submit(new CallableLoopTask(11,8)); // Future is a placeholder for the return value from task
		
		Thread.sleep(8000); // Do some unrelated tasks here
		
		//You can use below methods to check the status of the task or even cancel the task
		System.out.println("Is the task completed ? "+ future.isDone());
		System.out.println("Please cancel the task: "+ future.cancel(false));
		System.out.println("Has task been cancelled? "+ future.isCancelled());
		
		if(future.isDone()){
			System.out.println(future.get());// Use the get() method to retrieve the value returned by task
		}
		
		service.shutdown();

	}

}
