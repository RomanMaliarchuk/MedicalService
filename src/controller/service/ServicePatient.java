package controller.service;

import java.util.ArrayList;

import dao.entity.Doctor;
import dao.entity.Patient;
import dao.repository.CRUDDoctor;
import dao.repository.CRUDDoctorImpl;
import dao.repository.CRUDPatient;
import dao.repository.CRUDPatientImpl;

public class ServicePatient {

	CRUDPatient CRUDpatient = new CRUDPatientImpl();
	
	public void addNewPatient(Patient patient){
		CRUDpatient.addNewPatient(patient);
	}
	
	
	public ArrayList<Patient> getListAllPatients(){
		return CRUDpatient.getListAllPatients();
	}
	

}
