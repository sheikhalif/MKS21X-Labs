import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

public class Non {
  public static void main(String[] args) {
    String fileName = args[0];
    int mode = Integer.parseInt(args[1]);
    int total = 0;
    try {
      File file = new File(fileName);
      Scanner input = new Scanner(file);
      if (mode == 1){
        while (input.hasNextLine()){
          String line = input.nextLine();
          if (part1a(line) && part1b(line) && part1c(line)){
            total++;
          }
        }
      }
      if (mode == 2){
        while (input.hasNextLine()){
          String line = input.nextLine();
          if (part2a(line) && part2b(line)){
            total++;
          }
        }
      }

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
      if (letter == 'a' || letter == 'e' || letter =='i' || letter == 'o' || letter =='u'){
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
      String section = s.substring(i);
      if (i != s.length()-2){
        section = s.substring(i, i+2);
      }
      if (section.charAt(0) == section.charAt(1)){
        return true;
      }
    }
    return false;
  }

  public static boolean part1c(String s){
    for (int i = 0; i<s.length()-1; i++){
      String section = s.substring(i);
      if (i != s.length()-2){
        section = s.substring(i, i+2);
      }
      if (section.equals("ab") || section.equals("cd") || section.equals("pq") || section.equals("xy")){
        return false;
      }
    }
    return true;
  }

  public static boolean part2a(String s){
    ArrayList<String> doubles = new ArrayList<String>();
    for (int i = 0; i<s.length()-1; i++){
      String section = s.substring(i);
      if (i != s.length()-2){
        section = s.substring(i, i+2);
      }
      if (doubles.contains(section) && !(doubles.get(doubles.size() - 1).equals(section))){
        return true;
      }
      else{
        doubles.add(section);
      }
    }
    return false;
  }

  public static boolean part2b(String s){
    for (int i = 0; i<s.length()-2; i++){
      String section = s.substring(i);
      if (i != s.length()-3){
        section = s.substring(i, i+3);
      }
      if (section.charAt(0) == section.charAt(2)){
        return true;
      }
    }
    return false;
  }
}
