package controller.service;

import java.util.ArrayList;

import dao.entity.Doctor;
import dao.repository.CRUDDoctorRepositoryImplementation;

public class ServiceDoctor {
	
	CRUDDoctorRepositoryImplementation CRUDDoctor = new CRUDDoctorRepositoryImplementation();

	
	
	public void addDoctor(Doctor doctor){
		new CRUDDoctorRepositoryImplementation().addDoctor(doctor);
	}
	
	
	
	public ArrayList<Doctor> getListAllDoctors(){
		ArrayList<Doctor> listAllDoctors = CRUDDoctor.getListAllDoctors();
		return listAllDoctors;
	}
	
	
}
