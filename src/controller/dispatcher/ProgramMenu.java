package controller.dispatcher;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import view.ViewDoctor;
import controller.service.ServiceDoctor;
import dao.entity.Doctor;

public class ProgramMenu{
	
	final Scanner readCommand = new Scanner(System.in);
	final ServiceDoctor serviceDoctor = new ServiceDoctor();
	final ViewDoctor showDoctor = new ViewDoctor();
	String inputCommand = "";
	
	public void processMainMenu() {
	// метод вибору пункту в головному меню	
		do{
			System.out.println();
			System.out.println("================================================================================");
			System.out.println("1 - Додати нового лікаря");
			System.out.println("2 - Переглянути журнал прийому до лікаря");
			System.out.println("3 - Записати пацієнта на прийом до лікаря");
			System.out.println("4 - Переглянути журнал прийому для пацієнта");
			System.out.println("5 - Змінти дані запису на прийом пацієнта");
			System.out.println("6 - Видалити запис на прийом пацієнта лікарем");
			System.out.println("7 - Завершити роботу з програмою");
			System.out.println();
			System.out.print("Вибрати дію --> ");
			
			inputCommand = readCommand.nextLine();
			
			switch (inputCommand){
				case "1" : 	addNewDoctor(); break;
				case "2" :	viewDoctorJournal(); break;
				
				case "3" : System.out.println("Вибрано пункт 3"); break;
				case "4" : System.out.println("Вибрано пункт 4"); break;
				case "5" : System.out.println("Вибрано пункт 5"); break;
				case "6" : System.out.println("Вибрано пункт 6"); break;
				case "7" : System.out.println("Роботу програми завершено!"); break;
				default  : System.out.println("Невірна команда. Будь-ласка, введіть коректну команду");
			}
			
		}while(!inputCommand.equals("7"));
	}
	
	
	
	
	void addNewDoctor(){
	// метод для додавання до журналу нового лікаря
		System.out.println();
		System.out.println("================================================================================");
		System.out.println("Вибрано пункт 1 - Внести дані до журналу про нового лікаря");
		System.out.println();
		
		Doctor doctor = new Doctor();
		
		System.out.print("Вкажіть прізвище лікаря --> ");
		inputCommand = readCommand.nextLine();
		doctor.setFirstName(inputCommand);
		
		System.out.print("Вкажіть ім'я --> ");
		inputCommand = readCommand.nextLine();
		doctor.setSecondName(inputCommand);
		
		System.out.print("Вкажіть по-батькові --> ");
		inputCommand = readCommand.nextLine();
		doctor.setSurName(inputCommand);
		
		System.out.print("Вкажіть номер телефону лікаря --> ");
		inputCommand = readCommand.nextLine();
		doctor.setPhoneNumber(inputCommand);
		
		System.out.print("Вкажіть спеціалізацію лікаря --> ");
		inputCommand = readCommand.nextLine();
		doctor.setSpecialization(inputCommand);
		
		System.out.print("Зробити запис до журналу (Y/N) --> ");
		inputCommand = readCommand.nextLine();
		
		if(inputCommand.equalsIgnoreCase("Y")){
			serviceDoctor.addDoctor(doctor);
			System.out.println("Дані про нового лікаря успішно збережено");
		}else{
			System.out.println("Дані про нового лікаря не збережено");
		}
		
		pressAnyKey();
	}
	
	
	
	private void viewDoctorJournal(){
	// метод перегляду журналу прийому до лікаря
		System.out.println();
		System.out.println("================================================================================");
		System.out.println("Вибрано пункт 2 - Перегляд журналу прийому до лікаря");
		System.out.println();
		ArrayList<Doctor> listAllDoctors = serviceDoctor.getListAllDoctors();
		showDoctor.showListAllDoctors(listAllDoctors);
		System.out.println();
		System.out.print("Вибрати лікаря (вкажіть номер) --> ");
		
		inputCommand = readCommand.nextLine();
		
	}
	
	
	
	private void pressAnyKey(){
	// метод для натиснення ЕніКеу
		System.out.println("Для продовження роботи натисніть будь-яку клавішу ...");
		while(readCommand.nextLine().equals("")) {
			
		}
	}

}
