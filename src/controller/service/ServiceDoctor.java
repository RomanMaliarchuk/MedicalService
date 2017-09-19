package controller.service;

import java.util.ArrayList;

import dao.entity.Doctor;
import dao.repository.CRUDDoctor;
import dao.repository.CRUDDoctorImpl;

public class ServiceDoctor {
	
	CRUDDoctor CRUDdoctor = new CRUDDoctorImpl();

	
	public void addNewDoctor(Doctor doctor){
		CRUDdoctor.addNewDoctor(doctor);
	}
	
	
	public ArrayList<Doctor> getListAllDoctors(){
		return CRUDdoctor.getListAllDoctors();
	}
	
}
