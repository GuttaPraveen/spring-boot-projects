package com.trio.praveen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController
{
	@GetMapping("/msg")
	public String msg()
	{
		return "Welcome To Spring Security";
	}
}
