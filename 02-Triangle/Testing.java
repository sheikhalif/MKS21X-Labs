public class Testing{
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
  }
}
