
/***************************************************************************
 * Halima Ahmed 
 * Section: CST8110_303
 * CST8110 18F
 * Lab Instructor:Jason Mombourquette
 * Assignment 3 
 * Purpose: The following java program will simulate a dice betting game. in the game you're betting on your $100. you can either bet high, low, even, and odd.
 *  if the betting type is correct you win if you dont you lose. there is 3 rounds in the game and if you get 0 you are out of the game
 *
 ****************************************************************************/
public class Assign3 {
	public static void main(String[] args) {
		System.out.println("Welcome to Double or Nothing Dice Game..bet an amount and type");
		System.out.println("       -if you are correct, you win twice your bet,");
		System.out.println("       -otherwise you lose your bet");
		System.out.println("A bet of 0 end the game");

		Game halima = new Game();
		halima.playGame();

	}
}


