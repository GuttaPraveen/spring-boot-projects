package com.trio.praveen.controller;

import java.util.List;

import org.apache.commons.logging.Log;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trio.praveen.SpringJpaMappingUsingOneToManyApplication;
import com.trio.praveen.entity.Bank;
import com.trio.praveen.repository.AccountRepository;
import com.trio.praveen.repository.BankRepository;
import com.trio.praveen.request.MoneyRequest;

@RequestMapping("/api")
@RestController
public class BankController
{
	@Autowired
	private BankRepository bankRepository;
	
	@Autowired
	private AccountRepository accountRepository;
	
	private final Log logger1 =  org.apache.commons.logging.LogFactory.getLog(SpringJpaMappingUsingOneToManyApplication.class);
	private final Log logger = org.apache.commons.logging.LogFactory.getLog(getClass());
	@PostMapping("/save")
	public Bank save(@RequestBody MoneyRequest moneyRequest)
	{
		return bankRepository.save(moneyRequest.getBank());
		
	}
	@GetMapping("/get")
	public List<Bank> get()
	{
		return bankRepository.findAll();
	}
}
