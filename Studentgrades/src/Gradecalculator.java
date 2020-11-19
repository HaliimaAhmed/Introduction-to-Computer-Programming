import java.util.Scanner;

/*********************************************************************************************
 * 
 * Student Name:Halima Ahmed Course:Introduction to computer programming
 * Semester: FALL 2018 
 * This QUIZ uses a switch statements to display the grade
 * of the student.
 */
public class Gradecalculator {

	public static void main(String args[]) {
		// char grade = args[0].charAt(0);
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your grade: ");
		String grade = scan.next();

		// switch statement allows the user to enter in uppper and lowercase
		switch (grade) {
		case "A":
		case "a":
			System.out.println("Excellent!");
			break;
		case "B":
		case "b":
		case "C":
		case "c":
			System.out.println("Well done");
			break;
		case "D":
		case "d":
			System.out.println("You passed");
		case "F":
		case "f":
			System.out.println("Better luck next time");
			break;
		default:
			System.out.println("Invalid grade, please try again ");
		}
		System.out.println("Your grade is " + grade);
	}
}