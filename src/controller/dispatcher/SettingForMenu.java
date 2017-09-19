package controller.dispatcher;

import java.util.Scanner;

import view.ViewDoctor;
import view.ViewPatient;
import controller.service.ServiceDoctor;
import controller.service.ServicePatient;
import controller.service.ServiceReceptionRecord;

public abstract class SettingForMenu {

	final Scanner keyConsole = new Scanner(System.in);
	final ServiceDoctor serviceDoctor = new ServiceDoctor();
	final ServicePatient servicePatient = new ServicePatient();
	final ServiceReceptionRecord serviceReceptionRecord = new ServiceReceptionRecord();
	
	final ViewDoctor showDoctor = new ViewDoctor();
	final ViewPatient showPatient = new ViewPatient();
	
	String inputCommand;

}
