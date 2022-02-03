public class makeWords{
  public static void makeWords(int size, String ans){
    for (int i  = 0; i < size; i++){
      for (char c = 'a'; c <= 'z'; c++){
        System.out.print(c);
        makeWords(size-1, ans+c);
      }
    }
  }

  public static void main(String args[]){
    makeWords(2, "");
  }
}
