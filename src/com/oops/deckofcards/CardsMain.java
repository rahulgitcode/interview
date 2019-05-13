package com.oops.deckofcards;

public class CardsMain {

	public static void main(String[] args) {
		DeckOfCards deck = new DeckOfCards();
		
		System.out.println("*********Before Shuffling****************");
		for(Card c: deck.cards){
			System.out.println(c.symbol + " "+ c.value);
		}
		
		deck.shuffle();
		
		System.out.println("***********After Shuffling**************");
		for(Card c: deck.cards){
			System.out.println(c.symbol + " "+ c.value);
		}
		
		deck.deal();
		deck.deal();
	}

}
