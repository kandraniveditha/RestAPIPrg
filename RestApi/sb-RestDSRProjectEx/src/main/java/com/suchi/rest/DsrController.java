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

import com.suchi.Entity.DsrEntity;
import com.suchi.exception.RecordNotFoundException;
import com.suchi.model.Dsr;
import com.suchi.service.impl.DsrServiceImpl;

@RestController
//@RequestMapping("restapi/dsr")
public class DsrController {

	@Autowired
	private DsrServiceImpl serviceImpl;
	
@PostMapping("/addDsr")	
public ResponseEntity<String> saveEmployeeInfo(@RequestBody   Dsr dsr)
{
	Dsr saveDsr = serviceImpl.saveDsr(dsr);
	String msg="";
	if(saveDsr!=null)
	{
		msg="Data Inserted Successfully";
		
	}
	else
	{
		msg="Data Not Inserted Successfully";
		
	}
	return new ResponseEntity<String>(msg,HttpStatus.CREATED);
}

@GetMapping("/fetchDsr")
public List<Dsr> getAllEmployeeInfo()
{
	return  serviceImpl.getAllDsr();
}

@PutMapping("/update/{id}")
public ResponseEntity<String> updateDsr(@RequestBody  Dsr d,@PathVariable("id")  long id) throws RecordNotFoundException
{
	Dsr updateEmployeeInfo = serviceImpl.updateEmployeeInfo(d, id);
	String msg="";
	
	if(updateEmployeeInfo!=null)
	{
		msg="Dta updated successfully";
	}
	else
		msg="Data NOT updated successfully";
	return new ResponseEntity<String>(msg,HttpStatus.OK);
	
}
@GetMapping("/view/{id}")
public Dsr viewEmployeeInfo(@PathVariable("id")  long id) throws RecordNotFoundException
{
	return serviceImpl.findEmployeeInfoById(id);
	
}

@DeleteMapping("/delete/{id}")
public ResponseEntity<String> deleteEmployeeInfo(@PathVariable("id") long id) throws RecordNotFoundException
{
	boolean flag=false;
	 flag = serviceImpl.deleteEmployeeInfo(id);
	 String msg="";
	 if(flag)
	 {
		 msg="Data  Deleted successfully";
		 return new ResponseEntity<String>(msg,HttpStatus.OK);
	 }
	 else
		 msg="Data NOT Deleted Successfully";
	return new ResponseEntity<String>(msg,HttpStatus.OK);
	
}

}

