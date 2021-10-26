import java.lang.Math;

public class Triangle{
  private Point x, y, z;
  public Triangle(Point a, Point b, Point c){
    x = a;
    y = b;
    z = c;
  }

  public Triangle(double d, double e, double f, double g, double h, double i){
    x = new Point(d, e);
    y = new Point(f, g);
    z = new Point(h, i);
  }

  public double getPerimeter(){
    return Math.sqrt(Math.pow(x.getX()-y.getX(), 2) + Math.pow(x.getY()-y.getY(), 2)) + Math.sqrt(Math.pow(x.getX()-z.getX(), 2) + Math.pow(x.getY()-z.getY(), 2)) + Math.sqrt(Math.pow(y.getX()-z.getX(), 2) + Math.pow(y.getY()-z.getY(), 2));
  }

  public Point getVertex(int index){
    Point[] arr = {x, y, z};
    return arr[index - 1];
  }

  public void setVertex(int index, Point change){
    if (index == 1)x = new Point(change.getX(), change.getY());
    if (index == 2)y = new Point(change.getX(), change.getY());
    if (index == 3)z = new Point(change.getX(), change.getY());
  }

  public String toString(){
    return ("{("+ x.getX() +", "+ x.getY() + "), (" + y.getX() + ", " + y.getY() + "), (" + z.getX() + ", " + z.getY()) +")}";
  }
}
