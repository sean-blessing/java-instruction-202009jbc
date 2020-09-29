import java.util.Scanner;

public class GreatestCommonDivisorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Greatest Common Divisor App!");
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		//* while start
		while (choice.equalsIgnoreCase("y")) {
			
			System.out.println();
			// get input from user - x, y as ints
			System.out.print("Enter first number:  ");
			int x = sc.nextInt();
			System.out.print("Enter second number:  ");
			int y = sc.nextInt();
			System.out.println();
			
			// biz logic - euclidean algorithm
			while (x > 0) {
				while (y >= x) {
					y -= x;
				}
				// swap x & y
				int tempY = y;
				y = x;
				x = tempY;
			}
			
			// display output - gcd as int
			// y is gcd
			System.out.println("Greatest common divisor: "+y);
			System.out.println();
			System.out.print("Continue?");
			choice = sc.next();
			System.out.println();
			//* while end
		}
		
		System.out.println("Bye!");
		sc.close();
	}

}
