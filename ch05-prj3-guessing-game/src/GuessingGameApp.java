import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the guessing game!!!");
		System.out.println("+++++++++++++++++++++++++++++++");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			//* continue loop starts here
			// Start a game - generate random number (theNumber)
			// Display the "I'm thinking..." message
			// - initialize the count variable = 0
			
				//* 'win' loop starts 'guess == theNumber'???
				// prompt user input (guess)
				// - validate user entry:  int, within 1 to 100
				
				// biz logic 
				// - compare guess vs theNumber
				// - determine how far away
				// - display the appropriate message: win, tl, th, wtl, wth
				// - display the 'win' message: in requirements doc
				//* 'win' loop ends
			//* continue loop ends
			choice = getChoiceString("Try again? ", sc, "y", "n");
		}
		System.out.println("Bye!");

	}
	
	// get an integer from console
	// use exception handling to check input
	private static int getInt(String prompt, Scanner sc) {
		int nbr = 0;
		while (true) {
			try {
				System.out.print(prompt);
				nbr = sc.nextInt();
				break;
			} catch (InputMismatchException ime) {
				System.out.println("Error!  Invalid integer.  Try again.\n");
				sc.nextLine();
				continue;
			}
		}
		return nbr;
	}
	
	private static int getIntWithinRange(String prompt, Scanner sc, int min, int max) {
		int nbr = 0;
		boolean isValid = false;
		
		while (!isValid) {
			nbr = getInt(prompt, sc);
			if (nbr < min) {
				System.out.println("Error!  Number must be >= "+min+".");
			}
			else if (nbr > max) {
				System.out.println("Error!  Number must be <= "+max+".");
			}
			else {
				isValid = true;
			}
		}
		
		return nbr;
		
	}
	
	// get a required string which is only one of 2 valid choices (s1, s2)
	private static String getChoiceString(String prompt, Scanner sc,
										  String s1, String s2) {
		String str = "";
		boolean isValid = false;
		while (!isValid) {
			str = getRequiredString(prompt, sc);
			if (!str.equalsIgnoreCase(s1) && !str.equalsIgnoreCase(s2)) {
				// entry is invalid
				System.out.println("Invalid Entry:  Expected values are '"
						 			+ s1 +"' or '" + s2+"'.");
			}
			else {
				isValid = true;
			}
		}
		
		return str;
	}
	
	private static String getRequiredString(String prompt, Scanner sc) {
		String str = "";
		boolean isValid = false;
		while (!isValid) {
			System.out.print(prompt);
			str = sc.nextLine();
			if (str.equals("")) {
				System.out.println("Invalid Entry.. this field is required!");
			}
			else {
				isValid = true;
			}
		}
		
		return str;
	}
	
	
	
	
	
	
	
	
	
	
	

}
