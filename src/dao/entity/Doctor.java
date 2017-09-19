package dao.entity;

public class Doctor extends Person{
	
	private long doctorID;
	private String specialization;
	
	public Doctor() {}
	
	public Doctor(String firstName, String surName, String phoneNumber, String specialization){
		super(firstName, surName, phoneNumber);
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
	public String toString() {
		return super.toString() + "Doctor [doctorID=" + doctorID + ", specialization="
				+ specialization + "]";
	}

}
