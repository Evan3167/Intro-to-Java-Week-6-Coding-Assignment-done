package IntrotoJavaWeek6CodingAssignment;

import java.util.ArrayList;
import java.util.List;


/*
 * Player
 * 
 * Fields
 * hand (List of Card)
 * score (set to 0 in the constructor)
 * name
 * 
 * Methods
 * describe (prints out information about the player and calls the describe method for each card in the Hand List)
 * flip (removes and returns the top card of the Hand)
 * draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
 * incrementScore (adds 1 to the Player’s score field)
 */



public class Player {

	
	private List<card> hand = new ArrayList<card>();
	private int score;
	private String name;
	
	public Player() {
		score = 0;
		
	}
	
	public Player(String newName) {
		name = newName;
		score = 0;
	}
	
	public void describe() {
		System.out.println("Player: " + name + " " + "has the following cards:");
		for (card card : hand) {
			card.describe();
		}
	}
	public card flip() {
		return hand.remove(0);
		
	}
	
	public void draw (deck deck) {
		hand.add(deck.draw());
		
	}
	public void addScore() {
		score++;
		
	}
	
	public int getscore() {
		return score;
	}
	
}
