package sandbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaSubstringComparisonsApp {

	public static void main(String[] args) {
		String s = "welcometojava";
		int k = 3;
		String smallest = "";
		String largest = "";

		// char[] arr = s.toCharArray();
		String str = "";
		List<String> coll = new ArrayList<>();
		System.out.println(s.length());
		if (s.length() >= k) {
			for (int i = 0; i < s.length(); i++) {
				if ((i + k) <= s.length()) {
					coll.add(s.substring(i, i+k));
				}
			}
		}
		Collections.sort(coll);
		System.out.println(coll);
		smallest = coll.get(0);
		largest = coll.get(coll.size()-1);
		System.out.println(smallest + "\n" + largest);

	}

}
