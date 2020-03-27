import java.util.*;

public class CH5Q46 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String word;

		System.out.println("Enter a valid email address: ");

		word = sc.next();

		System.out.println();
		if (word.contains("@")) {
			System.out.println("This is a valid email address. ");
		} else {
			System.out.println("This is not a valid email address. ");
		}
	}
}