import java.util.*;

public class CH5Q42 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int hits, atBats, eligibility;
		
		System.out.println("Enter the total amount of bats by the player: ");
		atBats = sc.nextInt();

		System.out.println();
		System.out.println("Enter the amount of hits by the player: ");
		hits = sc.nextInt();
		
		eligibility = hits/atBats;
		
		if (eligibility > 0.3) {
			System.out.println("The player is eligible for the All Stars Game!");
		} else {
			System.out.println("The player is NOT eligible.");
		}
	
	}
}