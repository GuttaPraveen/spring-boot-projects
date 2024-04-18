package com.trio.praveen.controller;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trio.praveen.entity.Account;

import com.trio.praveen.entity.Bank;


import com.trio.praveen.request.BankRequest;
import com.trio.praveen.response.AccountResponse;
import com.trio.praveen.response.BankResponse;
import com.trio.praveen.service.AccountService;
import com.trio.praveen.service.BankService;



@RestController
@RequestMapping("/api")
public class BankController
{
	@Autowired
	private BankService bankService;
	
	@Autowired
	private AccountService accountService;
	
	
	@PostMapping("/save")
	public void Save(@RequestBody BankResponse bankResp)
	{
		bankService.save(bankResp);
	}
	@GetMapping("/get")
	public List<BankResponse> get()
	{
		return bankService.findAll();
	}
	
}

 
 
