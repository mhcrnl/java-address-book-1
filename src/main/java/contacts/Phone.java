package contacts;

import data.PhoneType;

public class Phone extends ContactInfo{
	private String phone;
	private String phoneType;
	
	public String getPhone() {
		return phone;
	}

	public Phone setPhone(PhoneType pType, String phone) {
		this.phoneType = pType.toString();
		this.phone = phone;
		return this;
	}

	@Override
	public String toString() {
		return phoneType + ": [phone=" + phone + "]";
	}

}
