package view;

import java.util.ArrayList;

import dao.entity.Doctor;
import dao.entity.Patient;

public class ViewPatient {
	
	public void showListAllPatients(ArrayList<Patient> listAllPatients){
		for(int i = 0; i<listAllPatients.size(); i++){
			Patient patient = listAllPatients.get(i);
			System.out.println( (i+1) + "." + patient.getFirstName() + " " + patient.getSurName() + " " 
			+ patient.getPhoneNumber() + " " + patient.getAddress() + " " + patient.getBirthday().toString());
		}
	}

}
