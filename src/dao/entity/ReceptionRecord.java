package dao.entity;

import java.util.Date;

public class ReceptionRecord {
	
	private long recordID;
	private long doctorID;
	private long patientID;
	private Date dateTimeOfAdmission;
	private String problem;
	
	public ReceptionRecord() {}
	
	public ReceptionRecord(long doctor, long patient, Date dateTimeOfAdmission, String problem){
		this.doctorID = doctor;
		this.patientID = patient;
		this.dateTimeOfAdmission = dateTimeOfAdmission;
		this.problem = problem;
	}

	public long getRecordID() {
		return recordID;
	}

	public void setRecordID(long recordID) {
		this.recordID = recordID;
	}

	public long getDoctorID() {
		return doctorID;
	}

	public void setDoctorID(long doctorID) {
		this.doctorID = doctorID;
	}

	public long getPatientID() {
		return patientID;
	}

	public void setPatientID(long patientID) {
		this.patientID = patientID;
	}

	public Date getDateTimeOfAdmission() {
		return dateTimeOfAdmission;
	}

	public void setDateTimeOfAdmission(Date dateTimeOfAdmission) {
		this.dateTimeOfAdmission = dateTimeOfAdmission;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	@Override
	public String toString() {
		return "ReceptionRecord [recordID=" + recordID + ", doctorID="
				+ doctorID + ", patientID=" + patientID
				+ ", dateTimeOfAdmission=" + dateTimeOfAdmission + ", problem="
				+ problem + "]";
	}

}
