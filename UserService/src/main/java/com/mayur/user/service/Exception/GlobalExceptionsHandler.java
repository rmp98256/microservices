package com.mayur.user.service.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.mayur.user.service.Payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionsHandler {
	
	@ExceptionHandler(ResouceNotFoundException.class)
	public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResouceNotFoundException exception){
	String msg=	exception.getMessage();
	
	ApiResponse response= ApiResponse.builder().msg(msg).success(true).status(HttpStatus.NOT_FOUND).build(); 
	return new ResponseEntity<ApiResponse>(response,HttpStatus.NOT_FOUND);
	}

}
