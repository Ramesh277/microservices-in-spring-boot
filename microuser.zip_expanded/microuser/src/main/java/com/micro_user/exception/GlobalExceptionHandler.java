package com.micro_user.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.micro_user.exception.Payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	
	//Response Entity code
	//that call to the resourcenotfoundException 	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse>  handlerResouceNotFoundException(ResourceNotFoundException ex)
	{	
		String mas = ex.getMessage();	
		
		ApiResponse ai = ApiResponse.builder().massege(mas).success(true).status(HttpStatus.NOT_FOUND).build();
		
		return new ResponseEntity<ApiResponse>(ai,HttpStatus.NOT_FOUND);
		
		
	}

}
