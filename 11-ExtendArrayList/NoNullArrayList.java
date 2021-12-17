public class NoNullArrayList<T> extends ArrayList<T> {
  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(int intCap){
    super(intCap);
  }

  public T add(T elem){
    if (elem != null){
      super.add(elem);
    }
    else{
      throw new IllegalArgumentException("null is not a valid input for this method");
    }
  }

  public T set(int index, T elem){
    if (elem != null){
      super.set(index, elem);
    }
    else{
      throw new IllegalArgumentException("null is not a valid input for this method");
    }
  }
}
