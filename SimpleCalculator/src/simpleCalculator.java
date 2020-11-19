
/*********************************************************************************************
 * 
 * Student Name:Halima Ahmed
 * Course:Introduction to computer programming
 * Semester: FALL 2018
 * This class is a simple calculator that allows users to add, subtract, multiply and divide two numbers.
 */
import java.util.Scanner;

public class simpleCalculator {

	public static void main(String[] args) {

		double num1;
		double num2;
		String operation;

		System.out.println("Simple Calculator");

		Scanner input = new Scanner(System.in);

		System.out.println("First number: ");
		num1 = input.nextDouble();

		System.out.println("Please enter an operation (+, -, *, /): ");

		Scanner choice = new Scanner(System.in);
		operation = choice.next();

		System.out.println("Second number: ");
		num2 = input.nextDouble();

		if (operation.equals("+")) {
			System.out.println("your answer is: " + (num1 + num2));
		}
		if (operation.equals("-")) {
			System.out.println("your answer is: " + (num1 - num2));
		}

		else if (operation.equals("/")) {
			System.out.println("your answer is: " + (num1 / num2));

		} else if (operation.equals("*")) {
			System.out.println("your answer is: " + (num1 * num2));
		}

	}
}