package tester;

import java.util.Scanner;

import core_classes.BinarySearchTree;

public class Tester {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		BinarySearchTree bst = new BinarySearchTree();
		
		boolean exit = false;
		while(!exit) {
			System.out.println("----------------------------------------Binary Search Tree Operations--------------------------------------");
			System.out.println("1. Insert data");
			System.out.println("2. Display tree using Inorder traversal");
			System.out.println("3. Display tree using preorder traversal");
			System.out.println("4. Display tree using postorder traversal");
			System.out.println("5. Display odd level nodes");
			System.out.println("0. Exit");
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("Your choice: ");
			
			switch (scanner.nextInt()) {
				case 1:
					System.out.println("Enter element to be inserted:");
					bst.insertElement(scanner.nextInt());
					break;
				case 2:
					System.out.println("Contents of the tree (IN-ORDER):");
					bst.inOrderPrint();
					break;
				case 3:
					System.out.println("Contents of the tree (PRE-ORDER):");
					bst.preOrderPrint();
					break;
				case 4:
					System.out.println("Contents of the tree (POST-ORDER):");
					bst.postOrderPrint();
					break;
				case 5:
					System.out.println("Odd level nodes are:");
					bst.printOddLevelNodes();
					break;
				case 0:
					exit = true;
					break;
			}
		}
		scanner.close();
	}
}
