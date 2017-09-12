package dao.entity;

public class Doctor extends Person{
	
	private long doctorID;
	private String specialization;
	
	public Doctor() {}
	
	public Doctor(String firstName, String secondName, String surName, String phoneNumber, String specialization){
		super(firstName, secondName, surName, phoneNumber);
		this.specialization = specialization;
	}

	public long getDoctorID() {
		return doctorID;
	}

	public void setDoctorID(long doctorID) {
		this.doctorID = doctorID;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (int) (doctorID ^ (doctorID >>> 32));
		result = prime * result
				+ ((specialization == null) ? 0 : specialization.hashCode());
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
		Doctor other = (Doctor) obj;
		if (doctorID != other.doctorID)
			return false;
		if (specialization == null) {
			if (other.specialization != null)
				return false;
		} else if (!specialization.equals(other.specialization))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Doctor [doctorID=" + doctorID + ", specialization="
				+ specialization + "]";
	}

	
}
