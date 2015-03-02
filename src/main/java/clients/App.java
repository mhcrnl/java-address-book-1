package clients;

import java.time.LocalDate;

import contacts.Contact;
import enums.CountryCode;

public class App {

	public static void main(String[] args) {
		Contact firstContact = new Contact.Builder("Simeon", 1235566)
		.birthday(LocalDate.of(1912, 4, 13))
		.lastName("Simeonoff")
		.email("simeonoff@test.com")
		.favorite(false)
		.city("Sofia")
		.country(CountryCode.BG.toString())
		.build();
		System.out.println(firstContact);
	}

}