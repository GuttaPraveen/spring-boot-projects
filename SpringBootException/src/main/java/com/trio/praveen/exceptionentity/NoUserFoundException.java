package com.trio.praveen.exceptionentity;

public class NoUserFoundException extends RuntimeException
{
	public NoUserFoundException() {}
	
	public NoUserFoundException(String msg)
	{
		super(msg);
	}
}
