import java.util.ArrayList;

public class ArrayListPractice{
  public static ArrayList<String> replaceEmpty( ArrayList<String> data){
    ArrayList<String> answer = new ArrayList<String>(data.size());
    for (int i = 0; i < data.size(); i++){
      if (data.get(i).equals("")){
        answer.add("Empty");
      }
      else{
        answer.add(data.get(i));
      }
    }
    return answer;
  }
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

  //public static ArrayList<String> makeReversedList( ArrayList<String> data){
  //return a new ArrayList that is in the reversed order of the parameter.
  //}

  //public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
  //return a new ArrayList that has all values of a and b in alternating order that is:
  //a[0], b[0], a[1], b[1]...
  //when one list is longer than the other, just append the remaining values to the end.
  //}
}
