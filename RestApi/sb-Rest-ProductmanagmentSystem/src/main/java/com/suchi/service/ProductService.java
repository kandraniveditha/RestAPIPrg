package com.suchi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.suchi.exception.RecordNotFoundException;
import com.suchi.model.Product;

@Service
public interface ProductService {
//this layer is responsible to handle business logic
	
	public Product saveProduct(Product p);
	
	public List<Product>getAllProducts();
	
	public Product findProductById(Long id)throws RecordNotFoundException;
	
	public Product updateProduct(Product p,long id)throws RecordNotFoundException;
	
	public boolean deleteProduct(long id)throws RecordNotFoundException;
	
}
