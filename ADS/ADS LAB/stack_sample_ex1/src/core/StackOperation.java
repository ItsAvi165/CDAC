package core;

import java.util.Arrays;

public class StackOperation {

	private static class Node {
		private int data;
		private Node next;

		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}

	}

	private Node head;

	public void displayStack() {
		if (head == null)
			throw new RuntimeException("Stack is empty...");
		else {
			Node trav = head;
			while (trav != null) {
				System.out.println(trav.data);
				trav = trav.next;
			}
		}
	}

	// Add first
	public void push(int nextInt) {
		Node pushElement = new Node(nextInt);
		if (head == null)
			head = pushElement;
		else  {
			pushElement.next = head;
			head = pushElement;
		}
	}

	// Remove first
	public void pop() {
		if (head == null)
			throw new RuntimeException("Stack is empty");
		else if (head.next == null)
			head = null;
		else {
			head = head.next;
		}
	}

	// Show first
	public void top() {
		// TODO Auto-generated method stub
		if(head == null)
			throw new RuntimeException("Stack is empty..");
		else{
			System.out.println(head.data);
		}
	}

	// last + 1
	public int getMax() {
		int count = 0;
		if(head == null)
			throw new RuntimeException("Stack is empty...");
		else if (head.next == null)
			return head.data;
		else {
			Node trav = head;
			while(trav!=null)
			{
				trav = trav.next;
				count++;
			}
			int[] ele = new int[count];
			trav  = head;
			count = 0;
			while(trav!=null)
			{
				ele[count] = trav.data;
				trav = trav.next;
				count++;
			}

			Arrays.sort(ele);
			return ele[count-1];
			
		}
	}

}
