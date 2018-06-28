package com.threads;

public class MainClassExtends {
	public static void main(String[] args){
		int i=1;
		System.out.println("Main thread has started running..");
		
		MyThreadExtends th1 = new MyThreadExtends("thread1");
		MyThreadExtends th2 = new MyThreadExtends("thread2");
		MyThreadExtends th3 = new MyThreadExtends("thread3");
		
		do{
			System.out.println("Main thread "+ i);
			try {
				Thread.sleep(2000);
				i++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}while(th1.isAlive() || th2.isAlive() || th3.isAlive());
		
		System.out.println("End of main thread");
	}

}
