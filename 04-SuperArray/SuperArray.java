public class SuperArray{
  private String[] data;
  private int size;
  public String[] SuperArray(){
    data = new String[10];
    size = 10;
  }

  public int size(){
    return data.length;
  }

  public void add(String s){
    data[size] = s;
    s++;
  }

  public String toString(){
    String answer = "[\"";
    for (int i = 0; i < size; i++){
      answer += data[i] + "\""
      if (i != size-1){
        answer += ", \""
      }
    }
    return answer + "\"]"
  }

  public String toString(){
    String answer = "[\"";
    for (int i = 0; i < size; i++){
      answer += data[i] + "\""
      if (i != size-1){
        answer += ", \""
      }
    }
    for (int x = size; x < data.length; x++){
      answer += data[x];
      if (x != data.length-1){
        answer += ", ";
      }
    }
    return answer + "]"
  }
}
