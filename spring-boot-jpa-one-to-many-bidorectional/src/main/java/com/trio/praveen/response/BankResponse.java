package com.trio.praveen.response;

import java.util.List;

import com.trio.praveen.entity.Account;

public class BankResponse
{
	private Long id;
	private String name;
    List<AccountResponse> accounts;
	public Long getId()
	{
		return id;
	}
	public void setId(Long id)
	{
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	
	public List<AccountResponse> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<AccountResponse> list)
	{
		this.accounts = list;
	}
	@Override
	public String toString()
	{
		return "BankResponse [id=" + id + ", name=" + name + ", accounts=" + accounts + "]";
	}
    
}
