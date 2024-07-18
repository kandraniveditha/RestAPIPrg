package com.cms.dao;

import java.util.ArrayList;
import java.util.List;

import com.cms.pojo.*;
public interface CustomerDAO {
	void addCustomer();
	List<Customer>Customer=new ArrayList<Customer>();
	List<Customer>viewAllCustomer();
	Customer viewCustomer(int cuid);
	void deleteCustomer(int cuid);
	void buyProduct();

}
