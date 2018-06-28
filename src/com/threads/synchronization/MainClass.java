package com.threads.synchronization;

public class MainClass {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		MyThread t1 = new MyThread("Rahul", arr);
		t1.setPriority(Thread.MAX_PRIORITY);
		MyThread t2 = new MyThread("Megha",arr);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();
		
		try {
			t1.join();
			System.out.println(t1.getName()+ " has completed..");
			t2.join();
			System.out.println(t2.getName()+ " has completed..");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
