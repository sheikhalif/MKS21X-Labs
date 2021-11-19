import java.util.Scanner;
import java.util.ArrayList;

public class UserInput{
  int maxNum = 0;
  int sum = 0;
  int totalNums = 0;
  ArrayList<double> answer = new ArrayList<double>;
  boolean keepLooping = true;
  while(keepLooping){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a non negative number. A negative number will end the program:");
    double inputNum = input.nextLine();
    if (inputNum > 0){
      answer.add(inputNum);
      sums += inputNum;
      totalNums++;
      if (inputNum > maxNum){
        maxNum = inputNum;
      }
    }
    else{
      keepLooping = false;
    }
  }
  System.out.println("You entered: " + answer.toString());
  System.out.println()
}
