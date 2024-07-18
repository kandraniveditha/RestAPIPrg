package com.pms.pimp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.pms.pojo.*;
import com.cms.cimp.CustomerDAOImp;
import com.pms.dao.ProductDAO;

public class ProductDAOImp implements ProductDAO 
{
Scanner sc=new Scanner(System.in);
List<Product>addProduct=new ArrayList<Product>();
CustomerDAOImp cimp1=new CustomerDAOImp();

public void addProduct() {
	System.out.println("Enter The Products:");
	int index=sc.nextInt();
	for(int i=0;i<index;i++) {
		System.out.println("Enter Product id:");
		int prdid=sc.nextInt();
		System.out.println("Enter Product Name:");
		String prdna=sc.next();
		System.out.println("enter Product Quality:");
		int prdqty=sc.nextInt();
		System.out.println("Enter Product Price:");
		int prdprc=sc.nextInt();
		Product pd=new Product(prdid, prdna, prdqty, prdprc);
		Product.add(i,pd);
		System.out.println("Product Recorde is Added Sucessfully");
	}
}

public List<Product>viewAllProduct(){
	return viewAllProduct();
}

public Product viewProduct(int prdid) {
	int k=0;
	for(Product p:Product) {
		if(p.getpid()==prdid) {
			++k;
			return p;
		}
	}
	if(k==0)
		System.out.println("Given Record no exists");
	return null;
}
public void updateProduct(int prdid) {
	for(Product pro:Product) {
		if(pro.getpid()==prdid)
		{
			System.out.println("Update 1]prdname 2]prdqty 3]prdprice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:System.out.println("Enter Product name:");
			String name=sc.next();
			pro.setpname(name);
			System.out.println("Product Updated Sucessfully");
			break;
			
			case 2:System.out.println("Enter Product quanty:");
			int pqty=sc.nextInt();
			pro.setpqty(pqty);
			System.out.println("Qualty Upadated Sucessfully");
			break;
			
			case 3:System.out.println("Enter Product Price:");
			int pri=sc.nextInt();
			pro.setPPrice(pri);
			System.out.println("Price updated Sucessfully");
			break;
				
			}
		}
	}
}

public void deleteProduct(int prdid) {
	for(Product pa:Product) {
		System.out.println("Deleted 1]prdname 2]prdqty 3]prdprice");
		
	}
}

@Override
public boolean verifyUnAndPw(String email, String pass) {
	// TODO Auto-generated method stub
	return false;
}









}
