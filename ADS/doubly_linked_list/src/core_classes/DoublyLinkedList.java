package core_classes;

public class DoublyLinkedList {
	//-----------------------------------------------------------------------------
	//attributes
	Node head;
	Node tail;
	
	private class Node{
		//attributes
		private int element;
		Node previous;
		Node next;
		
		//constructor
		public Node(int element) {
			this.element = element;
			this.previous = null;
			this.next = null;
		}
	}
	
	//-----------------------------------------------------------------------------
	//constructor
	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	//-----------------------------------------------------------------------------
	//adding element
	public void addElement(int element) {
		Node newNode = new Node(element);
		
		if(head == null) {
			newNode.previous = newNode.next = null;
			head = tail = newNode;
			System.out.println("Element added at first index.");
		}
		else {
			tail = head;
			while(tail.next != null)
				tail = tail.next;
			tail.next = newNode;
			newNode.previous = tail;	//NOTE: very IMP step in doubly linked list
			tail = newNode;
		}
	}
	
	//-----------------------------------------------------------------------------
	//displaying contents in forward direction
	public void displayContentsForward() {
		Node currentNode = head;
		while(currentNode != null) {
			System.out.println(currentNode.element + " ");
			currentNode = currentNode.next;
		}
	}
	
	//-----------------------------------------------------------------------------
	//displaying contents in backward direction
	public void displayContentsBackward() {
		Node tail = head;
		
		while(tail.next != null)
			tail = tail.next;
		
		while(tail != head) {
			System.out.println(tail.element + " ");
			tail = tail.previous;
		}
		System.out.println(tail.element + " ");
	}
	
	//-----------------------------------------------------------------------------
	//number of elements in the linked list
	public int numberOfElements() {
		int count = 0;
		Node currentNode = head;
		while(currentNode != null) {
			count++;
			currentNode = currentNode.next;
		}
		return count;	
	}
	
	//-----------------------------------------------------------------------------
	//isEmpty
	public boolean isEmpty() {
		return head == null;
	}
}












