package contacts;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

public class Contact {

	private String firstName;
	private String lastName;
	private String nickName;
	private String company;
	private LocalDate birthday;
	private String note;
	private Set<ContactInfo> cInfo = new LinkedHashSet<ContactInfo>();

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setInfo(ContactInfo info) {
		cInfo.add(info);
	}

	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName
				+ ", nickName=" + nickName + ", company=" + company
				+ ", birthday=" + birthday + ", note=" + note + ", info="
				+ cInfo + "]";
	}

}
