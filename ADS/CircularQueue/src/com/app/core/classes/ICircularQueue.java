package com.app.core.classes;

import com.app.customexception.CustomQueueException;

public interface ICircularQueue {
	
	boolean add(String element) throws CustomQueueException;
	
	String remove();
	
	int size();
	
	String toString();
	
	boolean isEmpty();
	
	boolean isFull();

}
