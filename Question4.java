import java.util.*;
import java.text.DecimalFormat;

/*
This program provides the user a menu with 5 options of conversion 
operations (miles to kilometers, pounds to kilograms, gallons to litres, farenheit to celsius, US to CAD).
Based on the user's selection, the program should proceed with proper
instructions, input and output operations.
@author Constantinos Korres
*/

public class Question4 {

	private static DecimalFormat df2 = new DecimalFormat("#.##");
	private static DecimalFormat df3 = new DecimalFormat("#");
			
		public static void main(String[] args) {
		
		// Scanner creation.
		Scanner sc = new Scanner(System.in);
		
		// Variable declaration.
		String distance, weight, gaz, temp, money, finalAnswer;
		int choice;
		double milesKilometers, poundsKg, gallonLitre, farenheitCelsius, usCad, answer;
		
		// Allows re-execution of the program with do-while loop.
		
		do {
			System.out.println("Choose which converter you would like to use: ");
			System.out.println();
			System.out.println("(1) Would you like to convert a distance from miles to kilometers?");
			System.out.println("(2) Would you like to convert a weight from pounds to kilograms?");
			System.out.println("(3) Would you like to convert a volume from gallons to litres?");
			System.out.println("(4) Would you like to convert a temperature from farenheit to celsius?");
			System.out.println("(5) Would you like to convert a currency from US to CAD?");
	
			choice = sc.nextInt();
	
			if (choice == 1) {
				System.out.println();
				System.out.println("Enter any amount of miles: ");
				milesKilometers = sc.nextDouble();
				answer = milesKilometers * 1.609;
				System.out.println(df3.format(milesKilometers) + " miles is equal to " + df3.format(answer) + " kilometers.");
	
			} else if (choice == 2) {
				System.out.println();
				System.out.println("Enter a weight in pounds: ");
				poundsKg = sc.nextDouble();
				answer = poundsKg / 2.205;
				System.out.println(df3.format(poundsKg) + " pounds is equal to " + df3.format(answer) + " kilograms.");
	
			} else if (choice == 3) {
				System.out.println();
				System.out.println("Enter a volume in gallons: ");
				gallonLitre = sc.nextDouble();
				answer = gallonLitre * 3.785;
				System.out.println(df2.format(gallonLitre) + " gallons is equal to " + df2.format(answer) + " litres.");
	
			} else if (choice == 4) {
				System.out.println();
				System.out.println("Enter a temperature in farenheit: ");
				farenheitCelsius = sc.nextDouble();
				answer = ((farenheitCelsius - 32) * 0.55555555555);
				System.out.println(df3.format(farenheitCelsius) + " degrees farenheit is equal to " + df3.format(answer) + " degrees celsius.");
	
			} else if (choice == 5) {
				System.out.println();
				System.out.println("Enter an amount of money in US currency: ");
				usCad = sc.nextDouble();
				answer = usCad * 1.34;
				System.out.println(df2.format(usCad) + " is equal to: " + df2.format(answer) + " CAD.");
	
			} else {
				System.out.println();
				System.out.println("INVALID ENTRY!");
				System.out.println("re-run program.");
				choice = sc.nextInt();
			}
	
			System.out.println();
			System.out.println("Do you want to use another converter? Yes or No");
			finalAnswer = sc.next();
			
		// End of the loop.
		} while (finalAnswer.equalsIgnoreCase("Yes"));
	}
}