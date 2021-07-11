package com.DeckOfCards;

/**
 * @author BALU
 * Ability to call methods for distributing deck of cards that created, to players and displaying them
 */
public class MainRunner {
	
	public static void main(String[] args) {
		// Welcome Message
		System.out.println("Program for the Deck Of Cards");
		//Object Creation
		DeckOfCards deckofcards = new DeckOfCards();
		//Calling Methods
		deckofcards.deckCreate();
	}
	
}