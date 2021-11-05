public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size = 0;
  }

  public int size(){
    return size;
  }

  public void add(String s){
    data[size] = s;
    size++;
  }

  public String toString(){
    String answer = "[";
    for (int i = 0; i < size; i++){
      answer += data[i];
      if (i != size-1){
        answer += ", ";
      }
    }
    return answer + "]";
  }

  public String toStringDebug(){
    String answer = "[";
    for (int i = 0; i < size; i++){
      answer += data[i];
      if (i != size-1){
        answer += ", ";
      }
    }
    for (int x = size; x < data.length; x++){
      if (x != 0)answer += ", ";
      answer += data[x];
    }
    return answer + "]";
  }
}
