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

  public boolean add(String s){
    data[size] = s;
    size++;
    return true;
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

  public String get(int index){
    if (index < 0 || index >= size){
      System.out.println("error: string index in get");
      return null;
    }
    return data[index];
  }

  public String set(int index, String element){
    if (index < 0 || index >= size){
      System.out.println("error: string index in set");
      return null;
    }
    String originalValue = data[index];
    data[index] =  element;
    return originalValue;
  }

  public SuperArray(int initialCapacity){
    data = new String[initialCapacity];
    size = 0;
  }

  private void resize(){
    String[] newStringArr = new String[data.length*2 + 1];
    for (int i = 0; i < data.length; i++){
      newStringArr[i] = data[i];
    }
    data = newStringArr;
  }

  public SuperArray testResize(){
    this.resize();
    return this;
  }
}
