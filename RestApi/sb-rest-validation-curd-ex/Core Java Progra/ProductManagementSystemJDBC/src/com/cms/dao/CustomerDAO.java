package com.cms.dao;

import java.util.ArrayList;
import java.util.List;

import com.cms.model.Customer;



public interface CustomerDAO {
	public int addCustomer(Customer cut);
	
	public List<Customer>viewAllCustomer();
	public Customer viewCustomer(int cuid);
	

}
