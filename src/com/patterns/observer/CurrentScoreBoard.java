package com.patterns.observer;

public class CurrentScoreBoard implements Observer {
	private int score;
	private int wickets;
	private int overs;
	
	@Override
	public void update(int runs, int wickets, int overs) {
		this.score = runs;
		this.wickets = wickets;
		this.overs = overs;
		
		display();
	}
	
	public void display() {
		System.out.println("####Current ScoreBoard####");
		System.out.println("Current Score is: "+ this.score + 
				"\nCurrent overs: "+ this.overs +
				"\nCurrent Wickets: "+ this.wickets+"\n");
	}

}
