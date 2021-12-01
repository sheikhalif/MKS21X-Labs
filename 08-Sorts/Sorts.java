import java.util.Arrays;
import java.util.Random;

public class Sorts{
  public static void main(String args[]){
    int[] example1 = new int[]{1, 3, 4, 2, 5, 1, 3, 6, 1};
    int[] example2 = new int[]{6, 1, 24, 43, 1, 5, 12, 51};
    int[] example3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
    bubbleSort(example1);
    bubbleSort(example2);
    bubbleSort(example3);
    System.out.println(Arrays.toString(example1));
    System.out.println(Arrays.toString(example2));
    System.out.println(Arrays.toString(example3));
  }
  public static void bubbleSort(int[] data){
    int switches;
    boolean keepGoing = true;
    while (keepGoing){
      switches = 0;
      for (int i = 0; i < data.length - 1; i++){
        if (data[i] > data[i+1]){
          int firstValue = data[i];
          int secondValue = data[i+1];
          data[i] = secondValue;
          data[i+1] = firstValue;
          switches++;
        }
      }
      if (switches == 0)keepGoing = false;
    }
  }
}
