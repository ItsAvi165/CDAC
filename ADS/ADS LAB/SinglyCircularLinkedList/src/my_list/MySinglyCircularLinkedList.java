package my_list;

public class MySinglyCircularLinkedList {
	static class Node {
		private int data;
		private Node next;

		public Node() {
			this.data = 0;
			this.next = null;
		}

		public Node(int val) {
			this.data = val;
			this.next = null;
		}
	}

	private Node head;

	public MySinglyCircularLinkedList() {
		this.head = null;
	}

	public boolean isListEmpty() {
		if (head == null)
			return true;
		return false;
	}

	public void addFirst(int val) {
		Node newNode = new Node(val);
		// if list is empty
		if (isListEmpty()) {
			head = newNode;
			newNode.next = head;
		} else {
			newNode.next = head;
			Node trav = head;
			do {
				trav = trav.next;
			} while (trav.next != head);

			trav.next = newNode;
			head = newNode;
		}
	}

	public void addLast(int val) {
		//create a new node
		Node newNode = new Node(val);
		//if list is empty
		if(isListEmpty()) {
			head = newNode;
			newNode.next = head;
		}
		else {
			//1. point a pointer to head
			Node trav = head;
			//2. newNodes next is filled with head address
			newNode.next = head;
			//3. move the pointer(trav) from head pointer untill last
			// when trav = head then trav is at las position
			do {
				trav = trav.next;
			}while(trav.next!=head);
			//4. last node will point to newNode 
			trav.next = newNode;
		}
		
	}

	public void displayAllList() {
		if (isListEmpty()) {
			System.out.println("List is empty");
		} else {
			Node trav = head;
			do {
				System.out.println(trav.data);
				trav = trav.next;
			} while (trav != head);
//			while(trav!=null) {
//				System.out.println(trav.data);
//				trav= trav.next;
//			}
		}
	}
	
	public void addAtPos(int val,int pos) {
		//if list is empty
		if(isListEmpty() || pos<=1) {
			addFirst(val);
		}
		else {
			// 1. create a new node
			Node newNode = new Node(val);
			// 2. traverse till pos-1 point
			Node trav = head;
			// 3. give pos-1 next address to new nodes next
			for (int i = 1; i < pos - 1; i++) {
				//special case 2: if given position is beyond number of list elements
				if(trav.next == head)
					break;
				trav = trav.next;
			}
			// 4. replace pos-1 next address by new nodes address
			// make
			newNode.next = trav.next;
			// before break
			trav.next = newNode;
		}
	}
	public void deleteFirst() {
		//special case 1: if list is empty
		if(isListEmpty()) {
			System.out.println("List is already empty!");
			return;
		}
		//special case 2: if list has only one element
		else if(head == head.next) {
			head = null;
		}
		else {
			//point to first node
			Node trav = head;
			//traverse till last node
			while (trav.next != head) {
				trav = trav.next;
			}
			//shift the head to 2nd node
			head = head.next;
			//assign the last node next address to current head
			trav.next = head;
			//first node will be set for gargbage collection
		}
	}
	public void deleteLast() {
		if(isListEmpty()) {
			System.out.println("List is already empty!");
			return;
		}
		else if(head.next == head) {
			deleteFirst();
		}
		else {
			//1. bring pointer to first node
			Node trav = head;
			while(trav.next.next!=head) {
				trav = trav.next;
			}
			trav.next = head;	
		}
	}
	//under maintaince
	public void deleteAll() {
		//special case 1: if list is empty
		if(isListEmpty()) {
			System.out.println("List is empty");
			return;
		}
		else {
			head.next = null;
			head = null;
		}
	}
	public void deleteAtPos(int pos) {
		//special case 1: if list is empty
		if(isListEmpty()) {
			System.out.println("List is empty");
			return;
		}
		else if(pos==1) {
			deleteFirst();
		}
		else {
			Node trav = head;
			//traverse till position
			for(int i=1;i<pos-1;i++) {
				if(trav.next == head)
					throw new RuntimeException("Invalid position...");
				trav=trav.next;
			}
			trav.next = trav.next.next;
		}
	}
}