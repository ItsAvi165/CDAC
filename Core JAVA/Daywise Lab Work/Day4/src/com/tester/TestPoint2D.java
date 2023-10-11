package com.tester;

import com.core.Point2D;

//import java.util.Arrays;
import java.util.Scanner;

class TestPoint2D {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many points you want to plot: ");
		Point2D[] points;
		int size = sc.nextInt();
		int arrayIndex;
		points = new Point2D[size];

		boolean flag = true;
		do {
			System.out.print("1. Insert new element\n2. Elements equality\n3. Display elements\n4. EXIT\n");
			
			switch (sc.nextInt()) {

			case 1:
				System.out.println("Insert index: ");
				arrayIndex = sc.nextInt();
				if (arrayIndex > size - 1) {
					System.out.println("Array index out of bound ");
				} else if (points[arrayIndex] != null) {
					System.out.println("Point already exists at " + arrayIndex);
				} else {
					System.out.println("Enter points: (x,y) ");
					points[arrayIndex] = new Point2D(sc.nextDouble(), sc.nextDouble());
				}

				break;
			case 2:
				System.out.println("Enter index 1: ");
				int arrayIndex1 = sc.nextInt();
				if (arrayIndex1 > size - 1) {
					System.out.println("Array index out of bound ");
					}
				System.out.println("Enter index 2: ");
				int arrayIndex2 = sc.nextInt();
				if (arrayIndex2 > size - 1) {
					System.out.println("Array index out of bound ");
				} else {
					System.out.println(points[arrayIndex1].isEqual(points[arrayIndex2]) ? "Points are Same"
							: "Points are Different");
				}
				break;
			case 3:
				System.out.println("Enter index choice: ");
				arrayIndex = sc.nextInt();
				if (arrayIndex > size - 1) {
					System.out.println("Array index out of bound");
				} else {
					System.out.println(points[arrayIndex]);
					//System.out.println(Arrays.toString(points));
				}
				break;
			case 4:
				//System.exit(0);
				flag = false;
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		} while (flag == true);

		sc.close();
	}
}

//OLD CODE

//Scanner sc = new Scanner(System.in);
//System.out.println("Enter co-ordinates of first point (x1,y1) ");
//Point2D p1 = new Point2D(sc.nextDouble(), sc.nextDouble());
//System.out.println("Enter co-ordinates of second point (x2,y2) ");
//Point2D p2 = new Point2D(sc.nextDouble(), sc.nextDouble());
//System.out.println(p1);
//System.out.println(p1.show());
//System.out.println(p2);
//System.out.println(p2.show());
//if (p1.isEqual(p2)) System.out.println("SAME"); else {
//System.out.println("DIFFERENT");
//// System.out.println(
////   "Distance between given two points is " +
////   p1.calculateDistance(p2) +
////   " units"
//// );
//System.out.printf(
//  "Distance between given two points is %.2f Units",
//  p1.calculateDistance(p2)
//);
//}

//	do {
//	System.out.println("Enter array index where you have to add the point ");
//	arrayIndex = sc.nextInt();
//	if (arrayIndex > size-1) {
//		System.out.println("Array index out of bound ");
//	} else if (points[arrayIndex] != null) {
//		System.out.println("Point already exists at " + arrayIndex);
//	} else {
//		System.out.println("Enter x and y co-ordinate of point ");
//		points[arrayIndex] = new Point2D(sc.nextDouble(), sc.nextDouble());
//	}
////for(int i=0;i<points.length;i++) {
////if(points[i] != null) break;
////}
//} while (arrayIndex < size  );
//
//System.out.println("Points plotted so far are : ");
//for (Point2D point : points) {
//	System.out.println(point);
//}
//
//System.out.println("Enter two indices for equality: ");
//System.out.println(points[sc.nextInt()].isEqual(points[sc.nextInt()])?"Points are Same":"Points are Different"); 