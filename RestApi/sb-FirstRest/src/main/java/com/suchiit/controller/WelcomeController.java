package com.suchiit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	//http://localhost:8081/welcome
	@GetMapping("/welcome")
	public String sayHello() {
		return "welcome Boss:";
	}
	
	//http://localhost:8081/hi/nive
	@GetMapping("/hi/{name}")
	public String sayHi(@PathVariable("name") String name) {
		return "Hello : "+name;
	}
	
	//http://localhost:8081/bye?name=sanna
	@GetMapping("/bye")
	public String sayGnt(@RequestParam("name") String name) {
		return "Hello:"+name;
	}
	
	//http://localhost:8081/stu
	@GetMapping("/stu")
	public Student handleStudent() {
		
		Student stu=new Student();
		stu.setSno(100);
		stu.setSname("nive");
		stu.setSadd("bng");
		return stu;
	}
}
