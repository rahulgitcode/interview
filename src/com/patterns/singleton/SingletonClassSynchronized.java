package com.patterns.singleton;

public class SingletonClassSynchronized {
	
	private static SingletonClassSynchronized singleton= null;
	
	private SingletonClassSynchronized() {
		
	}
	
	//only one thread can execute this at once
	public static synchronized SingletonClassSynchronized getInstance() {
		if(singleton!=null) {
			return singleton;
		}else {
			singleton = new SingletonClassSynchronized();
			return singleton; 
		}
	}

}
