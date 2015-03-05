package clients;

import contacts.Address;
import contacts.Contact;
import contacts.ContactInfo;
import contacts.Email;
import contacts.Phone;
import data.PhoneType;

public class App {

	public static void main(String[] args) {
		ContactInfo phoneMobile = new Phone().setPhone(PhoneType.MOBILE,"0886722221");
		ContactInfo phoneHome = new Phone().setPhone(PhoneType.HOME,"032687593");
		ContactInfo phoneWork = new Phone().setPhone(PhoneType.WORK, "0290312222");
		ContactInfo homeAddress = new Address().setCity("Plovdiv").setCountry("Bulgaria");

		ContactInfo email = new Email().setEmail("simeonoff@me.com");
		ContactInfo email2 = new Email().setEmail("sim.simeonoff@gmail.com");
		
		Contact contact1 = new Contact();
		contact1.setInfo(phoneHome);
		contact1.setInfo(phoneMobile);
		contact1.setInfo(phoneWork);
		contact1.setInfo(email);
		contact1.setInfo(homeAddress);
		contact1.setInfo(email2);
		System.out.println(contact1);
				
	}
}