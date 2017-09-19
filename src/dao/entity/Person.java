package dao.entity;

public abstract class Person {
	
	private String firstName;
	private String surName;
	private String phoneNumber;
	
	public Person() {}
	
	public Person(String firstName, String surName, String phoneNumber){
		this.firstName = firstName;
		this.surName = surName;
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", surName=" + surName
				+ ", phoneNumber=" + phoneNumber + "]";
	}

	
}
