/***************************************************************************
 * Halima Ahmed 
 * Section: CST8110_303
 * CST8110 18W 
 * Lab Instructor:Jason Mombourquette
 * Assignment 3
 *  April 6th,2018 
 * Purpose: The following java program will simulate a dice betting game. in the game you're betting on your $100. you can either bet high, low, even, and odd.
 *  if the betting type is correct you win if you dont you lose. there is 3 rounds in the game and if you get 0 you are out of the game
 * This class: This class is to randomly generate the 3 Die vales  
 ****************************************************************************/
import java.util.Random;

public class Die {

	private Random randomNumbers = new Random();

	int dice1 = 0;
	int dice2 = 0;
	int dice3 = 0;
	private int dieValue;

	public void rollDie() {
		this.dice1 = randomNumbers.nextInt(6) + 1;
		this.dice2 = randomNumbers.nextInt(6) + 1;
		this.dice3 = randomNumbers.nextInt(6) + 1;
		this.dieValue = dice1 + dice2 + dice3;
	}

	public void displayDie() {
		this.rollDie();
		System.out.println("Your dies are: " + (dice1) + " and " + (dice2) + " and " + (dice3));
	}

	public int getValue() {
		return dieValue;
	}

}
