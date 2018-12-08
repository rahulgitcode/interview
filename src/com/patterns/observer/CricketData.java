package com.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class CricketData implements Subject {
	private int score;
	private int wickets;
	private int overs;
	private List<Observer> observers;
	
	public CricketData() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void notifyObservers() {
		observers.forEach(e-> e.update(score, wickets, overs));
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void unregisterObserver(Observer o) {
		observers.remove(o);
	}
	
	public void getUpdates() {
		this.overs = getCurrentOver();
		this.wickets = getCurrentWickets();
		this.score = getCurrentScore();
		
		notifyObservers();
	}

	private int getCurrentScore() {
		return 120;
	}

	private int getCurrentWickets() {
		return 1;
	}

	private int getCurrentOver() {
		return 15;
	}

}
