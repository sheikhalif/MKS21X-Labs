import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.Math;
public class Non {
  public static void main(String[] args) {
    String fileName = args[0];
    int total = 0;
    try {
      File file = new File(fileName);
      Scanner input = new Scanner(file);

    }
    catch (FileNotFoundException ex) {
      System.out.println("Not a valid file name");
    }
    System.out.println(total);
  }

  public static boolean part1a(String s){
    int vowels = 0;
    for (int i = 0; i<s.length(); i++){
      char letter = s.charAt(i);
      if (letter.equals('a') || letter.equals('e') || letter.equals('i') || letter.equals('o') || letter.equals('u')){
        vowels++;
      }
      if (vowels ==  3){
        return true;
      }
    }
    return false;
  }

  public static boolean part1b(String s){
    for (int i = 0; i<s.length()-1; i++){
      String section = s.substring(i, i+2);
    }
  }
}
