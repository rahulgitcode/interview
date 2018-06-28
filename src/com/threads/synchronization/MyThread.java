package com.threads.synchronization;

public class MyThread extends Thread{
	int arr[];
	MyThread(String name, int[] nums){
		super(name);
		arr = nums;
	}
	
	public void run(){
		System.out.println(this.getName()+ " has started...");
		SumArray sa = new SumArray();
		int val = sa.sumArray(arr);
		System.out.println("Total sum of array for "+ Thread.currentThread().getName()+ " "+ val);
		
	}

}
