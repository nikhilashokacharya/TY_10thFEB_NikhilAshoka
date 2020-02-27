package com.tyss.capgemini.exceptions;

public class InvalidNumberCustomException extends RuntimeException{
	
	public InvalidNumberCustomException(String message) {
		// super(message);  // You will get the exception message that is predefined
	     System.err.println(message); // You will get the custom exception.
	}
}
