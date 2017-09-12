package dao.repository;

import java.util.ArrayList;

import dao.entity.Doctor;

public interface CRUDDoctorRepository extends AccessToDataBase{
	
	public void addDoctor(Doctor doctor);
	public ArrayList<Doctor> getListAllDoctors();

}
