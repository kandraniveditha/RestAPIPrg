package com.suchi.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class WelcomeController {

	//http://localhost:8080/hello/nive ------>Path Parameters
	@GetMapping("/hello/{name}")
	public String sayHi(@PathVariable("name") String name) {
		return "welcome : "+name;
	}
	
	//http://localhost:8080/hello?name=chowdary------->Query Parameters
	@GetMapping("/hello")
	public String sayhello(@RequestParam("name") String name) {
		return "welcome : "+name;
	}
	
	//Java object convert as json format by default for this spring boot will use
	//Jackson API
	//http://localhost:8080/user--->POST in postman
	@PostMapping("/user")
	public User getUserInfo(@RequestBody User user) {
		
		return user;
	}
	
	//http://localhost:8080/user --->get in postman
	@GetMapping("/user")
	public User getUser() {
		
		
		User user=new User();
		user.setId(101);
		user.setUserName("kalpana");
		user.setPassword("kalpana@123");
		return user;
	}
}
