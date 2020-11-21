/*
 *   Class:  DateCalculator
 *   Lab professor: Jason Mombourquette 
 *   Author:  Halima Ahmed
 *   CST8110_303 - Assignment #2
 *   March 16, 2018
 * 
 */

public class DateCalculator {

	private OurDate firstDate;
	private OurDate secondDate;
	private String message;

	public DateCalculator() {
		firstDate = new OurDate();
		secondDate = new OurDate();
	}

	public void inputDates() {
		System.out.print("Date Calculator - it's all relative");

		System.out.println("\nEnter first date ");
		inputDate(firstDate);

		System.out.println("\nEnter second date ");
		inputDate(secondDate);

	}

	private void inputDate(OurDate date) {
		date.inputYear();
		date.inputMonth();
		date.inputDay();
	}

	public void calculateDifference() {
		int date1 = firstDate.calcDays();
		int date2 = secondDate.calcDays();
		int difference = Math.abs(date1 - date2);

		if (difference == 0) {
			message = " the same as ";
		}

		if (difference == 1) {
			if (date1 > date2) {
				message = " is " + difference + " day earlier than ";
			} else {
				message = " is " + difference + " day later than ";
			}

		}

		if (difference > 1 && difference < 7) {
			if (date1 > date2) {
				message = " is " + difference + " days earlier than ";
			} else {
				message = " is " + difference + " days later than ";
			}
		}

		if (difference >= 7 && difference < 30) {
			difference = difference / 7;
			if (date1 < date2) {
				message = " is " + difference + " weeks earlier than ";
			} else {
				message = " is " + difference + " weeks later than ";
			}
		}

		if (difference >= 30 && difference < 360) {
			difference = difference / 30;
			if (date1 < date2) {
				message = " is " + difference + " months earlier than ";
			} else {
				message = " is " + difference + " months later than ";
			}
		}
		if (difference >= 360) {
			difference = difference / 360;
			if (date1 < date2) {
				message = " is " + difference + " years earlier than ";
			} else {
				message = " is " + difference + " years later than ";
			}
		}
	}

	public void display() {
		System.out.println();
		firstDate.displayDate();
		System.out.print(message);
		secondDate.displayDate();

	}

}
