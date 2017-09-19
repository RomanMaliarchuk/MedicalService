package dao.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dao.entity.Doctor;

public class CRUDDoctorImpl implements CRUDDoctor, SettingAccessToDB{

	
	@Override
	public void addNewDoctor(Doctor doctor) {
		
		try (
                Connection connection = DriverManager.getConnection(DB_URL, loginDB, passwordDB);
                Statement statement = connection.createStatement();
        ) {
			
			statement.executeUpdate("INSERT INTO doctor (firstName, surName, phoneNumber, specialization) " +
                    "VALUES('" + doctor.getFirstName() + "', '" + doctor.getSurName() + "', '" + 
					doctor.getPhoneNumber() + "', '" + doctor.getSpecialization() + "')");

        }  catch (SQLException e) {
            e.printStackTrace();
        }
		
	}
	
	
	@Override
	public ArrayList<Doctor> getListAllDoctors() {
		
		ArrayList<Doctor> listAllDoctors = new ArrayList<Doctor>();
		
        String query = "SELECT * FROM doctor;";
        
        try (
                Connection connection = DriverManager.getConnection(DB_URL, loginDB, passwordDB);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
        ) {
            while (resultSet.next()) {
                Doctor doctorFromDB = new Doctor();
                doctorFromDB.setDoctorID(resultSet.getInt(1));
                doctorFromDB.setFirstName(resultSet.getString(2));
                doctorFromDB.setSurName(resultSet.getString(3));
                doctorFromDB.setPhoneNumber(resultSet.getString(4));
                doctorFromDB.setSpecialization(resultSet.getString(5));
                listAllDoctors.add(doctorFromDB);
            }
        }  catch (SQLException e) {
            e.printStackTrace();
        }
		
		return listAllDoctors;
	}
	
	

}
