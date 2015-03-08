package contacts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddressBook {
	List<Contact> contacts = new ArrayList<Contact>();
	
	public void addContact(Contact contact){
		contacts.add(contact);
	}
	
	public Contact getContact(String name){
		for(Contact contact : contacts){
		if(contact.getFirstName().equals(name)){
			return contact;
		}
		else{
			System.out.println("Contact doesn't exist.");
		}
		}
		return null;
	}
	
	public void removeContact(String name){
		Iterator<Contact> iter = contacts.iterator();

		while(iter.hasNext()){
			Contact contact = iter.next();
			
			if (contact.getFirstName().equals(name)){
				System.out.println("Removing contact...");
				iter.remove();
			} else if(!contact.getFirstName().equals(name)){
				System.out.println("Cannot remove non-existing contact.");
			}
		}
	}
}
