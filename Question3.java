import java.util.*;
import java.text.DecimalFormat;

/*
This program prompts the user for the current temperature in Celsius and outputs different
messages if it is above or below zero by using the (?:) conditional operator.
*/

public class Question3 {
	private static DecimalFormat df2 = new DecimalFormat("#.#");
		
		public static void main(String[] args) {
	
		// Scanner creation.
		Scanner sc = new Scanner(System.in);
	
		// Prompting the user for input.
		System.out.println("Enter the temperature: ");
		double celsius = sc.nextDouble();
	
		// "if" statements to properly execute the program.
		if (celsius < 0) {
			System.out.println("The temperature " + celsius + " is below zero.");
		} if (celsius > 0) {
			System.out.println("The temperature " + celsius + " is above zero.");
		} if (celsius == 0) {
			System.out.println("The temperature is zero. Enter a different temperature.");
		}
	
	}
}