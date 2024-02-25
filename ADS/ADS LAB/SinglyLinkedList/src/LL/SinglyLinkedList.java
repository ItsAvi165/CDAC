package LL;

public class SinglyLinkedList {
	static class Node {
		private int data;
		private Node next;

		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
			// TODO Auto-generated constructor stub
		}
	}

	private Node head;

	public boolean isEmpty() {
		if (head == null)
			return true;
		else
			return false;
	}

	public void addLast(int nextInt) {
		// TODO Auto-generated method stub
		Node newNode = new Node(nextInt);
		if (isEmpty()) {
			head = newNode;
		} else {
			Node trav = head;
			while (trav.next != null) {
				trav = trav.next;
			}
			trav.next = newNode;
			
		}

	}

	public void showAllList() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			throw new RuntimeException("List is Empty...");
		} else {
			Node trav = head;
			System.out.print("head");
			while (trav != null) {
				System.out.print("->" + trav.data);
				trav = trav.next;
			}
			System.out.print("->NULL");
		}

	}

	public void reverse() {
		// TODO Auto-generated method stub
		Node following = head;
		Node current = head;
		Node previous = null;
		if (isEmpty()) {
			throw new RuntimeException("List is Empty...");
		} else {
			while (current != null) {
				following = following.next;
				current.next = previous;
				previous = current;
				current = following;
			}
			head = previous;
		}
	}
}
