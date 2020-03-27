import java.util.*;

public class CH5Q48 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String userID;
		int countUserId;

		System.out.println("Enter your user ID: ");
		userID = sc.next();
		countUserId = userID.length();

		if (countUserId >= 6 && countUserId <= 10) {
			System.out.println("Welcome, " + userID);
		} else {
			System.out.println("Sorry, user ID invalid.");
		}
	}
}