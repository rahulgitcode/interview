package com.patterns.observer;

public class PredictedScoreBoard implements Observer {
	private int runs;
	private float runRate;
	private int predictedScore;
		
	@Override
	public void update(int runs, int wickets, int overs) {
		this.runs = runs;
		this.runRate = (float) runs/overs;
		this.predictedScore = runs+ (int)this.runRate*(50-overs);
		
		display();
	}
	
	public void display() {
		System.out.println("****Predicted ScoreBoard****");
		System.out.println("Current Score is: "+ this.runs + 
				"\nCurrent RunRate: "+ this.runRate +
				"\nPredicted Score: "+ this.predictedScore);
	}

}
