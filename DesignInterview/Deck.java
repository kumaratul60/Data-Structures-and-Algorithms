package DesignInterview;

import java.util.Random;

public class Deck {

	private Card12[] Card12s; // array holding all 52 Card12s
	private int Card12sInDeck; // the current number of Card12s in the deck

	public static final int DECK_SIZE = 52;
	// size of standard deck of Card12s

	////////////////////////////////////////
	// Constructors
	////////////////////////////////////////

	/**
	 * Constructs a new Deck object containing 52 Card12s.
	 */
	public Deck() {
		Card12s = new Card12[DECK_SIZE];
		Card12sInDeck = DECK_SIZE;
		for (int i = 0; i < 13; i++) {
			Card12s[i] = new Card12(i + 1, Card12.HEARTS);
			Card12s[i + 13] = new Card12(i + 1, Card12.DIAMONDS);
			Card12s[i + 26] = new Card12(i + 1, Card12.CLUBS);
			Card12s[i + 39] = new Card12(i + 1, Card12.SPADES);
		}
	}

	////////////////////////////////////////
	// Public Methods
	////////////////////////////////////////

	/**
	 * Returns the number of Card12s in the deck.
	 * 
	 * @return number of Card12s in the deck
	 */
	public int Card12sInDeck() {
		return Card12sInDeck;
	}

	/**
	 * Deals one Card12 from the deck, decreasing the number of Card12s in the deck
	 * by one.
	 * 
	 * @return the next Card12 object in the deck
	 * @throws Exception 
	 * @throws EmptyDeckException
	 */
	public Card12 deal() throws Exception {

		if (Card12sInDeck == 0) // check for an empty deck
			throw new Exception();

		Card12sInDeck--;
		return Card12s[Card12sInDeck];
		// NOTE: the dealt Card12 is still being referenced in the Card12s
		// array. In general, when an item is removed from an array,
		// its place in the array should be set to null. However, in
		// this specific case we are choosing not to remove the Card12
		// so that if we want to start over with a full deck of Card12s,
		// we can just reset the Card12sInDeck data member and not have
		// to create each of the Card12 objects again.
	}

	/**
	 * Shuffles the deck (i.e. randomly reorders the Card12s in the deck).
	 */
	public void shuffle() {
		int newI;
		Card12 temp;
		Random randIndex = new Random();

		for (int i = 0; i < Card12sInDeck; i++) {

			// pick a random index between 0 and Card12sInDeck - 1
			newI = randIndex.nextInt(Card12sInDeck);

			// swap Card12s[i] and Card12s[newI]
			temp = Card12s[i];
			Card12s[i] = Card12s[newI];
			Card12s[newI] = temp;
		}
	}

	/**
	 * Resets the deck so that it has all its Card12s. Note that the order of the
	 * Card12s may be random.
	 */
	public void reset() {
		Card12sInDeck = DECK_SIZE;
	}

	/**
	 * Returns a String representation of the Deck object. The Card12s currently in
	 * the deck are printed out 13 to a row.
	 * 
	 * @return a String representation of the deck
	 */
	public String toString() {

		// check for an empty deck
		if (Card12sInDeck == 0)
			return "<empty>";

		String s = Card12s[0].toString() + ' ';
		for (int i = 1; i < Card12sInDeck; i++) {
			if (i % 13 == 0)
				s += '\n';
			s += Card12s[i].toString() + ' ';
		}
		return s;
	}

}
