package sandbox;

public class StringToTitleCaseApp {

	public static void main(String[] args) {
		String name = "samantha";
		System.out.println(name);
		
		char[] arr = name.toCharArray();
		String newName = Character.toString(name.charAt(0)).toUpperCase();
		newName += name.substring(1);
		System.out.println(newName);
		

	}

}
