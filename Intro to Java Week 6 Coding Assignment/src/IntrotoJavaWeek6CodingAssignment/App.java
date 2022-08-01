package IntrotoJavaWeek6CodingAssignment;

public class App {
	
	
	
	
	/*
	 * Create a class called App with a main method.
	 * Instantiate a Deck and two Players, call the shuffle method on the deck.
	 * Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
	 * Using a traditional for loop, iterate 26 times and call the flip method for each player.
	 * Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.
	 * After the loop, compare the final score from each player. 
	 * Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		deck deck = new deck();
		Player player1 = new Player("1");
		Player player2 = new Player("2");
		deck.shuffle();
		
		
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			}else {
				player2.draw(deck);
			}
		}
		
		for (int i = 0; i <26; i++) {
			card player1card = player1.flip();
			card player2card = player2.flip();
			if(player1card.getValue() > player2card.getValue()) {
				player1.addScore();
			}else if (player1card.getValue() < player2card.getValue()) {
				player2.addScore();
			}
		}
		
		System.out.println("Player 1 score is:" + player1.getscore());
		System.out.println("Player 2 score is: " + player2.getscore());
		if(player1.getscore() > player2.getscore()) {
			System.out.println("Player 1 Wins!!! ");
		}else if (player1.getscore() < player2.getscore()) {
			System.out.println("Player 2 Wins!!!");
		}else {
			System.out.println("Its a DRAW!!!!!!!!!!");
		}
		
	}

}
