public class fib{
  public static int fibonacci(int n) {
    if (n > 1){
      return fibonacci(n-1) + fibonacci(n-2);
    }
    if (n == 1){
      return 1;
    }
    else{
      return 0;
    }
  }
  public static void main(String args[]){
    System.out.println(fibonacci(46));
  }
}
