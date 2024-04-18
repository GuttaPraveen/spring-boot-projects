package com.trio.praveen.request;

import java.util.List;
import com.trio.praveen.entity.Account;
import com.trio.praveen.response.AccountResponse;

public class BankRequest
{
	private String name;
    
    List<AccountResponse> accounts;

	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	

	public List<AccountResponse> getAccounts()
	{
		return accounts;
	}

	public void setAccounts(List<AccountResponse> accounts)
	{
		this.accounts = accounts;
	}

	@Override
	public String toString()
	{
		return "BankRequest [name=" + name + ", accounts=" + accounts + "]";
	}
    
}
