package com.suchi.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.suchi.entity.User;
import com.suchi.service.Impl.UserServiceImpl;

@RestController
//@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserServiceImpl daoImpl;
	
	//http://localhost:8081/insert
	@PostMapping("/insert")
	public ResponseEntity<String>registerUser(@RequestBody User user){
		
		System.out.println("HELLO ALL");
		String addUser=daoImpl.addUser(user);
	    String msg="";
	    if(addUser!=null) {
	    	msg="Data Inserted Successfully";
	    	return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	    }
	    else
	    	return new ResponseEntity<String>(msg,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	//http://localhost:8081/login?email=kandranive11@gmail.com&password=kandra123
	@GetMapping("/login")
	public boolean verifylogin(@RequestParam String email,@RequestParam String password) {
		
		boolean flag=false;
		boolean verifyEmailAndPassword=daoImpl.verifyEmailAndPassword(email, password);
		
		if(verifyEmailAndPassword) {
			flag=true;
		}
		else
			flag=false;
		return flag;
	}
}
