package com.app.customexception;


@SuppressWarnings("serial")
public class CustomQueueException extends Exception{
	
	public CustomQueueException(String message) {
		super(message);
	}
}
