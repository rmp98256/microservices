package com.mayur.user.service.Exception;

public class ResouceNotFoundException extends RuntimeException{
	
	public ResouceNotFoundException()
	{
		super("Resouce not found exception");
	}
	
	public ResouceNotFoundException(String msg)
	{
		super(msg);
	}

}
