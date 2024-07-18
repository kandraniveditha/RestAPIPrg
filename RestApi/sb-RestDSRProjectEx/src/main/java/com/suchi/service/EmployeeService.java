package com.suchi.service;

import java.util.List;

import com.suchi.exception.RecordNotFoundException;
import com.suchi.model.Employee;

public interface EmployeeService {

public Employee saveEmployee(Employee e);
	
	public List<Employee> getAllEmployee();
	
	public Employee findEmployeeById(long id) throws RecordNotFoundException;
	
	public Employee updateEmployee(Employee e,long id) throws RecordNotFoundException;
	
	
	
	public boolean deleteEmployee(long id) throws RecordNotFoundException;
}
