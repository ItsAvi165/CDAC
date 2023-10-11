package point.core;

import java.lang.Math;

public class Point2D {

  private double x;
  private double y;

  public Point2D(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public String show() {
    return "x= " + this.x + " y= " + this.y;
  }

  public boolean isEqual(Point2D rvar) {
    if (this.x == rvar.x && this.y == rvar.y) {
      return true;
    } else {
      return false;
    }
  }

  public double calculateDistance(Point2D rvar) {
    double distance = Math.sqrt(
      (this.x - rvar.x) *
      (this.x - rvar.x) +
      (this.y - rvar.y) *
      (this.y - rvar.y)
    );
    return distance;
  }
}
