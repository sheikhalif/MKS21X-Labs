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
}
