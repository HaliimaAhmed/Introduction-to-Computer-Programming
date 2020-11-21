import java.util.Scanner;

/*
 *   Class:  OurDate
 *   Lab professor: Jason Mombourquette
 *   Author:  Halima Ahmed
 *   CST8110_303 - Assignment #2
 *   March 16, 2018
 * 
 */

public class OurDate {

	private int year;
	private int month;
	private int day;

	private Scanner scan;

	public OurDate() {
		scan = new Scanner (System.in);
		year = 2000;
		month= 01;
		day = 01;

	}

	public OurDate (int y, int m, int d ) {
		scan = new Scanner (System.in);
		year = y;
		month = m;
		day = d;		  	
	}

	public void inputYear ( ) {
		System.out.print("Enter a year: ");
		year = scan.nextInt();
	}

	public void inputMonth ( ) {
		System.out.print("Enter a Month: ");
		month = scan.nextInt();
	}

	public void inputDay ( ) {
		System.out.print("Enter a Day: ");
		day = scan.nextInt();
	}	


	public void displayDate ( ) {
		System.out.print(+ year + "/" + month + "/" + day);	
	}
	public int calcDays ( ) {
		return (((month-1)*30) + (day-1) + (year-2000)*360);

	}
}

