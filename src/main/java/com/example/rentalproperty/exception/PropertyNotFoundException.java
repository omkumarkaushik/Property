package com.example.rentalproperty.exception;

public class PropertyNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PropertyNotFoundException() {
		
	}
	
	public PropertyNotFoundException(String message) {
		super(message);
	}
}

