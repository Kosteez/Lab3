import java.util.*;

public class CH5Q44 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double square, rectangle;
		
		square = 0.666666667*0.666666667;
		rectangle = 1/9 * 4;
		System.out.println("The area of the square is: " + square + ".");
		System.out.println("The area of the rectangle is: " + rectangle + ".");
		System.out.println();

		if (square == rectangle) {
			System.out.println("These two shapes have equal areas.");
		} else {
			System.out.println("These two shapes do not have equal areas.");
		}

	}
}