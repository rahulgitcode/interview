package com.patterns.observer;

public class MainCricketMatch {

	public static void main(String[] args) {
		CurrentScoreBoard currentBoard = new CurrentScoreBoard();
		PredictedScoreBoard predictedBoard = new PredictedScoreBoard();
		
		CricketData data = new CricketData();
		data.registerObserver(currentBoard);
		data.registerObserver(predictedBoard);
		
		data.getUpdates();

	}

}
