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
    System.out.println(ArrayListPractice.replaceEmpty(example1).toString());

    ArrayList<String> example2 = new ArrayList<String>(100);
    example2.add("one");
    example2.add("two");
    example2.add("three");
    example2.add("four");
    example2.add("five");
    example2.add("six");
    example2.add("seven");
    example2.add("eight");
    System.out.println(example2.toString());
    System.out.println(ArrayListPractice.makeReversedList(example2).toString());

    ArrayList<String> example3 = new ArrayList<String>(100);
    example3.add("1");
    example3.add("3");
    example3.add("5");
    example3.add("7");
    example3.add("9");
    example3.add("11");
    example3.add("13");
    example3.add("15");

    ArrayList<String> example4 = new ArrayList<String>(100);
    example4.add("2");
    example4.add("4");
    example4.add("6");
    example4.add("8");
    example4.add("10");
    example4.add("12");
    example4.add("14");
    example4.add("16");
    example4.add("17");
    example4.add("18");
    System.out.println(ArrayListPractice.mixLists(example3, example4).toString());
    System.out.println(ArrayListPractice.mixLists(example4, example3).toString());
  }
}
