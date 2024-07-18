package com.suchi.service;

import java.sql.Date;
import java.util.List;

import com.suchi.Entity.DsrEntity;
import com.suchi.exception.RecordNotFoundException;
import com.suchi.model.Dsr;


public interface DsrService {

	public Dsr saveDsr(Dsr d);
public List<Dsr> getAllDsr();
	
	public Dsr findEmployeeInfoById(long id) throws RecordNotFoundException;
	
	public Dsr updateEmployeeInfo(Dsr d,long id) throws RecordNotFoundException;
	
	
	
	public boolean deleteEmployeeInfo(long id) throws RecordNotFoundException;
}
