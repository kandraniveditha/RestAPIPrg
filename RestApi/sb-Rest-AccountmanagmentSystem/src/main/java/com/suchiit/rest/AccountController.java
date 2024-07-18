package com.suchiit.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.suchiit.model.Account;
import com.suchiit.service.Impl.AccountServiceImpl;
import com.suchiitexception.RecordNotFoundException;

@RestController
@RequestMapping("/restapi/account")
public class AccountController {

	@Autowired
	private AccountServiceImpl serviceImpl;
	
	@PostMapping("/addAcc")
	public ResponseEntity<String>saveAccount(@RequestBody Account account) {
		
		Account saveAccount=serviceImpl.saveAccount(account);
		String msg="";
		if(saveAccount!=null)
		{
			msg="Data Inserted Successfully";

		}
		else {
			msg="Data Not Inserted Successfully";
		}
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
	
	@GetMapping("/fetchacc")
	public List<Account>getAllAccounts(){
		return serviceImpl.getAllAccounts();
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<String>updateAccount(@RequestBody Account acc,@PathVariable long id) throws RecordNotFoundException
	{
Account updateAccount= serviceImpl.updateAccount(acc,id);
		String msg="";
		if(updateAccount!=null)
		{
			msg="Upadted Record Successfully";

		}
		else {
			msg="Datais  Not Inserted Successfully";
		}
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}

}
