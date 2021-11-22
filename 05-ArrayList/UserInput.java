import java.util.Scanner;
import java.util.ArrayList;

public class UserInput{
    public static void main(String args[]){
        double maxNum = 0;
        double minNum = 0;
        double sum = 0;
        int totalNums = 0;
        ArrayList<Double> answer = new ArrayList<Double>();
          boolean keepLooping = true;
          while(keepLooping){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a non negative number. A negative number will end the program:");
            double inputNum = Double.parseDouble(input.nextLine());
            if (inputNum > 0){
              answer.add(inputNum);
              sum += inputNum;
              totalNums++;
              if (inputNum > maxNum){
                maxNum = inputNum;
              }
              if (totalNums ==1)minNum=inputNum;
              else{
                  if (inputNum < minNum)minNum = inputNum;
              }
            }
            else{
                input.close();
              keepLooping = false;
            }
          }
          System.out.println("You entered: " + answer.toString());
          System.out.println("Mean: " + (sum/totalNums));
          System.out.println("Min value: " + minNum);
          System.out.println("Max value: " + maxNum);
    }
  
}
