package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {

	@Autowired
	private CustomerRepo custRepo;

	@Autowired
	//http://localhost:8082/h2-console
	@RequestMapping("/")
	public String suchiit() {
		return "suchiit";
	}

	//http://localhost:8082/details
	@RequestMapping("/details")
	public String details(Customers customers) {
		custRepo.save(customers);
		return "suchiit";
	}

	//http://localhost:8082/getdetails
	@RequestMapping("/getdetails")
	public String getdetails() {

		return "ViewController";
	}

	//http://localhost:8082/getdetails
	  @PostMapping("/getdetails") 
	  public ModelAndView getdetails(@RequestParam int cid) 
	  {
		  ModelAndView mv=new ModelAndView("Retrive");
	      Customers customers =custRepo.findById(cid).orElse(null);
	      mv.addObject(customers);
	      return mv;
	  
	  }
	 

}
