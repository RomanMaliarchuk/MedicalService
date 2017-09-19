package controller.dispatcher;

import dao.entity.Doctor;

public class Menu_1_AddNewDoctor extends SettingForMenu{

	public void addNewDoctor(){
	// метод для додавання до журналу нового лікаря
		
		System.out.println();
		System.out.println("================================================================================");
		System.out.println("Вибрано пункт 1 - Внести дані до журналу про нового лікаря");
		System.out.println();
		
		Doctor doctor = new Doctor();
		
		System.out.print("Вкажіть прізвище лікаря --> ");
		doctor.setFirstName(keyConsole.nextLine());
			
		System.out.print("Вкажіть ім'я лікаря --> ");
		doctor.setSurName(keyConsole.nextLine());
		
		System.out.print("Вкажіть номер телефону лікаря --> ");
		doctor.setPhoneNumber(keyConsole.nextLine());
		
		System.out.print("Вкажіть спеціалізацію лікаря --> ");
		doctor.setSpecialization(keyConsole.nextLine());
		
		System.out.print("Зробити запис до журналу (Y/N) --> ");
		inputCommand = keyConsole.nextLine();
		
		if(inputCommand.equalsIgnoreCase("Y")){
			serviceDoctor.addNewDoctor(doctor);
			System.out.println("Дані про нового лікаря успішно збережено");
		}else{
			System.out.println("Дані про нового лікаря не збережено");
		}
		
			
	}
	
}
