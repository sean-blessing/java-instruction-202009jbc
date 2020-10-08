package ui;

import ui.console.Console;

public class ShapeCreatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the shape creator app!");
		
		System.out.println("Create a rectangle!");
		int length = Console.getInt("Enter length: ");
		int width = Console.getInt("Enter width: ");
		
		String row = "";
		//first loop - width (rows)
		for (int i=0; i< width; i++) {
			//for each row, how many columns (length)?
			for (int j=0; j< length; j++) {
				row+="*";
			}
			System.out.println(row);
			row = "";
		}
		
		System.out.println("bye");

	}

}
