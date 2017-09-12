package dao.entity;

import java.util.Date;

public class ReceptionRecord {
	
	private Doctor doctor;
	private Patient patient;
	private Date dateOfAdmission;
	private int hourOfAdmission;
	private String problem;
	
	public ReceptionRecord() {}
	
	public ReceptionRecord(Doctor doctor, Patient patient, Date dateOfAdmission, int hourOfAdmission, String problem){
		this.doctor = doctor;
		this.patient = patient;
		this.dateOfAdmission = dateOfAdmission;
		this.hourOfAdmission = hourOfAdmission;
		this.problem = problem;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Date getDateOfAdmission() {
		return dateOfAdmission;
	}

	public void setDateOfAdmission(Date dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}

	public int getHourOfAdmission() {
		return hourOfAdmission;
	}

	public void setHourOfAdmission(int hourOfAdmission) {
		this.hourOfAdmission = hourOfAdmission;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dateOfAdmission == null) ? 0 : dateOfAdmission.hashCode());
		result = prime * result + ((doctor == null) ? 0 : doctor.hashCode());
		result = prime * result + hourOfAdmission;
		result = prime * result + ((patient == null) ? 0 : patient.hashCode());
		result = prime * result + ((problem == null) ? 0 : problem.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReceptionRecord other = (ReceptionRecord) obj;
		if (dateOfAdmission == null) {
			if (other.dateOfAdmission != null)
				return false;
		} else if (!dateOfAdmission.equals(other.dateOfAdmission))
			return false;
		if (doctor == null) {
			if (other.doctor != null)
				return false;
		} else if (!doctor.equals(other.doctor))
			return false;
		if (hourOfAdmission != other.hourOfAdmission)
			return false;
		if (patient == null) {
			if (other.patient != null)
				return false;
		} else if (!patient.equals(other.patient))
			return false;
		if (problem == null) {
			if (other.problem != null)
				return false;
		} else if (!problem.equals(other.problem))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ReceptionRecord [doctor=" + doctor + ", patient=" + patient
				+ ", dateOfAdmission=" + dateOfAdmission + ", hourOfAdmission="
				+ hourOfAdmission + ", problem=" + problem + "]";
	}
	
	
}
