package com.suchi.service;


import com.suchi.entity.User;


public interface UserService {

	public String addUser(User user);
	public boolean verifyEmailAndPassword(String email,String password);
	
}
