package sandbox;

import java.util.*;

public class JavaLoopsIIApp {
	public static void main(String[] argh) {
		System.out.println("Here we go!!!");
		System.out.print("t? ");
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			System.out.print("a b n? ");
			int a = in.nextInt();  //5
			int b = in.nextInt();  //3
			int n = in.nextInt();  //5
			String msg = "";
			int result = a;
			for (int j = 0; j < n; j++) {
				result += (Math.pow(2, j)) * b;
				msg += result + " ";
			}
			System.out.println(msg);
		}
		in.close();
		System.out.println("Bye");
	}
}