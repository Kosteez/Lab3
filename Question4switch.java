import java.util.*;
import java.text.DecimalFormat;

public class Question4switch {
private static final DecimalFormat df2 = new DecimalFormat("#.##");
private static final DecimalFormat df3 = new DecimalFormat("#");

	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String distance, weight, gaz, temp, money;
	int choice;
	double milesKilometers, poundsKg, gallonLitre, farenheitCelsius, usCad, answer;

	System.out.println("Choose which converter you would like to use: ");
	System.out.println();
	System.out.println("(1) Would you like to convert a distance from miles to kilometers?");
	System.out.println("(2) Would you like to convert a weight from pounds to kilgrams?");
	System.out.println("(3) Would you like to convert a volume from gallons to litres?");
	System.out.println("(4) Would you like to convert a temperature from farenheit to celsius?");
	System.out.println("(5) Would you like to convert a currency from US to CAD?");

	choice = sc.nextInt();

    switch (choice) {
        case 1:
            System.out.println();
            System.out.println("Enter any amount of miles: ");
            milesKilometers = sc.nextDouble();
            answer = milesKilometers * 1.609;
            System.out.println();
            System.out.println(df3.format(milesKilometers) + " miles is equal to " + df3.format(answer) + " kilometers.");
            break;
        case 2:
            System.out.println();
            System.out.println("Enter a weight in pounds: ");
            poundsKg = sc.nextDouble();
            answer = poundsKg / 2.205;
            System.out.println();
            System.out.println(df3.format(poundsKg) + " pounds is equal to " + df3.format(answer) + " kilograms.");
            break;
        case 3:
            System.out.println();
            System.out.println("Enter a volume in gallons: ");
            gallonLitre = sc.nextDouble();
            answer = gallonLitre * 3.785;
            System.out.println();
            System.out.println(df2.format(gallonLitre) + " gallons is equal to " + df2.format(answer) + " litres.");
            break;
        case 4:
            System.out.println();
            System.out.println("Enter a temperature in farenheit: ");
            farenheitCelsius = sc.nextDouble();
            answer = (farenheitCelsius - 32) * (5 / 9);
            System.out.println();
            System.out.println(df3.format(farenheitCelsius) + " degrees farenheit is equal to " + df3.format(answer) + " degrees celsius.");
            break;
        case 5:
            System.out.println();
            System.out.println("Enter an amount of money in US currency: ");
            usCad = sc.nextDouble();
            answer = usCad * 1.34;
            System.out.println();
            System.out.println(df2.format(usCad) + " is equal to: " + df2.format(answer) + " CAD.");
            break;
        default:
            System.out.println();
            System.out.println("INVALID ENTRY!");
            System.out.println("RE-RUN PROGRAM AND ENTER A VALID OPTION!");
            break;
    }

}
}