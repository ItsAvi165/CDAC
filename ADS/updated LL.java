package com.core;

public class LinkList {
	public static class Node{
		private int data;
		private Node next;
		
		public Node() {
			
			data = 0;
			next = null;
		}

		public Node(int val) {
			
			data = val;
			next = null;
		}
				
	}
	private Node head;
	public LinkList() {
		
		head = null;
	}
	public boolean isEmpty() {
		return head==null;
	}
	
	public void display() {
		if(isEmpty())
			throw new RuntimeException("List is Empty");
		else {
			Node trav=head;
			while(trav!=null) {
				System.out.print(trav.data+" ");
				trav=trav.next;
			}
		}
		
	}
	
	public void addAtFirst(int val) {
		Node newNode=new Node(val);
		
			newNode.next=head;
			head=newNode;
		
	}
	public void addAtLast(int val) {
		Node newNode=new Node(val);
		if(head==null)
		{
			
			head=newNode;
		}
		else {
			Node trav =head;
			while (trav.next!=null) {
				trav=trav.next;
				
				trav.next=newNode;
			}
		}
	}
	
	public void addAtPos(int val,int pos) {
		Node newNode=new Node(val);
		if(head==null||pos<=1) {
			newNode.next=head;
			head=newNode;
		}
		else {
			Node trav =head;
			for(int i=0;i<pos-1;i++) {
				trav=trav.next;
				newNode=trav.next;
				trav.next=newNode;
			}
		}
		
	}
	public void delAtFirst() {
		if(isEmpty())
			throw new RuntimeException("List is empty..");
		else {
			head=head.next;
		}
	}
	
	public void delAtLast() {
		if(isEmpty())
			throw new RuntimeException("List is empty..");
		if(head.next==null) {
			head=null;
		}
		else {
			Node trav =head,temp=null;
			while(trav.next!=null) {
				temp=trav;
				trav=trav.next;		
			}
			temp.next=null;
		}
	}
	
	public void delAtPos(int pos) {
		if(head==null||pos<1)
			throw new RuntimeException("Either list is empty or invalid position");
		if(pos==1)
		{
			head=head.next;
		}
		else{
			Node trav=head,temp=null;
			for(int i=0;i<pos;i++) {
				if(trav==null)
					throw new RuntimeException("invalid posiiton");
				temp=trav;
				trav=trav.next;
					}
			trav.next=temp.next;
			
		}
	}
	
	public void delAll() {
		head=null;
	}
	
	public void reverse() {
		Node oldHead=head;
		head=null;
		while(oldHead!=null) {
		Node temp=oldHead;
		oldHead=oldHead.next;
		temp.next=head;
		head=temp;
	}
		}
	public void addAtSorted(int val) {
		Node newNode=new Node(val) ;
			if(head==null||head.data>val) {
				newNode.next=head;
				head=newNode;
					}
			else {
				Node trav=head;
				while(trav.next!=null||trav.next.data<val) {
					trav=trav.next;
				}
				newNode.next=trav.next;
				trav.next=newNode;
			}
		
	}
	public void removeOccurence(int val) {
		if(head!=null&&head.data==val) {
			head=head.next;
		}
		else {
			Node trav=head;
			while(trav!=null&&trav.next!=null) {
				if(trav.next.data==val) {
					trav.next=trav.next.next;
					}
				else {
					trav=trav.next;
				}
			}
		}
	}
	
	public void search(int val) {
		int i=1;
		boolean flag=false;
		if(isEmpty())
			throw new RuntimeException("List is empty..");
		else {
			Node trav=head;
			while(trav!=null) {
				if(trav.data==val) {
					flag=true;
					break;
				}i++;
				trav=trav.next;
				
			}
		}
		if(flag)
			System.out.println("element is present in the list at the position"+i);
		else {
			System.out.println("element is not found");
		}			
		
	}
	@Override
	public String toString() {
		String result="";
		Node trav=head;
		while(trav!=null) {
			result+=trav.data+",";
			trav=trav.next;
		}
		return result;
	}
	public boolean isSorted() {
		int x=-1;
		Node trav=head;
		while(trav!=null) {
			if(trav.data<x)
				return false;
		x=trav.data;
		trav=trav.next;
	}
	return true;

}}
