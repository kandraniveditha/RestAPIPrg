package com.cms.cimp;

import java.util.List;
import java.util.Scanner;

import com.cms.dao.CustomerDAO;
import com.cms.pojo.Customer;
import com.pms.pimp.ProductDAOImp;
import com.pms.pojo.Product;

public class CustomerDAOImp implements CustomerDAO
{
Scanner sc=new Scanner(System.in);
Customer[] addCustomer=null;
public void addCustomer() {
	System.out.println("Enter the Customer:");
	int index=sc.nextInt();
	for(int i=0;i<index;i++)
	{
	System.out.println("Enter Customer Id:");
	int cid=sc.nextInt();
	System.out.println("Enter Customer First Name:");
	String fname=sc.next();
	System.out.println("Enter Customer Last NAme:");
	String lname=sc.next();
	System.out.println("Enter Customer Email PAssword:");
	String emailpass=sc.next();
	System.out.println("Enter Customer Phone Number:");
	long mbphone=sc.nextLong();
	Customer ctd= new Customer (cid, fname, lname, emailpass, mbphone);
	Customer.add(ctd);
	System.out.println("Customer Record Added Sucessfully");	
}
}

 public List <Customer> viewAllCustomer(){
	
	return Customer;
}

@Override
public Customer viewCustomer(int cuid) {
	// TODO Auto-generated method stub
	int j=0;
	for(Customer ct:Customer) {
		if(ct.getcid()==cuid) {
			return ct;
		}
	}
	if(j==0)
		System.out.println("Customer Doesn't Exists");
	return null;
}

@Override
public void deleteCustomer(int cuid) {
	// TODO Auto-generated method stub
	int j=0;
	int k=0;
	for(Customer c:Customer) {
		if(c.getcid()==cuid) {
			++j;
			++k;
			Customer.add(k,null);
		}
	}
	if(j==0)
		System.out.println("Customer doesn't exists");
}

@Override
public void buyProduct() {
	// TODO Auto-generated method stub
	int totalprice=0;
	System.out.println("How Many Products do you buy:");
	int prd=sc.nextInt();
	for(int i=0;i<prd;i++) {
	System.out.println("Enter product id:");
	int pid=sc.nextInt();
	for(Product p:ProductDAOImp.Product) {
		if(p.getpid()==pid) {
			totalprice+=p.getpqty()*p.getpprice();
		}
	}
	System.out.println("totalprice:"+totalprice);
}
}
}

