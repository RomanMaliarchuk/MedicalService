package controller.service;

import dao.entity.ReceptionRecord;
import dao.repository.CRUDReceptionRecord;
import dao.repository.CRUDReceptionRecordImpl;

public class ServiceReceptionRecord {
	
	CRUDReceptionRecord CRUDreceptionRecord = new CRUDReceptionRecordImpl();
	
	public void addNewReceptionRecord(ReceptionRecord receptionRecord){
		CRUDreceptionRecord.addNewReceptionRecord(receptionRecord);
	}

}
