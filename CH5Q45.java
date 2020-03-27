import java.util.*;

public class CH5Q45 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String sentence;

		System.out.println("Enter a sentence using proper english ponctuation: ");
		sentence = sc.nextLine();

		if (sentence.endsWith(".")) {
			System.out.println("This is a declarative sentence.");
		} else if (sentence.endsWith("!")) {
			System.out.println("This is an exclamatory sentence.");
		} else if (sentence.endsWith("?")) {
			System.out.println("This is an interagotary sentence.");
		} else {
			System.out.println("This is another type of sentence.");
		}

	}
}