package com.trio.praveen.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trio.praveen.entity.Account;
import com.trio.praveen.repository.AccountRepository;
import com.trio.praveen.response.AccountResponse;

@Service
public class AccountServiceImpl implements AccountService
{
	@Autowired
	AccountRepository accountRepository;
	@Override
	public void save(AccountResponse accResp)
	{
		Account acc=new Account();
		acc.setAccountHolder(accResp.getAccountHolder());
		acc.setBalance(accResp.getBalance());
		accountRepository.save(acc);
	}

	@Override
	public List<AccountResponse> findAll()
	{
//		// TODO Auto-generated method stub
	    List<Account> account =accountRepository.findAll();
	     List<AccountResponse> ac=new ArrayList();
	     AccountResponse accResp = new AccountResponse();
		for(Account acc:account)
		{
			
			accResp.setAccountHolder(acc.getAccountHolder());
			accResp.setBalance(acc.getBalance());
			ac.add(accResp);
			
		}
		return ac ;
		

	}
		

}
