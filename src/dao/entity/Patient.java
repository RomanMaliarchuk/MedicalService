package dao.entity;

import java.util.Date;

public class Patient extends Person{

	private long patientID;
	private String address;
	private Date birthday;
	
	Patient() {}
	
	Patient(String firstName, String secondName, String surName, String phoneNumber, String address, Date birthday){
		super(firstName, secondName, surName, phoneNumber);
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
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result
				+ ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result + (int) (patientID ^ (patientID >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
			return false;
		if (patientID != other.patientID)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Patient [patientID=" + patientID + ", address=" + address
				+ ", birthday=" + birthday + "]";
	}

	
}
