/***************************************************************************
 * Halima Ahmed 
 * Section: CST8110_303
 * CST8110 18W 
 * Lab Instructor:Jason Mombourquette
 * Assignment 3
 *  April 6th,2018 
 * Purpose: The following java program will simulate a dice betting game. in the game you're betting on your $100. you can either bet high, low, even, and odd.
 *  if the betting type is correct you win if you dont you lose. there is 3 rounds in the game and if you get 0 you lost the game
 * This class: In this class is where the game is made. with in the 3 rounds you can either bet high, low, even, and odd(case insensitive), but if you get a pot of 0 you are out of the game.
 *   
 ****************************************************************************/
import java.util.Scanner;

public class Game {

	int potAmount;
	int betAmount;
	private String betType;

	private Scanner input = new Scanner(System.in);

	public Game() {
		this.potAmount = 100;
		this.betAmount = 0;
		this.betType = "";
	}

	public void getBetAmountFromUser() {

		System.out.println("Your current pot is 0 ");
		System.out.print("Enter your bet amount: ");

		betAmount = input.nextInt();

		if (betAmount < 0 || betAmount > potAmount) {

			System.out.println("Your current pot is " + potAmount);
			System.out.println("You end the game with pot of" + potAmount);

		}
		if (potAmount == 0) {
			System.out.println("You end the game with pot of " + potAmount);

		} else {
			potAmount = potAmount - betAmount;

		}
	}

	public void playGame() {

		while (potAmount > 0) {
			System.out.println("\nYour current pot is " + potAmount);
			System.out.println("Enter your bet amount: ");
			betAmount = input.nextInt();

			if (betAmount == 0) {
				System.out.println("You end the game with pot of " + potAmount);
				break;
			} else if (betAmount <= 0 || betAmount > potAmount) {
				while (betAmount <= 0 || betAmount > potAmount) {
					System.out.println("Error - cannot be less than 0 or more than " + potAmount
							+ " ....Enter your bet amount:  ");
					betAmount = input.nextInt();
				}
			}

			System.out.println("Enter your bet type (low, high, odd and even): ");
			betType = input.next();
			betType = betType.toLowerCase();

			while (!betType.equalsIgnoreCase("low") && !betType.equalsIgnoreCase("high")
					&& !betType.equalsIgnoreCase("odd") && !betType.equalsIgnoreCase("even")) {
				System.out.println("Please enter low, high, odd and even.....Enter your bet type");
				betType = input.next();
			}

			Die x = new Die();
			x.displayDie();

			switch (betType) {
			case "high":
				if (x.getValue() > 9) {
					System.out.println("You WIN ....double your bet");
					potAmount = potAmount + betAmount + 10;
				} else {
					System.out.println("You LOSE ....your bet");
					potAmount = potAmount - betAmount;
				}
				break;

			case "low":
				if (x.getValue() < 9) {
					System.out.println("You WIN ....double your bet");
					potAmount = potAmount + betAmount + 10;
				} else {
					System.out.println("You LOSE ....your bet");
					potAmount = potAmount - betAmount;
				}
				break;
			case "even":
				if (x.getValue() % 2 == 0) {
					System.out.println("You WIN ....double your bet");
					potAmount = potAmount + betAmount * 2;
				} else {
					System.out.println("You LOSE ....your bet");
					potAmount = potAmount - betAmount;
				}
				break;
			case "odd":
				if (x.getValue() % 2 != 0) {
					System.out.println("You WIN ....double your bet");
					potAmount = potAmount + betAmount + 10;
				} else {
					System.out.println("You LOSE ....your bet");
					potAmount = potAmount - betAmount;
				}
				break;

			default:
				break;
			}

		}

	}

}






