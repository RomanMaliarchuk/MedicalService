package controller.dispatcher;

import java.util.Date;

import controller.service.ServicePatient;
import dao.entity.ReceptionRecord;

public class Menu_7_AddNewReceptionRecord extends SettingForMenu{

	public void addNewReceptionRecord(){
		do{
			
			System.out.println();
			System.out.println("================================================================================");
			System.out.println("Вибрано пункт 7 - Запис пацієнта на прийом до лікаря");
			System.out.println();	
			System.out.println("1 - Додати нового пацієнта");
			System.out.println("2 - Вибрати зареєстрованого пацієнта");
			System.out.println("3 - Вийти в головне меню");
			System.out.println();
			System.out.print("Вибрати дію --> ");
			
			inputCommand = keyConsole.nextLine();
			
			switch (inputCommand){
			
				case "1" : 	new Menu_4_AddNewPatient().addNewPatient(); break;
				
				case "2" :	new Menu_5_ViewAllPatients().viewListAllPatients();
							long patientID = selectedPatient();
							
							new Menu_2_ViewAllDoctors().viewListAllDoctors();
							long doctorID = selectedDoctor();
							
							Date dateTimeOfAdmission = setDateTimeOfAdmission();
							
							String problem = setTextProblem();
							
							ReceptionRecord receptionRecord = new ReceptionRecord(patientID, doctorID, dateTimeOfAdmission, problem);
							
							serviceReceptionRecord.addNewReceptionRecord(receptionRecord);
							
							System.out.println("Запис пацієнта на пройим до лікаря завершено");
							
							inputCommand = "3";
							break;	
				
				case "3" : 	break;
				
				default  : System.out.println("Невірна команда. Будь-ласка, введіть коректну команду");
			}
			
			}while(!inputCommand.equals("3"));
			
			
	}
	
	
	
	
	private long selectedPatient(){
		return 1L;
	}
	
	
	private long selectedDoctor(){
		return 1L;
	}
	
	private Date setDateTimeOfAdmission(){
		return new Date();
	}
	
	private String setTextProblem(){
		return "This is text problem patient";
	}
	
}
