package dao.repository;

import java.util.ArrayList;

import dao.entity.Doctor;

public interface CRUDDoctor{
	
	void addNewDoctor(Doctor doctor);
	ArrayList<Doctor> getListAllDoctors();

}
