package contacts;

public class Address extends ContactInfo{

	private String street;
	private String city;
	private String country;
	private String postalCode;

	public Address setStreet(String street) {
		this.street = street;
		return this;
	}

	public Address setCity(String city) {
		this.city = city;
		return this;
	}

	public Address setCountry(String country) {
		this.country = country;
		return this;
	}

	public Address setPostalCode(String postalCode) {
		this.postalCode = postalCode;
		return this;
	}
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", country="
				+ country + ", postalCode=" + postalCode + "]";
	}
}
