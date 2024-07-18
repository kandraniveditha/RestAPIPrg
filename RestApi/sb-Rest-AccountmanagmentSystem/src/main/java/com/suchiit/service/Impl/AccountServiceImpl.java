package com.suchiit.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suchiit.Entity.AccountEntity;
import com.suchiit.model.Account;
import com.suchiit.repo.AccountRepository;
import com.suchiit.service.AccountService;
import com.suchiitexception.RecordNotFoundException;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accrepo;
	
	@Override
	public Account saveAccount(Account acc) {
		// TODO Auto-generated method stub
		AccountEntity accEnt=new AccountEntity();
		BeanUtils.copyProperties(acc, accEnt);
		AccountEntity acco=accrepo.save(accEnt);
		
		Account account=new Account();
		BeanUtils.copyProperties(acco, account);
		return account;
	}

	@Override
	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		List<AccountEntity>accountInfo=accrepo.findAll();
		List<Account>addAccounts=new ArrayList<Account>();
		for(AccountEntity accen:accountInfo)
		{
			Account acc=new Account();
			BeanUtils.copyProperties(accen, acc);
			addAccounts.add(acc);
		}
		return addAccounts;
	}

	@Override
	public Account findAccountById(Long id) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account updateAccount(Account acc, long id) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		AccountEntity accountEntity=accrepo.findById(id).get();
		if(accountEntity.getId()!=0) {
			BeanUtils.copyProperties(acc, accountEntity);
		}
		else {
			throw new RecordNotFoundException("Given Record is Not Exists");
		}
		AccountEntity saveEnt=accrepo.save(accountEntity);
		Account acco=new Account();
	BeanUtils.copyProperties(saveEnt,acco);
		return acc;
		
		
	}

	@Override
	public boolean deleteAccount(long id) throws RecordNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	

}
