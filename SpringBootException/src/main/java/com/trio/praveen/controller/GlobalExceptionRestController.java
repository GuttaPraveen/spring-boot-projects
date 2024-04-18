package com.trio.praveen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GlobalExceptionRestController
{
	@GetMapping("/demo")
	public String getWelcomeMsg()
	{
		String s=null;
		s.length();
		return "Welcome To Exception Handling";
	}
}
