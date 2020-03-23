import java.util.*;
import java.text.DecimalFormat;

/*
This program calculates the Body Mass Index (BMI) of a person. The user should input the
weight in pounds and height in feet, and the program should output the weight converted to kilograms,
height converted to meters, the calculated BMI (BMI = Kg/(m2)), and its classification as underweight,
normal, overweight or obese.
@author Constantinos Korres
*/

public class Question2 {

	private static DecimalFormat df2 = new DecimalFormat("#.#");
		
		public static void main(String[] args) {
	
		// Scanner creation.
		Scanner sc = new Scanner(System.in);
	
		// Identifying and defining variables.
		double weight, height, bmi;
	
		System.out.println("Enter your weight in pounds: ");
		weight = sc.nextDouble();

		System.out.println("Enter your height in feet(#.#): ");
		height = sc.nextDouble();
	
		// Formula.
		bmi = (weight/2.205)/((height/3.281)*(height/3.281));
		
		// "if" statements to execute program.
		if (bmi <= 18.5) {
			System.out.println("Your BMI is: " + df2.format(bmi) + ". " + "You're underweight.");
		} if ((bmi > 18.5) && (bmi <= 24.9)) {
			System.out.println("Your BMI is: " + df2.format(bmi) + ". " + "You're normal.");
		} if ((bmi > 24.9) && (bmi <= 29.9)) {
			System.out.println("Your BMI is: " + df2.format(bmi) + ". " + "You're overweight. ");
		} if ((bmi > 29.9) && (bmi <= 34.9)) {
			System.out.println("Your BMI is: " + df2.format(bmi) + ". " + "You're obese.");
		} if (bmi > 34.9) {
			System.out.println("Your BMI is: " + df2.format(bmi) + ". " + "You're extremely obese.");
		}
	
	}
}