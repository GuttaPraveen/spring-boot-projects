package com.trio.praveen.service;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trio.praveen.entity.Account;
import com.trio.praveen.entity.Bank;
import com.trio.praveen.repository.AccountRepository;
import com.trio.praveen.repository.BankRepository;
import com.trio.praveen.request.AccountRequest;
import com.trio.praveen.response.AccountResponse;
import com.trio.praveen.response.BankResponse;

@Service
public class BankServiceImpl implements BankService
{
	@Autowired
	BankRepository bankRepository;
	
	@Autowired
	AccountRepository accountRepository;

	

	@Override
	public void save(BankResponse bankResponse)
	{
		Bank bank =new Bank();
		bank.setName(bankResponse.getName());
		bankRepository.save(bank);
		for(AccountResponse accountResponse : bankResponse.getAccounts())
		{
			Account account =new Account();
			account.setAccountHolder(accountResponse.getAccountHolder());
			account.setBalance(accountResponse.getBalance());
			account.setBank(bank);
			accountRepository.save(account);
		}
		
		
	}
	@Override
	public List<BankResponse> findAll() 
	{
		List<Bank> bank = bankRepository.findAll();
		return bank.stream().map(this::mapToBank).collect(Collectors.toList());
		
	}
	public BankResponse mapToBank(Bank bank)
	{
		BankResponse bankResponse = new BankResponse();
		bankResponse.setId(bank.getBank_id());
		bankResponse.setName(bank.getName());
		List<Account> accounts = bank.getAccounts();
		bankResponse.setAccounts(accounts.stream().map(this::mapToAccount).collect(Collectors.toList()));
		return bankResponse;
	}
	public AccountResponse mapToAccount(Account account)
	{
		AccountResponse accountResponse  = new AccountResponse();
		accountResponse.setId(account.getId());
		accountResponse.setAccountHolder(account.getAccountHolder()); 
		accountResponse.setBalance(account.getBalance());
		return accountResponse;
		
	}

}

