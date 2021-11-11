public class SuperArray{
  private String[] data;
  private int size;

  private void resize(){
    String[] newStringArr = new String[data.length*2 + 1];
    for (int i = 0; i < data.length; i++){
      newStringArr[i] = data[i];
    }
    data = newStringArr;
  }

  public SuperArray(){
    data = new String[10];
    size = 0;
  }

  public int size(){
    return size;
  }

  public boolean add(String s){
    if (size == data.length)this.resize();
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
      throw new IndexOutOfBoundsException("Index input error in get");
    }
    return data[index];
  }

  public String set(int index, String element){
    if (index < 0 || index >= size){
      throw new IndexOutOfBoundsException("Index input error in set");
    }
    String originalValue = data[index];
    data[index] =  element;
    return originalValue;
  }

  public SuperArray(int initialCapacity){
    if (initialCapacity < 0){
      throw new IllegalArgumentException("SuperArray initialCapacity cannot be initialized to a negative number");
    }
    data = new String[initialCapacity];
    size = 0;
  }

  public SuperArray testResize(){
    this.resize();
    return this;
  }

  public String remove(int index){
    if (index < 0 || index >= size){
      throw new IndexOutOfBoundsException("Index input error in remove");
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
    if (index < -1 || index > size){
      throw new IndexOutOfBoundsException("Index input error in add(int, string)");
    }
    String[] addStringArr = new String[data.length + 1];
    size++;
    for (int i = 0; i < index; i++){
      addStringArr[i] = data[i];
    }
    addStringArr[index] = value;
    for (int  i=index+1; i < size; i++){
      addStringArr[i] = data[i-1];
    }
    data = addStringArr;
  }

  public boolean remove(String s){
    if (this.indexOf(s) == -1){
      return false;
    }
    this.remove(this.indexOf(s));
    return true;
  }

}
