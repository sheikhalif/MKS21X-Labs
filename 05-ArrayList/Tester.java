import java.util.ArrayList;

public class Tester{
  public static void main(String args[]){
    ArrayList<String> example1 = new ArrayList<String>(100);
    example1.add("one");
    example1.add("one");
    example1.add("");
    example1.add("one");
    example1.add("");
    example1.add("one");
    example1.add("");
    example1.add("one");
    System.out.println(example1.toString());
    System.out.println(replaceEmpty(example1).toString());
  }
}
