package com.trio.praveen.request;

import com.trio.praveen.entity.Bank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class AccountRequest 
{
	private Bank bank;
}
