import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Triangle {
  public static void main(String[] args) {
    String mode = "error";
    int total = 0;
    try {
      File file = new File("Triangle.txt");
      Scanner input = new Scanner(file);
      if (mode.equals("normal")){
        while (input.hasNextInt()) {
          total += validTri(input.nextInt(), input.nextInt(), input.nextInt());
        }
      }
      if (mode.equals("error")){
        while (input.hasNextInt()){
          int a1 = input.nextInt();
          int a2 = input.nextInt();
          int a3 = input.nextInt();
          int b1 = input.nextInt();
          int b2 = input.nextInt();
          int b3 = input.nextInt();
          int c1 = input.nextInt();
          int c2 = input.nextInt();
          int c3 = input.nextInt();
          total += validTri(a1, b1, c1);
          total += validTri(a2, b2, c2);
          total += validTri(a3, b3, c3);
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
