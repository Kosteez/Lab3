import java.util.*;
import java.text.DecimalFormat;

public class Question1 {
private static DecimalFormat df2 = new DecimalFormat("#.##");

	public static void main(String[] args) {

	//scanner
	Scanner sc = new Scanner(System.in);

	//variable identification
	double radius, area;
	final double PI;

	System.out.println("Enter the radius of the desired circle: ");
	radius = sc.nextDouble();
	
	//if the radius is negative or zero
	if (radius<=0) {
		System.out.println("You must enter a valid radius. Re-reun the program. ");
	} else {

	//formulas
	PI = 3.1416;
	area = PI*radius*radius;

	//result
	System.out.println("The area of your circle is " + df2.format(area));
	}

	}
}