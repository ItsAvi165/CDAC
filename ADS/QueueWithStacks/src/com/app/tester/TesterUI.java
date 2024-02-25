package com.app.tester;

import java.util.Scanner;

import com.app.core.classes.QueueWithStacks;

public class TesterUI {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		QueueWithStacks q = new QueueWithStacks();
		
		boolean exit = false;
		
		while(!exit) {
			
			//try {
				
				System.out.println("----------------------------------------MENU--------------------------------------");
				System.out.println("1. Enqueue");
				System.out.println("2. Dequeue");
				System.out.println("0. Exit");
				System.out.println("----------------------------------------------------------------------------------");
				System.out.println("Your choice: ");
				
				switch (scanner.nextInt()) {
				case 1:
					System.out.println("Enter the element to be enqueued: ");
					q.enqueue(scanner.nextInt());
					break;
					
				case 2:
					q.dequeue();
					break;
					
				case 0:
					System.out.println("Thank you, program is terminating!");
					exit = true;
					break;

				}
//			} catch (Exception e) {
//				e.printStackTrace();
//				scanner.nextLine();
//			}
		}
		scanner.close();
	}
	
}

