package com.suchi.rest;

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

import com.suchi.exception.RecordNotFoundException;
import com.suchi.model.Product;
import com.suchi.service.impl.ProductServiceImpl;

@RestController
@RequestMapping("/restapi/products")
public class ProductController {

	@Autowired
	private ProductServiceImpl serviceImpl;
	
	//@RequestBody can hold/capture the data coming from client
	@PostMapping("/addPro")
	public ResponseEntity<String>saveProduct(@RequestBody Product product) {
		
		Product saveProduct=serviceImpl.saveProduct(product);
		String msg="";
		if(saveProduct!=null)
		{
			msg="Data Inserted Successfully";

		}
		else {
			msg="Data Not Inserted Successfully";
		}
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
	
	@GetMapping("/fetchPro")
	public List<Product>getAllProducts(){
		return serviceImpl.getAllProducts();
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<String>updateProduct(@RequestBody Product p,@PathVariable long pid) throws RecordNotFoundException
	{
		Product updateProduct= serviceImpl.updateProduct(p, pid);
		String msg="";
		if(updateProduct!=null)
		{
			msg="Upadted Record Successfully";

		}
		else {
			msg="Datais  Not Inserted Successfully";
		}
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}

}
