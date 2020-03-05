import java.util.*;
import java.text.DecimalFormat;

public class Question3 {
private static DecimalFormat df2 = new DecimalFormat("#.#");
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the temperature: ");
	double celsius = sc.nextDouble();

	if (celsius < 0) {
		System.out.println("The temperature " + celsius + " is below zero.");
	}
	if (celsius > 0) {
		System.out.println("The temperature " + celsius + " is above zero.");
	}
	if (celsius == 0) {
		System.out.println("The temperature is zero. Enter a different temperature.");
	}
	}
}