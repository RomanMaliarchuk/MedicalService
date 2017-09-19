package dao.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dao.entity.Doctor;
import dao.entity.Patient;

public class CRUDPatientImpl implements CRUDPatient, SettingAccessToDB{

	@Override
	public void addNewPatient(Patient patient) {
		
		try (
                Connection connection = DriverManager.getConnection(DB_URL, loginDB, passwordDB);
                Statement statement = connection.createStatement();
        ) {
			
			Date birthday = new Date(patient.getBirthday().getYear(), patient.getBirthday().getMonth(), patient.getBirthday().getDate());
			
			statement.executeUpdate("INSERT INTO patient (firstName, surName, phoneNumber, address, birthday) " +
                    "VALUES('" + patient.getFirstName() + "', '" + patient.getSurName() + "', '" + patient.getPhoneNumber() + "', '" 
					+ patient.getAddress() + "', '" + birthday + "');");

        }  catch (SQLException e) {
            e.printStackTrace();
        }
		
	}

	@Override
	public ArrayList<Patient> getListAllPatients() {
		
		ArrayList<Patient> listAllPatients = new ArrayList<Patient>();
		
        String query = "SELECT * FROM patient;";
        
        try (
                Connection connection = DriverManager.getConnection(DB_URL, loginDB, passwordDB);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
        ) {
            while (resultSet.next()) {
                Patient patientFromDB = new Patient();
                patientFromDB.setPatientID(resultSet.getInt(1));
                patientFromDB.setFirstName(resultSet.getString(2));
                patientFromDB.setSurName(resultSet.getString(3));
                patientFromDB.setPhoneNumber(resultSet.getString(4));
                patientFromDB.setAddress(resultSet.getString(5));
                patientFromDB.setBirthday(resultSet.getDate(6));
                listAllPatients.add(patientFromDB);
            }
        }  catch (SQLException e) {
            e.printStackTrace();
        }
		
		return listAllPatients;
	}
	
	
	
	
	
	

}
