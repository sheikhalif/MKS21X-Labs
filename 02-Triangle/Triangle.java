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

  public static boolean closeEnough(double a, double b){
    if (a == 0 || b == 0){
      return (a == b);
    }
    double subValue = (b-a);
    if (subValue < 0)subValue = -1 * (b-a);
    return (subValue/a < 0.00001 && subValue/b < 0.00001);
  }

  public boolean equals(Triangle other){
    return (closeEnough(x.getX(), other.x.getX()) == true && closeEnough(y.getX(), other.y.getX()) == true && closeEnough(x.getY(), other.x.getY()) == true && closeEnough(x.getY(), other.x.getY()) == true && closeEnough(y.getY(), other.y.getY()) == true && closeEnough(x.getY(), other.x.getY()) == true);
  }

  public String classify(){
    double lengthXY = Math.sqrt(Math.pow(x.getX()-y.getX(), 2) + Math.pow(x.getY()-y.getY(), 2));
    double lengthXZ = Math.sqrt(Math.pow(x.getX()-z.getX(), 2) + Math.pow(x.getY()-z.getY(), 2));
    double lengthYZ = Math.sqrt(Math.pow(y.getX()-z.getX(), 2) + Math.pow(y.getY()-z.getY(), 2));
    System.out.println(lengthXY);
    System.out.println(lengthXZ);
    System.out.println(lengthYZ);
    if ((closeEnough(lengthXY, lengthXY) == true) && (closeEnough(lengthXY, lengthYZ) == true)){
      return "Equilateral";
    }
    if ((closeEnough(lengthXY, lengthXZ) == false) && (closeEnough(lengthXY, lengthYZ) == false) && (closeEnough(lengthXZ, lengthYZ) == false)){
      return "Scalene";
    }
    if ((closeEnough(lengthXY, lengthXZ) == true) || (closeEnough(lengthXY, lengthYZ) == true) || (closeEnough(lengthXZ, lengthYZ) == true)){
      return "Isosceles";
    }
    return "error";
  }

  public double area(){
    double sideA = Math.sqrt(Math.pow(x.getX()-y.getX(), 2) + Math.pow(x.getY()-y.getY(), 2));
    double sideB = Math.sqrt(Math.pow(x.getX()-z.getX(), 2) + Math.pow(x.getY()-z.getY(), 2));
    double sideC = Math.sqrt(Math.pow(y.getX()-z.getX(), 2) + Math.pow(y.getY()-z.getY(), 2));
    double semiPer = (sideA + sideB + sideC)/2;
    return (Math.sqrt(semiPer * (semiPer - sideA) * (semiPer - sideB) * (semiPer - sideC)));
  }
}
