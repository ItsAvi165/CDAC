package tester;

import java.util.Scanner;

import my_list.MySinglyCircularLinkedList;

public class MyMainListTester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MySinglyCircularLinkedList list = new MySinglyCircularLinkedList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		boolean exit = false;
		while (!exit) {
			System.out.println("Option\n" + "1. display list\n" + "2. add last element\n" + "3. add first element\n"
					+ "4. add value at pos\n" + "5. delete first node\n" +"6. delete all nodes\n" +"7. delete at position\n"+"8. delete at last\n"+ "0. Exit");
			switch (sc.nextInt()) {
			case 1:
				list.displayAllList();
				break;
			case 2:
				System.out.println("Enter last new element: ");
				list.addLast(sc.nextInt());
				break;
			case 3:
				System.out.println("Enter new first element");
				list.addFirst(sc.nextInt());
				break;
			case 4:
				System.out.println("Enter position to be added: ");
				int pos = sc.nextInt();
				System.out.println("Enter value at that position: ");
				int val = sc.nextInt();
				list.addAtPos(val, pos);
				break;
			case 5:				
				list.deleteFirst();
				System.out.println("First node deleted successfully");
				break;
			case 6:				
				list.deleteAll();
				System.out.println("All nodes deleted successfully");
				break;
			case 7:
				System.out.println("Delete at position: ");
				System.out.println("Enter position: ");
				list.deleteAtPos(sc.nextInt());
				break;
			case 8:
				System.out.println("Delete at last");
				list.deleteLast();
				break;
			case 0:
				exit = true;
				System.out.println("Bye :(");
				break;
			default:
				break;
			}
		}
		sc.close();
	}
}