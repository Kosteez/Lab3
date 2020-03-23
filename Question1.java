import java.util.*;
import java.text.DecimalFormat;

/*
This program calculates the area of a circle, based on a radius given by the user. If the input is
negative, or zero, the program does not calculate the area, but warn the user of the mistake.
@author Constantinos Korres
 */

public class Question1 {
	
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	public static void main(String[] args) {
	
		// Scanner creation.
		Scanner sc = new Scanner(System.in);
	
		// Identifying and defining variables.
		double radius, area;
		final double pi;
	
		System.out.println("Enter the radius of the desired circle: ");
		radius = sc.nextDouble();
		
		// Checking if the radius is less or equal to zero.
		if (radius<=0) {
			System.out.println("You must enter a valid radius.\n");
		} else {
	
		// Formulas.
		pi = 3.1416;
		area = pi*radius*radius;
	
		// Result.
		System.out.println("The area of your circle is " + df2.format(area));
		}
	}
}