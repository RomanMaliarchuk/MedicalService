package controller.dispatcher;

import java.util.Date;

import controller.service.ServicePatient;
import dao.entity.Patient;

public class Menu_4_AddNewPatient extends SettingForMenu{
	
	public void addNewPatient(){
		
		System.out.println();
		System.out.println("================================================================================");
		System.out.println("Вибрано пункт 4 - Додати нового пацієнта");
		System.out.println();
		
		Patient patient = new Patient();
		
		System.out.print("Вкажіть прізвище пацієнта --> ");
		patient.setFirstName(keyConsole.nextLine());
		
		System.out.print("Вкажіть ім'я пацієнта --> ");
		patient.setSurName(keyConsole.nextLine());
		
		System.out.print("Вкажіть номер телефону пацієнта --> ");
		patient.setPhoneNumber(keyConsole.nextLine());
		
		System.out.print("Вкажіть адресу пацієнта --> ");
		patient.setAddress(keyConsole.nextLine());
		
		do {
			System.out.print("Вкажіть дату народження пацієнта (ДД.ММ.РРРР) --> ");
			inputCommand = keyConsole.nextLine();
			if (isCorrectDateBirthdaye(inputCommand)) break;
			System.out.print("Некоректно введено дату народження");
		}while(true);
		
		patient.setBirthday(new Date());
		
		System.out.print("Зробити запис до журналу (Y/N) --> ");
		inputCommand = keyConsole.nextLine();
		
		if(inputCommand.equalsIgnoreCase("Y")){
			servicePatient.addNewPatient(patient);
			System.out.println("Дані про нового пацієнта успішно збережено");
		}else{
			System.out.println("Дані про нового пацієнта не збережено");
		}
		
		
	}
		
		
	private boolean isCorrectDateBirthdaye(String inputCommand){
		return true;
	}
	

}
