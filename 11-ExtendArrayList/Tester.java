import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Tester{
  public static void main(String[] args){
    NoNullArrayList<Integer> list = new NoNullArrayList<Integer>();
    list.add(4);
    list.add(5);
    list.add(6);
    OrderedArrayList<Integer> list2 = new OrderedArrayList<Integer>();
    list2.add(5);
    System.out.println(list2.toString());
    list2.add(12);
    System.out.println(list2.toString());
    list2.add(9);
    System.out.println(list2.toString());
    list2.add(2);
    System.out.println(list2.toString());
    OrderedArrayList<Integer> list3 = new OrderedArrayList<Integer>();
    ArrayList<Integer> list3unordered = new ArrayList<Integer>();
    Random rand = new Random();
    for (int i = 0; i < 10000; i++){
      int randomInt = rand.nextInt();
      list3.add(randomInt);
      list3unordered.add(randomInt);
    }
    Collections.sort(list3unordered);
    System.out.println(list3.equals(list3unordered));
    OrderedArrayList<Integer> list4 = new OrderedArrayList<Integer>();
    list4.add(12);
    list4.add(92);
    list4.add(156);
    list4.add(1);
    list4.add(2);
    list4.add(65);
    System.out.println("list 4 is: "+ list4.toString());
    list4.set(2, 989);
    list4.set(0, 48975);
    System.out.println("list 4 is: "+ list4.toString());
    OrderedArrayList<String> list5 = new OrderedArrayList<String>();
    list5.add("C");
    list5.add("D");
    list5.add("A");
    list5.add("E");
    list5.add("B");
    System.out.println("list 5 is: "+ list5.toString());
    list5.set(0, "F");
    list5.set(1, "G");
    System.out.println("list 5 is: "+ list5.toString());
  }
}
