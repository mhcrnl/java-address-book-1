package contacts;

import enums.CountryCode;

public class ContactAddress {
	private String street;
	private int streetNumber;
	private int postalCode;
	private String city;
	private String country;

	public ContactAddress() {
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String countryCode) {
		CountryCode cc = CountryCode.getByCode(countryCode);
		this.country = cc.getName();
	}
}