import java.util.*;

public class CH5Q47 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String pswrd1, pswrd2;

		System.out.println("Enter your password: ");
		pswrd1 = sc.next();

		System.out.println("Re-enter your password: ");
		pswrd2 = sc.next();

		if (Objects.equals(pswrd1,pswrd2)) {
			System.out.println("Your are now registered as a new user.");
		} else {
			System.out.println("Sorry there is a typo in your password.");
		}

	}
}