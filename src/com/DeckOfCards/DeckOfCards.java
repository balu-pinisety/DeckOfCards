package com.DeckOfCards;

import java.util.HashSet;
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
}