
public class ProductManagerApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("hello");
		Product p = new Product("java", "Murach's Java", 57.50);
		p.print();
		Employee e = new Employee("Harry", "Styles",
				"111-222-3333", 2);
		
		printMultiple(p,5);
		printMultiple(e,3);
		
		// p.317 - clone some products - no way to do this now
		Product p1 = new Product("java", "Murach's Java", 57.50);
		Product p2 = (Product)p1.clone();
		p1.print();
		p2.print();
		
		
		System.out.println("bye");
	}
	
	//p.303
	private static void printMultiple(Printable p,
									  int count) {
		for (int i=0; i<count; i++) {
			p.print();
		}
	}

}
