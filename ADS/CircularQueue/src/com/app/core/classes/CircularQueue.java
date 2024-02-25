package com.app.core.classes;

import com.app.customexception.CustomQueueException;

public class CircularQueue implements ICircularQueue {

	//attributes
	//private String element;
	private int front;
	private int rear;
	private int maxSize = 5;
	private String[] cq;
	
	//constructor
	public CircularQueue() {
		front = -1;
		rear = -1;
		cq = new String[maxSize];
	}
	
	
	@Override
	public boolean add(String element) throws CustomQueueException {
		
		//first checking if the q is full
		if(isFull()) {
			return false;
		}
		
		//otherwise enq the element
		if(front == -1)
			front = 0;
		
		rear = (rear + 1) % maxSize;
		cq[rear] = element;
		//System.out.println(rear);
		return true;
	}

	@Override
	public String remove() {
		
		//first checking if the q is null
		if(isEmpty())
			return null;
		if(front==rear) {
		String result = cq[front];
		front = rear = -1;
		return result;
		}
		else {
			String result = cq[front];
			front = (front+1)% maxSize;
			return result;
		}
//		//otherwise deq the element
//		String result = cq[front];
//		
//		if(front == rear) 
//			rear = front = -1; 	//resetting front and rear to default position
//		else
//			front = (front + 1) % maxSize;
//		
//		return result;
	}

	@Override
	public int size() {
		return ((rear+1) - front)% maxSize;
	}


	@Override
	public boolean isEmpty() {
		//return front == -1; 	--> not suitable for current code
		if(front == -1 &&  rear == -1)
			return true;
		return false;
	}


	@Override
	public boolean isFull() {
		//return front == (rear + 1) % maxSize;  --> for some reason, this does not work
		if(front == 0 && rear == maxSize - 1)
			return true;
		if(front == rear + 1)
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		
		//first checking if the q is null
		if(isEmpty())
			return null;
		
		
		StringBuffer result = new StringBuffer(); //using this to reduce overhead
		
//		WRONG LOGIC
//		while(!isEmpty()) {
//			result = result.append(cq[front]).append(", ");
//			front = (front + 1) % maxSize;
//		}
		
		for(int i = front; i <= rear; i = (i + 1)% maxSize) {
			result = result.append(cq[i]).append(", ");
		}
		int length = result.length();
		result.deleteCharAt(length-2);
		return result.toString();
	}

}
