package linklist3;

public class LinkList {
	private Node head;

	private static class Node {
		private int data;
		private Node next;

//		public Node() {
//			
//			data = 0;
//			next = null;
//		}
		public Node(int data) {

			this.data = data;
			next = null;
		}

	}
	

	public LinkList() {

		head = null;
	}

	private boolean isEmpty() {
		return head == null;

	}

	public void display() {
		if (isEmpty()) {
			throw new RuntimeException("list is empty..");
		} else {
			Node trav = head;
			while (trav != null) {
				System.out.print(trav.data + " -> ");
				trav = trav.next;
			}
		}
		System.out.println();

	}

	public void addAtFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;

	}

	public void addAtLast(int data) {
		Node newNode = new Node(data);
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

	public void addAtPos(int data, int pos) {
		Node newNode = new Node(data);

		if (head == null || pos <= 1) {
			addAtFirst(data);
		} else {
			Node trav = head;
			for (int i = 1; i < pos - 1; i++) {
				trav = trav.next;
			}
			newNode.next = trav.next;
			trav.next = newNode;
		}
	}

	public void addSorted(int data) {
		Node newNode = new Node(data);
		if (head == null || head.data > data) {
			newNode.next = head;
			head = newNode;
		} else {
			Node trav = head;
			while (trav.next.data <= data) {
				trav = trav.next;
				if (trav.next == null)
					break;
			}
			newNode.next = trav.next;
			trav.next = newNode;

		}

	}

	public void delAtFirst() {
		if (isEmpty())
			throw new RuntimeException("List is empty");
		else {
			head = head.next;

		}
	}

	public void delAtLast() {
		if (isEmpty())
			throw new RuntimeException("List is empty");
		if (head.next == null) {
			head = null;
		} else {
			Node trav = head;
			// Node temp=null;
			while (trav.next.next != null) {
				trav = trav.next;
			}

			trav.next = null;
		}
	}

	public void delAtPos(int pos) {
		if (head == null || pos < 1)
			throw new RuntimeException("list is empty or invalid position");
		if (pos == 1) {
			delAtFirst();
		} else {
			Node trav = head;
			// Node temp=null;
			for (int i = 1; i < pos - 1; i++) {
				if (trav.next == null)
					throw new RuntimeException("invalid posiiton");
				// temp=trav;
				else
					trav = trav.next;

			}
			trav.next = trav.next.next;
		}
	}

	public void delAll() {
		head = null;
	}

	public void reverse() {
//	//consider current list as old and new list as empty
//	Node oldHead=head;
//	head=null;
//	while(oldHead!=null) {
//	//delete first(temp)from old list
//	Node temp=oldHead;
//	oldHead=oldHead.next;
//	//add first to new list
//	temp.next=head;
//	head=temp;}

		Node prev = null;
		Node current = head;
		Node next = null;

		while (current != null) {
			next = current.next; // Save the next node
			current.next = prev; // Reverse the link
			prev = current; // Move prev to the current node
			current = next; // Move current to the next node
		}

		head = prev; // Update the head to the last node (prev)

	}

	public void removeOccurence(int data) {
		if (head != null && head.data == data) {
			head = head.next;
		} else {
			Node trav = head;
			while (trav.next != null) {
				if (trav.next.data == data) {
					if(trav.next.next==null)
					trav.next = null;
					else trav.next = trav.next.next;
				} else {
					trav = trav.next;
				}
			}

		}
	}

	public void search(int data) {
		int position = 1;
		boolean flag = false;
		if (isEmpty())
			throw new RuntimeException("list is empty");

		else {
			Node trav = head;

			while (trav != null) {
				if (trav.data == data) {
					flag = true;
					break;
				}
				position++;
				trav = trav.next;
			}
		}
		if (flag) {
			System.out.println("element is present in the list at the position" + position);
		} else {
			System.out.println("element is not found");
		}
	}

	@Override
	public String toString() {
		StringBuilder ll = new StringBuilder();
		Node trav = head;
		while (trav != null) {
			ll.append(trav.data);
			trav = trav.next;
		}
		return ll.toString();
	}

	public boolean isSorted() {
		boolean isSorted = true;
		Node trav = head;
		while (trav.next != null) {
			if (trav.data > trav.next.data) {
				isSorted = false;
				break;
			}
			trav = trav.next;
		}
		return isSorted;

	}
}
