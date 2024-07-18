package com.pms.dao;

import java.util.List;

import com.pms.model.Product;

public interface ProductDAO {
	public int addProducts(Product pro);
	
	public List<Product>viewAllProducts();
	public Product viewProduct(int pid);
	

}
