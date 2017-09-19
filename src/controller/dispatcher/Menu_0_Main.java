package controller.dispatcher;

import java.io.Console;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import view.ViewDoctor;
import controller.service.ServiceDoctor;
import dao.entity.Doctor;
import dao.entity.Patient;

public class Menu_0_Main extends SettingForMenu{
		
	public void processMainMenu() {
	// метод вибору пункту в головному меню	
		do{
			System.out.println();
			System.out.println("===============================================================================");
			System.out.println("1 - Додати нового лікаря");
			System.out.println("2 - Переглянути список всіх лікарів");
			System.out.println("3 - Переглянути журнал прийому до лікаря");
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("4 - Додати нового пацієнта");
			System.out.println("5 - Переглянути список всіх пацієнтів");
			System.out.println("6 - Переглянути журнал звернень для пацієнта");
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("7 - Записати пацієнта на прийом до лікаря");
			System.out.println("8 - Змінти дані реєстрації пацієнта на прийом до лікаря");
			System.out.println("9 - Видалити реєстрацію пацієнта на прийом до лікаря");
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("0 - Завершити роботу з програмою");
			System.out.println();
			System.out.print("Вибрати дію --> ");
			
			inputCommand = keyConsole.nextLine();
			
			switch (inputCommand){
				case "1" : 	new Menu_1_AddNewDoctor().addNewDoctor(); break;
				case "2" :	new Menu_2_ViewAllDoctors().viewListAllDoctors();; break;
				case "3" :	break;				
				case "4" :	new Menu_4_AddNewPatient().addNewPatient(); break;
				case "5" : 	new Menu_5_ViewAllPatients().viewListAllPatients(); break;
				case "6" :	break;
				case "7" :	new Menu_7_AddNewReceptionRecord().addNewReceptionRecord(); break;
				case "8" :	break;
				case "9" :	break;
				
				case "0" : 	System.out.println("Роботу програми завершено!"); break;
				default  : 	System.out.println("Невірна команда. Будь-ласка, введіть коректну команду");
			}
			
		}while(!inputCommand.equals("0"));
	}
	

}
