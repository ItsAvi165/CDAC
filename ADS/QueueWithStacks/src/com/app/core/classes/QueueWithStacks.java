package com.app.core.classes;

import java.util.Stack;

import com.app.core.customexception.CustomQueueException;

public class QueueWithStacks {

	//-----------------------------------------------------------------------------
	//attributes
	private Stack<Integer> stackEnq;
	private Stack<Integer> stackDeq;
	
	//constructor
	public QueueWithStacks() {
		stackEnq = new Stack<Integer>();
		stackDeq = new Stack<Integer>();
	}
	
	//-----------------------------------------------------------------------------
	//transferring elements from enq stack to deq stack
	private void transferElements() {
		while(!stackEnq.isEmpty()) 
			stackDeq.push(stackEnq.pop());
	}
	
	//-----------------------------------------------------------------------------
	//enq
	public void enqueue(Integer element) {
		stackEnq.push(element);
		System.out.println("Element enqueued.");
	}
	
	//-----------------------------------------------------------------------------
	//deq
	public void dequeue() {
		if(stackDeq.isEmpty())
			transferElements();
		
		if(!stackDeq.isEmpty()) {
			System.out.println("Dequedued element: " + stackDeq.pop());
		}
		else
			throw new RuntimeException("Queue is empty.");
	}
	//-----------------------------------------------------------------------------
}
