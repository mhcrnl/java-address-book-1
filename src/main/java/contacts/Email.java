package contacts;

public class Email extends ContactInfo {
	private String email;

	public String getEmail() {
		return email;
	}

	public Email setEmail(String email) {
		this.email = email;
		return this;
	}

	@Override
	public String toString() {
		return "Email [email=" + email + "]";
	}

}
