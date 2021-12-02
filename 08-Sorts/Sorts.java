import java.util.Arrays;
import java.util.Random;

public class Sorts{
  public static void main(String args[]){
    int[] example1 = new int[]{1, 3, 4, 2, 5, 1, 3, 6, 1};
    int[] example2 = new int[]{};
    int[] example3 = new int[]{1};
    int[] example4 = new int[]{5, 5, 5, 5, 5, 5, 5, 5, 5};
    int[] example5 = new int[30];
    for (int i = 0; i < 30; i++){
      Random randomInt = new Random();
      example5[i] = randomInt.nextInt(100);
    }
    int[] example6 = new int[30];
    for (int i = 0; i < 30; i++){
      Random randomInt = new Random();
      example5[i] = randomInt.nextInt(6);
    }
    int[] example7 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    int[] example8 = new int[]{15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    int[] example1a = example1.clone();
    int[] example2a = example2.clone();
    int[] example3a = example3.clone();
    int[] example4a = example4.clone();
    int[] example5a = example5.clone();
    int[] example6a = example6.clone();
    int[] example7a = example7.clone();
    int[] example8a = example8.clone();
    bubbleSort(example1);
    bubbleSort(example2);
    bubbleSort(example3);
    bubbleSort(example4);
    bubbleSort(example5);
    bubbleSort(example6);
    bubbleSort(example7);
    bubbleSort(example8);
    Arrays.sort(example1a);
    Arrays.sort(example2a);
    Arrays.sort(example3a);
    Arrays.sort(example4a);
    Arrays.sort(example5a);
    Arrays.sort(example6a);
    Arrays.sort(example7a);
    Arrays.sort(example8a);
    System.out.println(Arrays.equals(example1, example1a));
    System.out.println(Arrays.equals(example2, example2a));
    System.out.println(Arrays.equals(example3, example3a));
    System.out.println(Arrays.equals(example4, example4a));
    System.out.println(Arrays.equals(example5, example5a));
    System.out.println(Arrays.equals(example6, example6a));
    System.out.println(Arrays.equals(example7, example7a));
    System.out.println(Arrays.equals(example8, example8a));
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
