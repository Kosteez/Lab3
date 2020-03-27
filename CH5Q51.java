import java.util.*;

public class CH5Q51 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String yearString;
		int yearInt, yearLength, finalOutput;

		System.out.println("Enter a year: ");
		yearString = sc.nextLine();
		yearLength = yearString.length();

		if (yearLength == 2) {
			yearInt = Integer.parseInt(yearString);
			finalOutput = yearInt + 2000;
			System.out.println("The final output is " + finalOutput + ".");
		} else if (yearLength == 4) {
			yearInt = Integer.parseInt(yearString);
			System.out.println("The final output is " + yearInt);
		} else {
			System.out.println("The year is not valid.");
		}

	}
}