public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }
  public OrderedArrayList(int intCap){
    super(intCap);
  }
  @Override
  public boolean add(T elem){
    int place = whereToPlace(elem);
    if (place > this.size()-1)super.add(elem);
    else{
      super.add(whereToPlace(elem), elem);
    }
    return false;
  }

  @Override
  public T set(int index, T elem){
    if (index != 0 || super.size() != 0){
      super.remove(index);
    }
    int place = whereToPlace(elem);
    if (place == 0)super.add(elem);
    else{
      super.add(whereToPlace(elem), elem);
    }
    return elem;
  }

  private int whereToPlace(T value){
    if (value == null)return 0;
    int place = this.size();
    for (int i = place-1; i >=0; i--){
      if (this.get(i).compareTo(value)>=0){
        place = i;
      }
    }
    return place;
  }
}
