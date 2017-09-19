package dao.repository;

import java.util.ArrayList;

import dao.entity.Doctor;
import dao.entity.Patient;

public interface CRUDPatient {
	
	void addNewPatient(Patient patient);
	ArrayList<Patient> getListAllPatients();

}
