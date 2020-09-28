import java.util.Scanner;

public class IfStatementApp {

	public static void main(String[] args) {
		//p. 124
		
		String color = "yellow";
		
		//if (color == "red")  <-- don't do this!!
		if (color.equalsIgnoreCase("red")) {
			System.out.println("color is red");
			System.out.println("hey there");  // part of if statement
		}
		
		if (color.equalsIgnoreCase("red"))
			System.out.println("color is red");
		System.out.println("hello");  // not part of if statement - will always execute

		int total = 100;
		
		if (total == 50) {
			System.out.println("total is 50!");
		}
		else if (total > 50) {
			System.out.println("total is greater than 50!");
		}
		else if (total < 50) {
			System.out.println("total is less than 50!");
		}
		
		if (total >= 75) {
			System.out.println("total is greater than or equal to 75!");
		}
		else if (total <= 75 ) {
			System.out.println("total is less than or equal to 75!");
		}
		
		if (total != 0) {
			System.out.println("total is not equal to 0!");
		}
		
		// traffic light example
		int distanceFromLight = 30;  // yards from stopsign
		if (color.equalsIgnoreCase("red")) {
			System.out.println("Light is red...  STOP!");
		}
		else if (color.equalsIgnoreCase("green")) {
			System.out.println("Light is green...  GO!");			
		}
//		else if (color.equalsIgnoreCase("yellow") && distanceFromLight > 30) {
//			System.out.println("Light is yello and far away...  Slow down!");
//		}
//		else if (color.equalsIgnoreCase("yellow") && distanceFromLight <= 30) {
//			System.out.println("Light is yello and close...  Speed up or go!");
//		}
		else if (color.equalsIgnoreCase("yellow")) {
			if (distanceFromLight> 30) {
				System.out.println("Light is yello and far away...  Slow down!");
			}
			else if (distanceFromLight <= 30) {
				System.out.println("Light is yello and close...  Speed up or go!");
			}
		}
		else {
			System.out.println("Error - invalid light color");
		}
		
		// || condition, p. 123
		int favoriteNumber = 10;
		
		if (favoriteNumber == 10 || favoriteNumber == 11) {
			System.out.println("# is 10 or 11");
		}
		else {
			System.out.println("# is not 10 or 11");
		}
		
		// p. 124 - block scope
		// we want to add 2 numbers, if favorite # is 10
		int n1=0;
		int n2=0;
		if (favoriteNumber == 10) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter 2 numbers on one line:");
			n1 = sc.nextInt();
			n2 = sc.nextInt();
		}
		int sum = n1 + n2;
		System.out.println("sum = "+sum);
		
		
		
	}

}
