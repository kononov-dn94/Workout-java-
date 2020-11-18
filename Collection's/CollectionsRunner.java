package com.javacode.collections.collectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsRunner {
	public static void main(String[] args) {
		
	}

	public static class Card implements Comparable<Card> {
		private enum Suit(SPADES, HEARTS, CLUBS, DIMONS)
		private enum Face (Ace, Deuce, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King)
		private final Suit suit;
		private final Face face;

		public Card(Suit suit, Face face) {
			this.suit = suit;
			this.face = face;
		}

		@Override
		public int compareTo(Card o) {
			

			return 0;
		}
	}
}
