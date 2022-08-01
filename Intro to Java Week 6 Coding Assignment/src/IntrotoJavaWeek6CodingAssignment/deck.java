package IntrotoJavaWeek6CodingAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Deck
 * 
 * Fields
 * cards (List of Card)
 *
 *
 * Methods
 * shuffle (randomizes the order of the cards)
 * draw (removes and returns the top card of the Cards field)
 * In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.
 */




public class deck {

	List<card> cards = new ArrayList<card>();
	
	
	public deck() {
		for (int i = 2; i < 15; i++) {
			cards.add(new card(i, "Diamonds"));
			cards.add(new card(i, "Hearts"));
			cards.add(new card(i, "Clubs"));
			cards.add(new card(i, "Spades"));
			
		}
	}
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public card draw() {
		return cards.remove(0);
	}
}
