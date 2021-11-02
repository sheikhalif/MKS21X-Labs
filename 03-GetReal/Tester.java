public class Tester{
  public static void main(String args[]){
    RationalNumber example1 = new RationalNumber(4, 7);
    RealNumber example2 = new RealNumber(6.8);
    RationalNumber example3 = new RationalNumber(68, 10);
    RationalNumber example6 = new RationalNumber(680, 100);
    RealNumber example5 = new RealNumber(6.8);
    RationalNumber example4 = new RationalNumber(351, 621);
    RationalNumber example7 = new RationalNumber(2, 4);
    System.out.println(example2.add(example1));
    System.out.println(example2.subtract(example1));
    System.out.println(example2.multiply(example1));
    System.out.println(example2.divide(example1));
    System.out.println(example1.getValue());
    System.out.println(example1.toString());
    System.out.println(example1.getNumerator());
    System.out.println(example1.getDenominator());
    System.out.println(example1.reciprocal().toString());
    System.out.println(example1.equals(example2));
    System.out.println(example3.equals(example6));
    example4.reduce();
    System.out.println(example4.toString());
    example7.reduce();
    System.out.println(example7.toString());
    System.out.println(example7.multiply(example1).toString());
    System.out.println(example7.divide(example1).toString());
    System.out.println(example7.add(example1).toString());
    System.out.println(example7.subtract(example1).toString());
  }
}
