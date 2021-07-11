package com.DeckOfCards;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author BALU
 * Have Methods to create cards and distribute to players
 */
public class DeckOfCards {
	
	static Cards cards= new Cards();
	static Set<String> setCards = new HashSet<String>();
	
	/**
	 * Ability to create deck of cards which are unique using hash set 
	 * @return setCards
	 */
	public Set<String> deckCreate() {
		for (int i = 0; i < cards.suit.length; i++) {
			for (int j = 0; j < cards.rank.length; j++) {
				setCards.add(cards.suit[i] +" "+ cards.rank[j]);
			}
		}
		return setCards;
	}
	
	/**
	 * Ability to ask user for players Number
	 * @return count
	 */
	public int playersNumber() {
		System.out.println("Enter the Number of Players (2 to 4): ");
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		if (count < 2 || count > 4) {
			System.out.println("Invalid Input");
			playersNumber();
		}
		return count;
	}
}