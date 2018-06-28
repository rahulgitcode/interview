package com.threads.synchronization;

class SumArray {
	int sum;
	synchronized int sumArray(int[] arr){
		sum=0;
		for(int i=0; i<arr.length; i++){
			sum = sum + arr[i];
			System.out.println("The running total for thread "+ Thread.currentThread().getName()+ " "+ sum);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return sum;
	}

}
