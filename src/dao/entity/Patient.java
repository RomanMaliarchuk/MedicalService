package dao.entity;

import java.util.Date;




public class Patient extends Person{

	private long patientID;
	private String address;
	private Date birthday;
	
	public Patient() {}
	
	public Patient(String firstName, String surName, String phoneNumber, String address, Date birthday){
		super(firstName, surName, phoneNumber);
		this.address = address;
		this.birthday = birthday;
	}

	public long getPatientID() {
		return patientID;
	}

	public void setPatientID(long patientID) {
		this.patientID = patientID;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return super.toString() + "Patient [patientID=" + patientID + ", address=" + address
				+ ", birthday=" + birthday + "]";
	}

	
}
