package ui;

import java.util.ArrayList;
import java.util.List;

import business.Contact;

public class ContactManagerApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Contact Manager App!");
		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("Mike Murach", null, "800-221-5528"));
		contacts.add(new Contact("Anne Boehm", null, null));
		contacts.add(new Contact("Joel Murach", "joel@murach.com", null));
		
		System.out.println("All Contacts:");
		displayContacts(contacts);
		
		System.out.println("Contacts without phone numbers:");
		List<Contact> contactsWithoutPhone = new ArrayList<>();
		for (Contact c: contacts) {
			if (c.getPhone()==null) {
				contactsWithoutPhone.add(c);
			}
		}
		displayContacts(contactsWithoutPhone);
		
		System.out.println("Contacts without email addresses:");
		List<Contact> contactsWithoutEmail = new ArrayList<>();
		for (Contact c: contacts) {
			if (c.getEmail()==null) {
				contactsWithoutEmail.add(c);
			}
		}
		displayContacts(contactsWithoutEmail);
		
		
		System.out.println("Bye");

	}
	
	private static void displayContacts(List<Contact> contacts) {
		for (Contact c: contacts) {
			System.out.println(c);
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	

}
