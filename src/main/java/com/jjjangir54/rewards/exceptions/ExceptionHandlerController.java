package com.jjjangir54.rewards.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerController extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<String> handleAllExceptions(Exception ex) {
		return new ResponseEntity<>("Internal Server Error", HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(CustomerNotFoundException.class)
	public final ResponseEntity<Object> handleCustomerNotFoundException(CustomerNotFoundException ex) {
		return new ResponseEntity<>(ex.getLocalizedMessage(), HttpStatus.NOT_FOUND);
	}
	
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public static class CustomerNotFoundException extends RuntimeException{
		private static final long serialVersionUID = 1L;
		public CustomerNotFoundException(String message) { 
			super(message); 
		}
		
	}
}