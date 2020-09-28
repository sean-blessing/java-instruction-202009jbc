import java.util.Scanner;

public class StringsApp {

	public static void main(String[] args) {
		// get input from user via Scanner
		
		Scanner sc = new Scanner(System.in);
		
		// get an int
		System.out.println("Enter a whole#: ");
		int n1 = sc.nextInt();
		
		// get a word
		System.out.print("Enter a word: ");
		String word = sc.next();
		// get a line of text
		System.out.println("Enter a line of text:");
		sc.nextLine();
		String sentence = sc.nextLine();
		
		System.out.println("Your sentence: "+sentence);
		
		System.out.println("Bye!");

	}

}
