import java.lang.Math;

class Point2D {

  private double x;
  private double y;

  Point2D(double x, double y) {
    this.x = x;
    this.y = y;
  }

  String show() {
    return "x= " + this.x + " y= " + this.y;
  }

  boolean isEqual(Point2D rvar) {
    if (this.x == rvar.x && this.y == rvar.y) {
      return true;
    } else {
      return false;
    }
  }

  double calculateDistance(Point2D rvar) {
    double distance = Math.sqrt(
      (this.x - rvar.x) *
      (this.x - rvar.x) +
      (this.y - rvar.y) *
      (this.y - rvar.y)
    );
    return distance;
  }

  
}
