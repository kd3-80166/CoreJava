package com.sunbeaminfo.exception;

@SuppressWarnings("serial")
public class CircleException extends Exception {
	String message;
	
	
	
	public CircleException(String message) {
		super(message);
		this.message = message;
	}



	@Override
	public String toString() {
		return "CircleException [message= " + message + "]";
	}
	
}
