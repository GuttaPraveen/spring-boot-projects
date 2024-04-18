package com.trio.praveen.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.trio.praveen.entity.Account;
import com.trio.praveen.response.AccountResponse;

@Service
public interface AccountService 
{
	
	List<AccountResponse> findAll();
	void save(AccountResponse accResp);
}
