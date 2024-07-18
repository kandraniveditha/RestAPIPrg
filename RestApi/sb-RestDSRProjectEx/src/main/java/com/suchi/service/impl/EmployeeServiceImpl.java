package com.suchi.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.suchi.Entity.EmployeeEntity;
import com.suchi.exception.RecordNotFoundException;
import com.suchi.model.Employee;
import com.suchi.repo.EmployeeRepository;
import com.suchi.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository daoImpl;
	
	@Override
	public Employee saveEmployee(Employee e) {
		// TODO Auto-generated method stub
		EmployeeEntity empEn=new EmployeeEntity();
		BeanUtils.copyProperties(e, empEn);
		empEn.setVisibility(true);
		EmployeeEntity emp = daoImpl.save(empEn);
		//Copy Entity object to Product Object
		Employee e1=new Employee();
		BeanUtils.copyProperties(emp, e1);
		return e1;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		List<EmployeeEntity> findAllEmployee = daoImpl.findAllEmployee();
		List<Employee> addEmployee=new ArrayList<Employee>();
		findAllEmployee.forEach(e->
		{
			Employee emp=new Employee();
			BeanUtils.copyProperties(e, emp);
			addEmployee.add(emp);
		}
				);
		return addEmployee;
	}

	@Override
	public Employee findEmployeeById(long id) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		EmployeeEntity employeeEntity = daoImpl.findById(id).get();
		Employee e=new Employee();

		if(employeeEntity.getId()!=0)
		{
			BeanUtils.copyProperties(employeeEntity, e);
		}
		else
		{
			throw new RecordNotFoundException("Given Record is Not Exist");
		}
		
		return e;
	}

	@Override
	public Employee updateEmployee(Employee e, long id) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		EmployeeEntity employeeEntity = daoImpl.findById(id).get();
		if(employeeEntity.getId()!=0)
		{
			BeanUtils.copyProperties(e, employeeEntity);
		}
		else
		{
			throw new RecordNotFoundException("Given Record is Not Exist");
		}
		EmployeeEntity saveEnt= daoImpl.save(employeeEntity);
		//Copy Entity Object Into Product
		Employee emp=new Employee();
		BeanUtils.copyProperties(saveEnt, emp);
		return emp;
	}

	@Override
	public boolean deleteEmployee(long id) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		boolean flag=false;
		EmployeeEntity employeeEn = daoImpl.findById(id).get();
		if(employeeEn.getId()!=0)
		{
			daoImpl.deleteEmployee(id);
			flag=true;
		}
		else
			throw new RecordNotFoundException("Given Record is not Exist");
		return flag;
	}
	}

}
