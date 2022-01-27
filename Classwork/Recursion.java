public class Recursion{
  public static int fact(int n){
    if (n > 0){
      return n*fact(n-1);
    }
    else{
      return 1;
    }
  }

  public static boolean isEven(int x){
    if (x < 0){
      return isEven(-x);
    }
    if (x != 1 && x != 0){
      return isEven(x-2);
    }
    if (x == 1){
      return false;
    }
    else{
      return true;
    }
  }

  public static void main(String args[]){
    System.out.println(fact(0));
    System.out.println(fact(5));
    System.out.println(fact(10));
    System.out.println(isEven(12));
    System.out.println(isEven(176));
    System.out.println(isEven(122));
    System.out.println(isEven(125));
    System.out.println(isEven(92));
  }
}
