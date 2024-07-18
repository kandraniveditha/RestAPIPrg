package com.suchiit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.suchiit.model.Account;
import com.suchiitexception.RecordNotFoundException;

@Service
public interface AccountService {


	public Account saveAccount(Account acc);
	
	public List<Account>getAllAccounts();
	
	public Account findAccountById(Long id)throws RecordNotFoundException;
	
	public Account updateAccount(Account acc,long id)throws RecordNotFoundException;
	
	public boolean deleteAccount(long id)throws RecordNotFoundException;
	
}
