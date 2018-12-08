package com.patterns.observer;

public interface Subject {
	
	public void notifyObservers();
	public void registerObserver(Observer o);
	public void unregisterObserver(Observer o);

}
