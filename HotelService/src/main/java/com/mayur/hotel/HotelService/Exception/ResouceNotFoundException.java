package com.mayur.hotel.HotelService.Exception;

public class ResouceNotFoundException extends RuntimeException{
	
	public ResouceNotFoundException(String s) {
		super(s);
	}
	
	public ResouceNotFoundException() {
		super("Resource Not found !!!");
	}

}
