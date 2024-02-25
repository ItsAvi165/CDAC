package com.queue;

import java.util.Scanner;

public class Queue {

    private int[] queue;
    private int front, rear, capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = rear = 0;
    }

    // Method to enqueue an element in the queue
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        queue[rear] = element;
        rear++;
    }

    // Method to dequeue an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int element = queue[front];
        front++;
        return element;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return rear == capacity;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return front == rear;
    }

    // Method to get the size of the queue
    public int size() {
        return rear - front;
    }

    // Method to display the queue
    public void display() {
        System.out.println("Queue: ");
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the count of elements from user to create the queue
        System.out.println("Enter capacity of the queue: ");
        int capacity = sc.nextInt();

        // Create the queue
        Queue queue = new Queue(capacity);

        // Menu based program to perform queue operations
        int choice;
        do {
            System.out.println("Queue Operations: ");
            System.out.println("1. Display queue");
            System.out.println("2. Add data in queue");
            System.out.println("3. Display data from queue");
            System.out.println("4. Check the size of queue");
            System.out.println("5. Check if queue is full or not");
            System.out.println("6. Check if queue is empty or not");
            System.out.println("7. Exit");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    queue.display();
                    break;

                case 2:
                    System.out.println("Enter the data to store: ");
                    int element = sc.nextInt();
                    queue.enqueue(element);
                    break;

                case 3:
                    int data = queue.dequeue();
                    if (data != -1) {
                        System.out.println("Data dequeued: " + data);
                    }
                    break;

                case 4:
                    System.out.println("Size of the queue: " + queue.size());
                    break;

                case 5:
                    System.out.println("Is queue full? " + queue.isFull());
                    break;

                case 6:
                    System.out.println("Is queue empty? " + queue.isEmpty());
                    break;

                case 7:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 7);

        sc.close();
    }
}