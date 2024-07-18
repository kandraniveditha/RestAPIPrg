package com.suchi.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suchi.entity.User;
import com.suchi.repo.UserRepository;
import com.suchi.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userrepo;
	@Override
	public String addUser(User user) {
		// TODO Auto-generated method stub
		User userEn =userrepo.save(user);
	if(userEn!=null) {
		return "User added successfully";
	}
	else
		
		return "user not added successfully";
	}

	@Override
	public boolean verifyEmailAndPassword(String email, String paswsword) {
		// TODO Auto-generated method stub
		
		boolean flag=false;
		
		User findByEmailAndPassword=userrepo.findByEmailAndPassword(email, paswsword);
		if(findByEmailAndPassword!=null) {
			flag=true;
		}
		else
		flag= false;
		return flag;
		
	}

}
