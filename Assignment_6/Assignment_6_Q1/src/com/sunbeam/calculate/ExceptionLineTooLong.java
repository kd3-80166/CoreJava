package com.sunbeam.calculate;

public class ExceptionLineTooLong extends RuntimeException{
	private String message;
	private int length;
	public ExceptionLineTooLong(String message, int length) {
		super(message);
		this.message = message;
		this.length = length;
		
		
	}
	@Override
	public String toString() {
		return "ExceptionLineTooLong [message=" + message + ", length=" + length + "]";
	}
	
}
