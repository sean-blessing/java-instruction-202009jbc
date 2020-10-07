import java.util.Scanner;

public class BmdbApp {
	
	public static void main(String[] args) {
		System.out.println("Welcome to the bmdb app!");
		
		int command = 0;
		
		while (command!=3) {
			System.out.println("Command Menu:");
			System.out.println("1 - Add Actor");
			System.out.println("2 - Add Movie");
			System.out.println("3 - Exit");
			System.out.println();
			
			command = Console.getInt("Command:  ");
			System.out.println();
			
			switch(command) {
			case 1:
				//add Actor
				System.out.println("Add an Actor:  ");
				String fn = Console.getString("First Name? ");
				String ln = Console.getString("Last Name? ");
				String g = Console.getString("Gender? ");
				String bd = Console.getString("Birth Date? ");
				
				Actor actor = new Actor(fn,ln,g,bd);
				System.out.println(actor.displaySummary());
				System.out.println();
				break;
			case 2:
				// add Movie
				System.out.println("Add a Movie:  ");
				String t = Console.getLine("Title? ");
				String y = Console.getString("Year? ");
				String r = Console.getString("Rating? ");
				String gr = Console.getString("Genre? ");
				
				Movie movie = new Movie(t,y,r,gr);
				System.out.println(movie.displaySummary());
				System.out.println();
				break;
			case 3:
				// exit..  do nothing
				break;
			default:
				System.out.println("Invalid Command.  Try Again.");
				break;
			
			}
			
		}

		System.out.println("bye");
	}

}
