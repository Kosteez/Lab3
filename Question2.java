import java.util.*;
import java.text.DecimalFormat;

public class Question2 {
private static DecimalFormat df2 = new DecimalFormat("#.#");
	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	double weight, height, bmi;

	System.out.println("Enter your weight in pounds: ");
	weight = sc.nextDouble();
	System.out.println("Enter your height in feet(#.#): ");
	height = sc.nextDouble();

	bmi = (weight/2.205)/((height/3.281)*(height/3.281));
	
	if (bmi <= 18.5) {
		System.out.println("Your BMI is: " + df2.format(bmi) + ". " + "You're underweight.");
	}
	if ((bmi > 18.5) && (bmi <= 24.9)) {
		System.out.println("Your BMI is: " + df2.format(bmi) + ". " + "You're normal.");
	}
	if ((bmi > 24.9) && (bmi <= 29.9)) {
		System.out.println("Your BMI is: " + df2.format(bmi) + ". " + "You're overweight. ");
	}
	if ((bmi > 29.9) && (bmi <= 34.9)) {
		System.out.println("Your BMI is: " + df2.format(bmi) + ". " + "You're obese.");
	}
	if (bmi > 34.9) {
		System.out.println("Your BMI is: " + df2.format(bmi) + ". " + "You're extremely obese.");
	}

	}
}