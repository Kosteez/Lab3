import java.util.*;
import java.util.Date;

/*
This program prompts the user for their date of birth in the format YYYY-MM-DD and outputs
the user age, plus a message in the lines: “Your birthday is in XX days”, or “Your birthday was XX days
ago” (substitute XX by the calculated amount of days), depending if the date in the current year has
passed or not.
@author Constantinos
*/

public class Question5 {

	public static void main(String[] args) {
		
		// Prompting the user for their date of birth.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your birthdate in the following format: YYYY-MM-DD ");
		
		// Identifying and defining variables.
		String birthDate, birthYear, birthMonth, birthDay;
		int birthYearInt, birthMonthInt, birthDayInt, currentYear, currentMonth, currentDay, age, daysUntilBirthday, daysAfterBirthday, monthVerification, realDay;

		birthDate = sc.nextLine();
		birthYear = birthDate.substring(0,4);
		birthMonth = birthDate.substring(6,7);
		birthDay = birthDate.substring(9,10);

		birthYearInt = Integer.parseInt(birthYear);
		birthMonthInt = Integer.parseInt(birthMonth);
		birthDayInt = Integer.parseInt(birthDay);

		Date today = new Date();
		currentYear = today.getYear() + 1900;
		currentMonth = today.getMonth();
		currentDay = today.getDay();
		monthVerification = currentMonth + 1;
		realDay = currentDay + 1;

		// "if" and "else if" statements required to execute program.
		if (birthMonthInt > monthVerification) {
			age = (currentYear - birthYearInt) - 1;
			System.out.println("You're " + age + " years old.");
			if (birthDayInt > realDay) {
				daysUntilBirthday = (birthDayInt - realDay) + ((birthMonthInt - monthVerification) * 31);
				System.out.println("Your birthday is in " + daysUntilBirthday + " days.");
			} else if (birthDayInt < realDay) {
				daysUntilBirthday = (realDay - birthDayInt) - ((birthMonthInt - monthVerification) * 31);
				System.out.println("Your birthday is in " + daysUntilBirthday + " days.");
			}
		} else if (birthMonthInt < monthVerification) {
			age = currentYear - birthYearInt;
			System.out.println("You're " + age + " years old.");
			if (birthDayInt > realDay) {
				daysAfterBirthday = (birthDayInt - realDay) - ((monthVerification - birthMonthInt) * 31);
				System.out.println("Your birthday was " + Math.abs(daysAfterBirthday) + " days ago.");
			} else if (birthDayInt <= realDay) {
				daysAfterBirthday = (realDay - birthDayInt) - ((monthVerification - birthMonthInt) * 31);
				System.out.println("Your birthday was " + Math.abs(daysAfterBirthday) + "days ago.");
			}
		} else if (birthMonthInt == monthVerification) {
			if (birthDayInt > realDay) {
				age = ((currentYear - birthYearInt) - 1);
				daysUntilBirthday = birthDayInt - realDay;
				System.out.println("You're " + age + " years old.");
				System.out.println("Your birthday is in " + daysUntilBirthday + " days.");
			} else if (birthDayInt == realDay) {
				age = currentYear - birthYearInt;
				System.out.println("HAPPY BIRTHDAY! You're now " + age + " years old!");
			} else if (birthDayInt < realDay) {
				daysAfterBirthday = realDay - birthDayInt;
				age = currentYear - birthYearInt;
				System.out.println("You're " + age + " years old.");
				System.out.println("You're birthday was " + daysAfterBirthday + " days ago.");
			}
		}
	
	}
}
