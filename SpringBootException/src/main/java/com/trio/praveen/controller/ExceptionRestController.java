package com.trio.praveen.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionRestController
{
	@GetMapping("/welcome")
	public String getWelcomeMsg()
	{
		int res=5/0;
		return "Welcome To Exception Handling";
	}
	
/*	@ExceptionHandler(value=ArithmeticException.class)
	@ExceptionHandler(value=ArithmeticException.class)
	public ResponseEntity<?> handleArithmeticException(Exception e)
	{
		return new ResponseEntity(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}*/
}
