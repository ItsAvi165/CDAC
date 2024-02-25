package com.stack;

import java.util.Scanner;

public class StackArray {

	  private static final int MAX_SIZE = 100;
	  private int[] stack;
	  private int top;

	  public StackArray() {
	    stack = new int[MAX_SIZE];
	    top = -1;
	  }

	  public void push(int data) {
	    if (top == MAX_SIZE - 1) {
	      System.out.println("Stack overflow");
	      return;
	    }

	    top++;
	    stack[top] = data;
	  }

	  public int pop() {
	    if (top == -1) {
	      System.out.println("Stack underflow");
	      return -1;
	    }

	    int data = stack[top];
	    top--;
	    return data;
	  }

	  public void displayStack() {
	    if (top == -1) {
	      System.out.println("The stack is empty");
	      return;
	    }

	    for (int i = top; i >= 0; i--) {
	      System.out.println(stack[i]);
	    }
	  }
	  public boolean search(int data) {
		  for(int i=0;i<stack.length;i++) {
			  if(stack[i]==data) return true;
		  }
		  return false;
	  }

	  public boolean isStackFull() {
	    return top == MAX_SIZE - 1;
	  }

	  public boolean isStackEmpty() {
	    return top == -1;
	  }

	  public int countElements() {
	    return top + 1;
	  }

	  public static void main(String[] args) {
	    StackArray stack = new StackArray();

	    Scanner sc = new Scanner(System.in);

	    int choice;
	    do {
	      System.out.println("1. Push the data on the stack");
	      System.out.println("2. Pop the data from the stack");
	      System.out.println("3. Display the stack");
	      System.out.println("4. Check how many elements are there on the stack");
	      System.out.println("5. Check if the stack is full or not");
	      System.out.println("6. Check if stack is empty or not");
	      System.out.println("7. Exit");
	      System.out.println("Enter your choice: ");

	      choice = sc.nextInt();

	      switch (choice) {
	        case 1:
	          System.out.println("Enter the data to push: ");
	          int data = sc.nextInt();
	          stack.push(data);
	          break;
	        case 2:
	          int poppedData = stack.pop();
	          if (poppedData != -1) {
	            System.out.println("The popped data is: " + poppedData);
	          }
	          break;
	        case 3:
	          stack.displayStack();
	          break;
	        case 4:
	          System.out.println("The number of elements on the stack is: " + stack.countElements());
	          break;
	        case 5:
	          System.out.println("Is the stack full? " + stack.isStackFull());
	          break;
	        case 6:
	          System.out.println("Is the stack empty? " + stack.isStackEmpty());
	          break;
	        default:
	          System.out.println("Invalid choice");
	      }
	    } while (choice != 7);
	    sc.close();
	  }

	}