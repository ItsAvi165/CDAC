package com.app.tester;

import java.util.Scanner;

import com.app.core.classes.CircularQueue;

public class QueueUI {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//creating instance of the circular Q class
		CircularQueue circularQueue = new CircularQueue();
		
		boolean exit = false;
		while(!exit) {
			
			System.out.println("----------------------------------------MENU--------------------------------------");
			System.out.println("1. Add string");
			System.out.println("2. Remove string");
			System.out.println("3. Number of elements in the queue");
			System.out.println("4. Display all elements");
			System.out.println("0. Exit");
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("Your choice: ");
			
			try {
				switch (scanner.nextInt()) {
				
				case 1:		//1. Add string
					System.out.println("Enter the string to be added: ");
					boolean isAdded = circularQueue.add(scanner.next());
					if(isAdded)
						System.out.println("Element added.");
					break;
					
				case 2:		//2. Remove string					
					
					String result = circularQueue.remove();
					
					if(result == null)
						System.out.println("Queue is empty. No more element to remove");
					else
						System.out.println(result);
					break;
					
				case 3:		//3. Number of elements in the queue
					System.out.println("Number of elements in the queue: " + circularQueue.size());
					break;
					
				case 4:		//4. Display all elements
					String display = circularQueue.toString();;
					
					if(display == null)
						System.out.println("Queue is empty.");
					else
						System.out.println(display);
					
					break;
					
				case 0:
					exit = true;
					break;

				}
				
			} catch (Exception e) {
				e.printStackTrace();
				scanner.nextLine();
			}
		}
		scanner.close();
	}

}
