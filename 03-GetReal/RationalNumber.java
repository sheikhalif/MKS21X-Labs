public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
    numerator = nume;
    denominator = deno;
  }

  public double getValue(){
    return (double) numerator / (double) denominator;
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    return new RationalNumber(denominator, numerator);
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    return ((double) numerator / (double) denominator) == other.getValue();
  }


  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    return numerator + "/" + denominator;
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
    if (a < b){
      for (int i = a; i>0; i--){
        if (a % i == 0 && b  % i == 0){
          return i;
        }
      }
    }
    else{
      for (int i = b; i>0; i--){
        if (a % i == 0 && b  % i == 0){
          return i;
        }
      }
    }
    return 1;
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  public void reduce(){
    int comDiv = gcd(numerator, denominator);
    numerator = numerator / comDiv;
    denominator = denominator / comDiv;
  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    RationalNumber answer = new RationalNumber(numerator*other.getNumerator(), denominator*other.getDenominator());
    answer.reduce();
    return answer;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    RationalNumber answer = new RationalNumber(numerator*other.getDenominator(), denominator*other.getNumerator());
    answer.reduce();
    return answer;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    RationalNumber answer = new RationalNumber(numerator*other.getDenominator() + denominator*other.getNumerator(), denominator*other.getDenominator());
    answer.reduce();
    return answer;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    RationalNumber answer = new RationalNumber(numerator*other.getDenominator() - denominator*other.getNumerator(), denominator*other.getDenominator());
    answer.reduce();
    return answer;
  }
}
