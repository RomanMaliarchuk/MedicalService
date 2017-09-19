package controller.dispatcher;

import java.util.ArrayList;
import dao.entity.Doctor;

public class Menu_2_ViewAllDoctors extends SettingForMenu{
	
	public void viewListAllDoctors(){
	// метод перегляду журналу прийому до лікаря
		
		System.out.println();
		System.out.println("===================================================================================");
		System.out.println("Вибрано пункт 2 - Перегляд списку всіх лікарів");
		System.out.println();
		
		ArrayList<Doctor> listAllDoctors = serviceDoctor.getListAllDoctors();
		showDoctor.showListAllDoctors(listAllDoctors);
		
	}

}
