package com.trio.praveen.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.trio.praveen.exceptionentity.AppExInfo;
import com.trio.praveen.exceptionentity.NoUserFoundException;

@RestControllerAdvice
public class ApplExceptionHandler
{
	
	@ExceptionHandler(value=NoUserFoundException.class)
	public ResponseEntity<AppExInfo> handleUserFoundException(Exception e)
	{
		AppExInfo info = new AppExInfo();
		info.setExCode("SBIEX08");
		info.setExMsg(e.getMessage());
		info.setExDate(LocalDateTime.now());
		
		return new ResponseEntity(info,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value=Exception.class)
	public ResponseEntity<AppExInfo> handleArithmeticException(Exception e)
	{
		AppExInfo info = new AppExInfo();
		info.setExCode("SBIEX007");
		info.setExMsg(e.getMessage());
		info.setExDate(LocalDateTime.now());
		
		return new ResponseEntity(info,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
