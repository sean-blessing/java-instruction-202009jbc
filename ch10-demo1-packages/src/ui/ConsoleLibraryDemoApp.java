package ui;

import ui.console.Console;

public class ConsoleLibraryDemoApp {

	public static void main(String[] args) {
		System.out.println("hello");
		
		String str = Console.getLine("Enter a sentence: ");
		
		int n = Console.getInt("Enter a # between 1 and 10: ", 1, 10);
		
		System.out.println(str);
		System.out.println(n);
		
		System.out.println("Bye");

	}

}
