import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Triangle {
  public static void main(String[] args) {
    int total = 0;
    try {
      File file = new File("Triangle.txt");
      Scanner input = new Scanner(file);
      while (input.hasNextLine()) {
        if (input.hasNextInt()){
          total += validTri(input.nextInt(), input.nextInt(), input.nextInt());
        }
      }
      input.close();//releases the file from your program
    }
    catch (FileNotFoundException ex) {
      System.out.println("Not a valid file name");
    }
    System.out.println(total);
  }

  public static int validTri(int a, int b, int c){
    if (a + b < c){
      return 0;
    }
    if (b + c < a){
      return 0;
    }
    if (a + c < b){
      return 0;
    }
    return 1;
  }
}
