package com.oops.deckofcards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {
	List<Card> cards = new ArrayList<Card>();
	
	/*
	 * Initialize the deck of cards
	 */
	public DeckOfCards(){
		for(Symbols s: Symbols.values()){
			for(Value v: Value.values()){
				Card c = new Card(s,v);
				this.cards.add(c);
			}
		}
	}
	
	/*
	 * Shuffle the cards
	 */
	public void shuffle(){
		Collections.shuffle(this.cards);
	}
	
	/*
	 * Deal card from top of deck
	 */
	public Card deal(){
		System.out.println("Dealing card...");
		Card ret=null;
		if(!this.cards.isEmpty()){
			ret = this.cards.get(0);
			this.cards.remove(0);
		}
		System.out.println("Card dealt: "+ ret.symbol + " "+ ret.value);
		return ret;
	}
	
	/*
	 * Return card to top of Deck
	 */
	public void returnCard(Card c){
		this.cards.add(0, c);
	}
	
}
