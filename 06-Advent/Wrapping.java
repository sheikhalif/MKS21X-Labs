import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.Math;
public class Wrapping {
  public static void main(String[] args) {
    String fileName = args[0];
    int total = 0;
    try {
      File file = new File(fileName);
      Scanner input = new Scanner(file);
      total += sqFeet(input.nextLine());
    }
    catch (FileNotFoundException ex) {
      System.out.println("Not a valid file name");
    }
    System.out.println(total);
  }

  public static int sqFeet(String s){
    String[] dimStrings = s.split("x");
    int side1 = Integer.parseInt(dimStrings[0]) * Integer.parseInt(dimStrings[1]);
    int side2 = Integer.parseInt(dimStrings[1]) * Integer.parseInt(dimStrings[2]);
    int side3 = Integer.parseInt(dimStrings[0]) * Integer.parseInt(dimStrings[2]);
    int slack = Math.min(Math.min(side1, side2), side3);
    int wrapNeeded = 2 * side1 + 2 * side2 + 2 * side3 + slack;
    //System.out.println("Side 1 is: " + side1 +  "\nSide 2 is: " + side2 + " \nSide 3 is: " + side3 + "\nSlack is: " + slack + "\n We return: " + wrapNeeded);
    return wrapNeeded;
  }
}
