package dao.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import dao.entity.ReceptionRecord;

public class CRUDReceptionRecordImpl implements CRUDReceptionRecord, SettingAccessToDB{

	@Override
	public void addNewReceptionRecord(ReceptionRecord receptionRecord) {
		
		try (
                Connection connection = DriverManager.getConnection(DB_URL, loginDB, passwordDB);
                Statement statement = connection.createStatement();
        ) {
			
			Date dateTimeOfAdmission = new Date(receptionRecord.getDateTimeOfAdmission().getTime());
			
			statement.executeUpdate("INSERT INTO receptionrecord (doctorID, patientID, dateTimeOfAdmission, problem) " +
                    "VALUES('" + receptionRecord.getDoctorID() + "', '" + receptionRecord.getPatientID() + "', '" 
					+ dateTimeOfAdmission + "', '" + receptionRecord.getProblem() + "');");

        }  catch (SQLException e) {
            e.printStackTrace();
        }
		
	}
	
}
