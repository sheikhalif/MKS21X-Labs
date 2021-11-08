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

  public String remove(int index){
    if (index < 0 || index >= size){
      System.out.println("error: string index in remove");
      return null;
    }
    String answer = data[index];
    String[] remStringArr = new String[data.length];
    for (int i = 0; i < index; i++){
      remStringArr[i] = data[i];
    }
    for (int x = index+1; x < data.length; x++){
      remStringArr[x-1] = data[x];
    }
    size--;
    data = remStringArr;
    return answer;
  }

  public int indexOf(String s){
    for (int i = 0; i<size; i++){
      if (data[i].equals(s))return i;
    }
    return -1;
  }

  public int lastIndexOf(String s){
    for (int i = size-1; i>=0; i--){
      if (data[i].equals(s))return i;
    }
    return -1;
  }

  public void add(int index, String value){
    if (index < 0 || index > size){
      System.out.println("index error in add");
    }
    String[] addStringArr = new String[data.length + 1];
    for (int i = 0; i < index; i++){
      addStringArr[i] = data[i];
    }
    addStringArr[index] = value;
    for int (i=index+1; i < addStringArr.length - index; i++){
      addStringArr[i] = data[i-1];
    }
    addStringArr = data;
  }
}
