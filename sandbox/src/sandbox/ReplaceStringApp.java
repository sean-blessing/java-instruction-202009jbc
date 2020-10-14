package sandbox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReplaceStringApp {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		String newStr = "";
		char[] c = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {

			if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {

				str = str.replace(c[i], '*');

			}

		}
		System.out.println(str);
		
		System.out.println("Or its easier with regular expressions!");
		System.out.println("Enter another string: ");
		str = sc.nextLine();
		newStr = str.replaceAll("[aeiouAEIOU]", "*");
		System.out.println(newStr);

	}

}
