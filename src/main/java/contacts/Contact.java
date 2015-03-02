package contacts;

import interfaces.Favorable;

import java.time.LocalDate;

public class Contact {
	private String firstName;
	private String lastName;
	private int phone;
	private boolean favorite;
	private String email;
	private String homepage;
	private LocalDate birthday;
	private ContactAddress data = new ContactAddress();

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getPhone() {
		return phone;
	}

	public boolean isFavorite() {
		return favorite;
	}

	public String getEmail() {
		return email;
	}

	public String getHomepage() {
		return homepage;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public String getStreet() {
		return data.getStreet();
	}

	public int getStreetNumber() {
		return data.getStreetNumber();
	}

	public int getPostalCode() {
		return data.getPostalCode();
	}

	public String getCity() {
		return data.getCity();
	}

	public String getCountry() {
		return data.getCountry();
	}

	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName
				+ ", phone=" + phone + ", favorite=" + favorite + ", email="
				+ email + ", homepage=" + homepage + ", birthday=" + birthday
				+ ", street=" + data.getStreet() + ", streetNumber=" + data.getStreetNumber()
				+ ", postalCode=" + data.getPostalCode() + ", city=" + data.getCity()
				+ ", country=" + data.getCountry() + "]";
	}

	private Contact (Builder build){
		this.firstName = build.firstName;
		this.lastName = build.lastName;
		this.phone = build.phone;
		this.favorite = build.favorite;
		this.email = build.email;
		this.homepage = build.homepage;
		this.birthday = build.birthday;
		this.data.setStreet(build.street);
		this.data.setStreetNumber(build.streetNumber);
		this.data.setPostalCode(build.postalCode);
		this.data.setCity(build.city);
		this.data.setCountry(build.country);
	}
	
	public static class Builder implements Favorable{
		
		private String firstName;
		private String lastName;
		private int phone;
		private boolean favorite;
		private String email;
		private String homepage;
		private LocalDate birthday;
		private String street;
		private int streetNumber;
		private int postalCode;
		private String city;
		private String country;
		
		public Builder(String firstName,int phone){
			this.firstName = firstName;
			this.phone = phone;

		}
		public Builder lastName(String lastName){
			this.lastName = lastName;
			return this;
		}
		public Builder email(String email){
			this.email = email;
			return this;
		}
		public Builder homepage(String homepage){
			this.homepage = homepage;
			return this;
		}
		public Builder birthday(LocalDate birthday){
			this.birthday = birthday;
			return this;
		}
		public Builder street(String street){
			this.street = street;
			return this;
		}
		public Builder streetNumber(int streetNumber){
			this.streetNumber = streetNumber;
			return this;
		}
		public Builder city(String city){
			this.city = city;
			return this;
		}
		public Builder country(String country){
			this.country = country;
			return this;
		}
		public Contact build(){
			return new Contact(this);
		}
		public Builder favorite(boolean fav){
			this.favorite = fav;
			return this;
		}
	}
}