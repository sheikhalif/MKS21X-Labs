import java.lang.Math;

public class Point{
  private double x,y;
  public Point(double X, double Y){
    x=X;
    y=Y;
  }
  public Point(Point p){
    x= p.x;
    y= p.y;
  }
  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }

  public static double distance(Point a, Point b){
    return Math.sqrt((b.x - a.x)*(b.x - a.x) + (b.y - a.y)*(b.y - a.y));
  }

  public double distanceTo(Point c){
    return Math.sqrt((x - c.x)*(x - c.x) + (y - c.y)*(y - c.y));
  }

  public String toString(){
    return ("(" + x + "), (" + y +")");
  }

  public static boolean closeEnough(double a, double b){
    if (a == 0 || b == 0){
      return (a == b);
    }
    double subValue = (b-a);
    if (subValue < 0)subValue = -1 * (b-a);
    return (subValue/a < 0.00001 && subValue/b < 0.00001);
  }
}
