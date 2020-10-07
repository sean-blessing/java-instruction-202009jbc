import java.util.ArrayList;
import java.util.List;
// pp.388 - 391
public class SevenDwarvesCollectionsApp {

	public static void main(String[] args) {
		System.out.println("hello");

		List<String> dwarves = new ArrayList<>();
		dwarves.add("Doc");
		dwarves.add("Sleepy");
		dwarves.add("Grumpy");
		dwarves.add("Dopey");
		dwarves.add("Happy");
		dwarves.add(0,"Bashful");
		dwarves.add("Sneezy");
		System.out.println("7 Dwarves: "+dwarves);
		
		System.out.println("Dwarf at position 3: "+dwarves.get(3));
		
		System.out.println("# of dwarves: "+dwarves.size());
		
		
		System.out.println("contains 'Happy'? "+dwarves.contains("Happy"));
		System.out.println("contains 'happy'? "+dwarves.contains("happy"));
		
		System.out.println("Index of 'Dopey'? "+dwarves.indexOf("Dopey"));
		
		dwarves.add("Grumpy");
		System.out.println(dwarves);
		System.out.println("Index of 'Grumpy'? "+dwarves.indexOf("Grumpy"));
		
		dwarves.remove(3);
		System.out.println(dwarves);
		
		dwarves.set(3, "Temp Dwarf");
		System.out.println(dwarves);
		
		System.out.println("Bye");
	}

}
