package controller.dispatcher;

import java.util.ArrayList;

import dao.entity.Doctor;
import dao.entity.Patient;

public class Menu_5_ViewAllPatients extends SettingForMenu{
	
	public void viewListAllPatients(){
		// метод перегляду журналу прийому до лікаря
			
			System.out.println();
			System.out.println("===================================================================================");
			System.out.println("Вибрано пункт 5 - Перегляд списку всіх пацієнтів");
			System.out.println();
			
			ArrayList<Patient> listAllPatients = servicePatient.getListAllPatients();
			showPatient.showListAllPatients(listAllPatients);
			
		}
}
