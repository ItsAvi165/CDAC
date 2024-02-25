package linklist3;

import java.util.Scanner;

public class tester {
	public static void main(String[]args) {
		Scanner sc=new Scanner (System.in);
		boolean exit=false;
		int pos,data;
		LinkList list=new LinkList();
		list.addAtLast(10);
		list.addAtLast(20);
		list.addAtLast(20);
		while(!exit) {
			System.out.println("....menu....");
			System.out.println("\n 0.Exit");
			System.out.println("\n 1.Display");
			System.out.println("\n 2.Add First");
			System.out.println("\n 3.Add Last");
			System.out.println("\n 4.Add At position");
			System.out.println("\n 5.Add in a sorted manner");
//			System.out.println("\n 6.Del first");
//			System.out.println("\n 7.Del last ");
    		System.out.println("\n 8.Del at porition");
//			System.out.println("\n 9.Del All");
			System.out.println("\n 10.Reverse the list");
     		System.out.println("\n 11.Remove occurence");
//			System.out.println("\n 12.Search");
 			System.out.println("\n 13.Check if LL is sorted:");
 			System.out.println("\n 14.Display string using toString:");
			try {
			switch(sc.nextInt()) {
			case 1:
				
				list.display();
				break;
			case 2:
				System.out.println("enter data");
				data=sc.nextInt();
				list.addAtFirst(data);
				break;
			case 3:
				System.out.println("enter data");
				data=sc.nextInt();
				list.addAtLast(data);
				break;
			case 4:
				System.out.println("enter value and position");
				data=sc.nextInt();
				pos=sc.nextInt();
				list.addAtPos(data, pos);;
				break;
			case 5:
				System.out.println("enter value");
				data=sc.nextInt();
				list.addSorted(data);
				break;
//			case 6:
//				System.out.println("delete first node");
//				list.delAtFirst();;
//				break;
//			case 7:
//				System.out.println("delete last node");
//				list.delAtLast();
//				break;
			case 8:
				System.out.println("Enter position to delete the node: ");
				pos=sc.nextInt();
				list.delAtPos(pos);;
				break;
//			case 9:
//				System.out.println("delete All node");
//				list.delAll();
//				break;
			case 10:
				System.out.println("list before reverse is: ");
				list.display();
				System.out.println("reversed list is: ");
				list.reverse();
				list.display();				
				break;
//				
			case 11:
				System.out.println("enter the value");
				int a=sc.nextInt();
				list.removeOccurence(a);
				list.display();
				break;
//				
//			case 12:
//				System.out.println("enter the value");
//				int b=sc.nextInt();
//				list.search(b);
//				break;
			case 13:
				boolean isSorted = list.isSorted();
				if (isSorted==true) System.out.println("List is sorted");
				else
					System.out.println("List is not sorted");
				break;
			case 14:
				System.out.println("Printing LL using toString");
				System.out.println(list.toString());;
				break;
			case 0:
				exit=true;
				break;
			}
			
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	sc.close();	
}
}
