public class Tester{
  public static void main(String args[]){
    SuperArray example1 = new SuperArray();
    System.out.println(example1.size());
    System.out.println(example1.toString());
    System.out.println(example1.toStringDebug());
    example1.add("hello");
    System.out.println(example1.size());
    System.out.println(example1.toString());
    System.out.println(example1.toStringDebug());
    example1.add("world");
    System.out.println(example1.size());
    System.out.println(example1.toString());
    System.out.println(example1.toStringDebug());
  }
}
