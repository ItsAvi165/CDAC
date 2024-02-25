package tester;

import java.util.Scanner;

import core_classes.DoublyLinkedList;

public class Tester {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		System.out.println("What would be the size of the linked list?");
//		int LinkedListSize = scanner.nextInt();
		
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		
		boolean exit = false;
		while(!exit) {
			System.out.println("----------------------------------------MENU--------------------------------------");
			System.out.println("1. Show the contents of linked list");
			System.out.println("2. Insert the data in the linked list");
			System.out.println("3. Check how many elements are there in the linked list.");
			System.out.println("4. Check to see if linked list is empty.");
			System.out.println("5. Exit");
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("Your choice: ");
			
			switch (scanner.nextInt()) {
				case 1:
					System.out.println("Contents of the list (forward):");
					doublyLinkedList.displayContentsForward();
					break;
				case 2:
					System.out.println("Enter the element to be added to the link:");
					doublyLinkedList.addElement(scanner.nextInt());
					break;
				case 3:
					System.out.println("Number of elements in the link: " + doublyLinkedList.numberOfElements());
					break;
				case 4:
					System.out.println("If list is empty: " + doublyLinkedList.isEmpty());
					break;
				case 5:
					System.out.println("Contents of the list (backward):");
					doublyLinkedList.displayContentsBackward();
					break;
				case 6:
					exit = true;
					break;
			}
		}
		scanner.close();
	}


}
