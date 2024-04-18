package com.trio.praveen.response;

public class AccountResponse
{
	private Long id;
	private String accountHolder;
	private Double balance;

	public String getAccountHolder()
	{
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder)
	{
		
		this.accountHolder = accountHolder;
	}

	public Double getBalance() 
	{
		return balance;
	}

	public void setBalance(Double balance)
	{
		this.balance = balance;
	}

	public Long getId() 
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	@Override
	public String toString()
	{
		return "AccountResponse [id=" + id + ", accountHolder=" + accountHolder + ", balance=" + balance + "]";
	}

	

}
