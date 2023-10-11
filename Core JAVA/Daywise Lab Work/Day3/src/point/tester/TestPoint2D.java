package point.tester;

import java.util.Scanner;
import point.core.Point2D;

class TestPoint2D {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter co-ordinates of first point (x1,y1) ");
    Point2D p1 = new Point2D(sc.nextDouble(), sc.nextDouble());
    System.out.println("Enter co-ordinates of second point (x2,y2) ");
    Point2D p2 = new Point2D(sc.nextDouble(), sc.nextDouble());
    System.out.println(p1);
    System.out.println(p1.show());
    System.out.println(p2);
    System.out.println(p2.show());
    if (p1.isEqual(p2)) System.out.println("SAME"); else {
      System.out.println("DIFFERENT");
      // System.out.println(
      //   "Distance between given two points is " +
      //   p1.calculateDistance(p2) +
      //   " units"
      // );
      System.out.printf(
        "Distance between given two points is %.2f Units",
        p1.calculateDistance(p2)
      );
    }
  }
}
