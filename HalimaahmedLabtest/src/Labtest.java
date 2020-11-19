import java.util.Scanner;

/*********************************************************************************************
 * 
 * Student Name:Halima Ahmed Course:Introduction to computer programming
 * Semester: FALL 2018
 * LAB TEST: This class allows the users to enter two
 * numbers and displayes the smallest value.
 */
public class Labtest {

	private int value1 = 0;
	private int value2 = 0;

	Scanner input = new Scanner(System.in);

	public void getValues() {

		System.out.println("Enter Value 1:  ");
		value1 = input.nextInt();

		System.out.println("Enter Value 2:  ");
		value2 = input.nextInt();

	}

	public void display() {
		System.out.println(Math.min(value1, value1) + " is the smallest number");
	}

}