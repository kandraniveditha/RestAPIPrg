package com.suchi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suchi.exception.RecordNotFoundException;
import com.suchi.model.Employee;
import com.suchi.service.impl.EmployeeServiceImpl;

@RestController
@RequestMapping("/restapi/employee")
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl serviceImpl;
	
	@PostMapping("/addEmp")
	public ResponseEntity<String> saveEmployee(@RequestBody  Employee employee)
	{
		Employee saveEmployee = serviceImpl.saveEmployee(employee);
		String msg="";
		if(saveEmployee!=null)
		{
			msg="Data Inserted Successfully";
		}
		else
		{
			msg="Data Not Insetred Successfully";
		}
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
	@GetMapping("/fetchEmp")
	public List<Employee> getAllEmployee()
	{
		return serviceImpl.getAllEmployee();
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateEmployee(@RequestBody Employee e,@PathVariable("id")  long id) throws RecordNotFoundException
	{
		Employee updateEmployee = serviceImpl.updateEmployee(e, id);
		
		String msg="";
		if(updateEmployee!=null)
		{
			msg="Data Updated Successfully";
		}
		else
		{
			msg="Data Not Updated Successfully";
		}
		return new ResponseEntity<String>(msg,HttpStatus.OK);

		
	}
	@GetMapping("/view/{id}")
	public Employee viewEmployee(@PathVariable("id") long id) throws RecordNotFoundException
	{
	
		return serviceImpl.findEmployeeById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id")  long id) throws RecordNotFoundException
	{
		String msg="";
		boolean flag=false;
		 flag = serviceImpl.deleteEmployee(id);
		 if(flag)
		 {
			 msg="Data deleted Successfully";
			 return new ResponseEntity<String>(msg,HttpStatus.OK);
		 }
		 else {
			 msg="Data not deleted Successfully";
			 
		return new ResponseEntity<String>(msg,HttpStatus.OK);
		 }
	}
	
}
