package com.patterns.singleton;

public class SingletonClassEager {
	private static SingletonClassEager instance = new SingletonClassEager();
	
	private SingletonClassEager() {
		
	}
	
	public static SingletonClassEager getInstance() {
		return instance;
	}

}
