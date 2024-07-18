package com.pms.dao;

import java.util.ArrayList;
import java.util.List;

import com.pms.pojo.*;

public interface ProductDAO {

ArrayList<Product>Product=new ArrayList<Product>();
	
void addProduct();
List<Product>viewAllProduct();
Product viewProduct(int prdid);

void updateProduct(int prdid);
void deleteProduct(int prdid);
boolean verifyUnAndPw(String email,String pass);
}
