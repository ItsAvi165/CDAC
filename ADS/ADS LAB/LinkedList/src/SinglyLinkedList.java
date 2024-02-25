import java.util.Scanner;

public class SinglyLinkedList {
	private Node head;

	public static class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void addNode(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node currentNode = head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			currentNode.next = newNode;
		}
	}

	public void addAtPosition(int pos, int data) {
		Node newNode = new Node(data);
		if (head == null)
			head = newNode;
		else if (pos == 1) {
			Node currentNode = head;
			head = newNode;
			newNode.next = currentNode;
		} else {
			Node currentNode = head;
			for (int i = 1; i < pos - 1; i++) {
				if (currentNode.next == null)
					break; // is position is beyond available node count then unnecessary iterations are
							// avoided here.
				currentNode = currentNode.next;

			}
			Node temp = currentNode.next;
			currentNode.next = newNode;
			newNode.next = temp;
		}
	}

	public void printList() {
		System.out.println("The elements of SinglyLinkedList are:");
		Node currentNode = head;
		System.out.print("head->");
		while (currentNode != null) {
			System.out.print(currentNode.data + "->");
			currentNode = currentNode.next;
		}
		System.out.print("null\n");
	}
	public void checkEmptyOrNot() {
		if(head==null) System.out.println("LinkedList is empty");
		else System.out.println("LinkedList is not empty");
	}
	public void countNumberofElements() {
		Node currentNode = head;
		int count = 0;
		while(currentNode != null) {
			++count;
			currentNode = currentNode.next;
		}
		System.out.println("The number of elements in the LinkedList are "+ count);
	}

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		Scanner sc = new Scanner(System.in);
		int choice;
		boolean exit = false;
		do {
			System.out.println("-----------------------------------------------------");
			System.out.println("SinglyLinkedList Operations: ");
			System.out.println("1. Add new node at last");
			System.out.println("2. Add new node at specific postion");
			System.out.println("3. Display LinkedList");
			System.out.println("4. Check if LinkedList is empty or not");
			System.out.println("5. Display number of elements in the LinkedList");
			System.out.println("6. EXIT");
			System.out.println("-----------------------------------------------------");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter element to add: ");
				int data = sc.nextInt();
				list.addNode(data);
				break;
			case 2:
				System.out.println("Enter position and element to add: ");
				int position = sc.nextInt();
				int value = sc.nextInt();
				list.addAtPosition(position, value);
				break;
			case 3:
				list.printList();
				break;
			case 4:
				list.checkEmptyOrNot();
				break;
			case 5:
				list.countNumberofElements();
				break;
			case 6:
				System.out.println("Thank you!");
				exit = true;
				System.exit(1);
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		} while (exit != true);
		sc.close();
	}
}