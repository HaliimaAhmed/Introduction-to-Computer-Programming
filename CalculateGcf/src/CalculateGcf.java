import java.util.*;

/*********************************************************************************************
 * 
 * Student Name:Halima Ahmed
 * Course:Introduction to computer programming
 * Semester: FALL 2018
 * This class calculates the greatest common factor of two numbers.  
 */
public class CalculateGcf {

	private int value1, value2, gcf = 0;

	Scanner scan = new Scanner(System.in);

	public void getValues() {
		System.out.println("Enter value1: ");
		value1 = scan.nextInt();
		System.out.println("Enter value2: ");
		value2 = scan.nextInt();
		//System.out.println("Enter multiple values: ");
		//value = scan.nextInt();
	}

	public void calculateGcf() {

		{
			if (value1 < 0) {
				System.out.println("Enter value1 that is greater than 0: ");
				value1 = scan.nextInt();

			}
			if (value2 < 0) {
				System.out.println("Enter value2 that is greater than 0:");
				value2 = scan.nextInt();
			}
		}

		int a = value1;
		int b = value2;

		while (a != 0) {
			gcf = a;
			a = b % a;
			b = gcf;
		}
	}

	public void display() {
		System.out.println("The greatest common factor of  " + (value1) + " and " + (value2) + " is " + (gcf));

	}
}
