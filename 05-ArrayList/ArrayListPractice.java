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


  public static ArrayList<String> makeReversedList( ArrayList<String> data){
    ArrayList<String> answer = new ArrayList<String>(data.size());
    for (int i = data.size()-1; i > -1; i--){
      answer.add(data.get(i));
    }
    return answer;
  }

  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
    ArrayList<String> answer = new ArrayList<String>(a.size() + b.size());
    int minSize = 0;
    ArrayList<String> remaining = a;
    if (a.size() > b.size()){
      minSize = b.size();
      remaining = a;
    }
    else{
      minSize = a.size();
      remaining = b;
    }
    for (int i = 0; i < minSize; i++){
      answer.add(a.get(i));
      answer.add(b.get(i));
    }
    for (int i = minSize; i < remaining.size(); i++){
      answer.add(remaining.get(i));
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
    System.out.println(makeReversedList(example2).toString());

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
    System.out.println(mixLists(example3, example4).toString());
    System.out.println(mixLists(example4, example3).toString());
  }
}
