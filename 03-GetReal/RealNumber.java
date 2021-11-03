public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  /*
  *Return the sum of this and the other
  */
  public double add(RealNumber other){
    return value + other.getValue();
  }

  /*
  *Return the product of this and the other
  */
  public double multiply(RealNumber other){
    return value * other.getValue();
  }

  /*
  *Return the this divided by the other
  */
  public double divide(RealNumber other){
    return value / other.getValue();
  }

  /*
  *Return the this minus the other
  */
  public double subtract(RealNumber other){
    return value - other.getValue();
  }


  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+value;
  }

  public int compareTo(RealNumber other){
    System.out.println(value);
    System.out.println(other.getValue());
    if (value > other.getValue())return 1;
    if (value < other.getValue())return -1;
    if (value == other.getValue())return 0;
    return -2;
  }

  public boolean equals(RealNumber other){
    return (value == other.getValue());
  }
}
