package com.threads;

public class MainThreadJoin {
	public static void main(String[] args){
		int i=1;
		System.out.println("Main thread has started running..");
		
		MyThreadExtends th1 = new MyThreadExtends("thread1");
		th1.setPriority(Thread.MAX_PRIORITY);
		MyThreadExtends th2 = new MyThreadExtends("thread2");
		th2.setPriority(Thread.MAX_PRIORITY-2);
		MyThreadExtends th3 = new MyThreadExtends("thread3");
		th3.setPriority(Thread.MIN_PRIORITY);
		
		try{
			th1.join();
			System.out.println(th1.getName()+ " has ended");
			th2.join();
			System.out.println(th2.getName()+ " has ended");
			th3.join();
			System.out.println(th3.getName()+ " has ended");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("End of main thread");
	}
}
