package tester;

import java.util.Scanner;

import LL.SinglyLinkedList;

public class LLTest {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			SinglyLinkedList list = new SinglyLinkedList();
			boolean exit = false;
			while (!exit) {
				try {
					System.out.println("\nOptions\n1. Add Last\n2. Show All\n3. Reverse\n");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Add Last");
						System.out.println("Enter a new Node: ");
						list.addLast(sc.nextInt());
						break;
					case 2:
						System.out.println("Show all");
						list.showAllList();
						break;
					case 3:
						System.out.println("Reverse");
						list.reverse();
						break;

					default:
						break;
					}

				} catch (Exception e) {
					// TODO: handle exception
//					e.printStackTrace();
					System.out.println(e.getMessage());
					sc.nextLine();
				}
			}

		}

	}
}
