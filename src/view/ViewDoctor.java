package view;

import java.util.ArrayList;

import dao.entity.Doctor;

public class ViewDoctor {
	
	
	
	public void showListAllDoctors(ArrayList<Doctor> listAllDoctors){
		for(int i = 0; i<listAllDoctors.size(); i++){
			Doctor doctor = listAllDoctors.get(i);
			System.out.println( (i+1) + "." + doctor.getFirstName() + " " + doctor.getSecondName() + " " + 
			doctor.getSurName() + " " + doctor.getSpecialization() + " Тел:" + doctor.getPhoneNumber());
		}
	}

	
	
}
