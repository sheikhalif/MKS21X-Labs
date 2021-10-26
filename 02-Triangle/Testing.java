public class Testing{
  public static boolean closeEnough(double a, double b){
    if (a == 0 || b == 0){
      return (a == b);
    }
    double subValue = (b-a);
    if (subValue < 0)subValue = -1 * (b-a);
    return (subValue/a < 0.00001 && subValue/b < 0.00001);
  }
  public static void main(String[]args){
    Point P1 = new Point(1,1);
    Point P2 = new Point(2,2);
    Point P3 = new Point(0, 0);
    Point P4 = new Point(3, 4);
    Triangle T1 = new Triangle(P1, P2, P3);
    Triangle T2 = new Triangle(P2, P3, P4);
    Triangle T3 = new Triangle(1, 1, 2, 2, 0, 0);
    Triangle T4 = new Triangle(2, 2, 0, 0, 3, 4);
    System.out.println(P1.toString());
    System.out.println(P2.toString());
    System.out.println(P3.toString());
    System.out.println(P4.toString());
    System.out.println(T1.getPerimeter());
    System.out.println(T2.getPerimeter());
    System.out.println(T3.getPerimeter());
    System.out.println(T4.getPerimeter());
    System.out.println(T1.getVertex(1)); //should return (1, 1)
    System.out.println(T1.getVertex(2)); //should return (2, 2)
    System.out.println(T1.getVertex(3)); //should return (0, 0)
    T3.setVertex(3, P4);
    System.out.println("\n");
    System.out.println(T3.getVertex(1));
    System.out.println(T3.getVertex(2));
    System.out.println(T3.getVertex(3)); //should return (3, 4);
    System.out.println(T1.toString());
    System.out.println(T2.toString());
    System.out.println(T3.toString());
    System.out.println(closeEnough(100.0, 99.99999));
    System.out.println(closeEnough(200.0, 99.99999));
    System.out.println(closeEnough(0.00001, 0.00000999999));
    Triangle T5 = new Triangle (31.0, 31.0, 45.6, 32.6, 22.0, 25.7);
    Triangle T6 = new Triangle(30.9999999999999, 30.9999999999, 45.599999999999, 32.599999999999, 21.9999999999999, 25.6999999999999999);
    System.out.println(T5.equals(T6));
    System.out.println(T1.equals(T2));
    Triangle T7 = new Triangle(-3, 0, 3, 0, 0, 5.1961524);
    Triangle T8 = new Triangle (4, 6, 2, 5, 5, 11);
    Triangle T9 = new Triangle(-1, 0, 1, 0, 0, 5);
    System.out.println(T7.classify());
    System.out.println(T8.classify());
    System.out.println(T9.classify());
    System.out.println(T7.area());
    System.out.println(T8.area());
    System.out.println(T9.area());
  }
}
