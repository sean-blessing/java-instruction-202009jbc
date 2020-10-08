
public class StringsApp {
	//p. 425
	public static void main(String[] args) {
		System.out.println("hello");
		
		String name = "Eddie Van Halen";
		System.out.println(name + " is "+name.length()+" characters long.");
		int idx1 = name.indexOf(" ");
		System.out.println(idx1);
		int idx2 = name.indexOf(" ",6);
		System.out.println(idx2);
		String fName = name.substring(0,idx1);
		String mName = name.substring(idx1 + 1,idx2);
		String lName = name.substring(idx2+1);
		System.out.println("fName = "+fName);
		System.out.println("mName = "+mName);
		System.out.println("lName = "+lName);
		
		
		String name1 = "Bob Marley          ";
		name1 = name1.trim();
		System.out.println(name1+".");
		String bob = name1.substring(0,3);
		System.out.println("first name = "+bob);
		
		name1 = name1.replace(" ", "-");
		System.out.println(name1);
		
		String sentence = "Is it lunch time yet?";
		String[] words = sentence.split(" ");
		for (String s: words) {
			System.out.println(s);
		}
		
		StringBuilder sentence2 = new StringBuilder();
		sentence2.append("Hello, ");
		sentence2.append("how ");
		sentence2.append("are ");
		sentence2.append("you?");
		System.out.println(sentence2);
		System.out.println("capacity = "+sentence2.capacity());
		System.out.println("length = "+sentence2.length());
		
		sentence2.insert(7, "Dolly ");
		System.out.println(sentence2);

		System.out.println("bye");
	}

}
