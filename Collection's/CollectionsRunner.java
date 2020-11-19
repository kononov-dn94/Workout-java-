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

		public Suit getSuit() {
			return suit;
		}

		public Face getFace() {
			return face;
		}

		@Override
		public int compareTo(Card card) {
			Face[] values = face.values();
			List<Face> faces = Array.asList(values);

			if(faces.indexOf(this.face) < faces.indexOf(card.getFace())) {
				return -1;
			} else if(faces.indexOf(this.face) > faces.indexOf(card.getFace())) {
				return +1;
			} else if(faces.indexOf(this.face) == faces.indexOf(card.getFace())) {
				return String.valueOf(suit).compareTo(String.valueOf(card.getSuit));
			}

			return 0;
		}
	}
}
