package com.trio.praveen.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.trio.praveen.entity.Bank;

import com.trio.praveen.response.BankResponse;

@Service
public interface BankService
{
	void save(BankResponse bankResponse);
	List<BankResponse> findAll();
}
