import java.util.*;

public class CH5Q50 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double temp;

		System.out.println("Enter a temperature: ");
		temp = sc.nextDouble();

		if (temp >= 90) {
			System.out.println("Based on past weather reports it is currently summer.");
		} else if (temp >= 70 && temp < 90) {
			System.out.println("Based on past weather reports it is currently spring.");
		} else if (temp >= 50 && temp < 70) {
			System.out.println("Based on past weather reports it is currently autumn.");
		} else if (temp < 50) {
			System.out.println("Based on past weather reports it is currently winter.");
		} else if (temp > 110 && temp < -5){
			System.out.println("Temperature entered beyong valid range..");
		}
		
	}
}