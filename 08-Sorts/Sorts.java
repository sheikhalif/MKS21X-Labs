import java.util.Arrays;
import java.util.Random;

public class Sorts{
  public static void main(String args[]){
    String mode = args[0];
    int[] example1 = new int[]{1, 3, 4, 2, 5, 1, 3, 6, 1};
    int[] example2 = new int[]{};
    int[] example3 = new int[]{1};
    int[] example4 = new int[]{5, 5, 5, 5, 5, 5, 5, 5, 5};
    int[] example5 = new int[30];
    for (int i = 0; i < 30; i++){
      Random randomInt = new Random();
      example5[i] = randomInt.nextInt(10);
    }
    int[] example6 = new int[30];
    Random rand = new Random();
    for (int i = 0; i < example6.length; i++) {
        example6[i] = rand.nextInt();
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
    if (mode.equals("bubble")){
      bubbleSort(example1);
      bubbleSort(example2);
      bubbleSort(example3);
      bubbleSort(example4);
      bubbleSort(example5);
      bubbleSort(example6);
      bubbleSort(example7);
      bubbleSort(example8);
    }
    if (mode.equals("selection")){
      selectionSort(example1);
      selectionSort(example2);
      selectionSort(example3);
      selectionSort(example4);
      selectionSort(example5);
      selectionSort(example6);
      selectionSort(example7);
      selectionSort(example8);
    }
    if (mode.equals("insertion")){
      insertionSort(example1);
      insertionSort(example2);
      insertionSort(example3);
      insertionSort(example4);
      insertionSort(example5);
      insertionSort(example6);
      insertionSort(example7);
      insertionSort(example8);
    }

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

  public static void selectionSort(int[] data){
    for (int i = 0; i < data.length; i++){
      int min = minNum(data, i);
      for (int x = i; x < data.length; x++){
        if (data[x] == min){
          int oldVal = data[i];
          int newVal = data[x];
          data[i] = newVal;
          data[x] = oldVal;
        }
      }
    }
  }

  public static int minNum(int[] data, int index){
    int min = data[index];
    for (int i = index; i < data.length; i++){
      if (data[i] < min){
        min = data[i];
      }
    }
    return min;
  }

  public static void insertionSort(int[] data){
    int replaceIndex = 0;
    for (int i = 1; i < data.length; i++){
      if (data[i] < data[i-1]){
        int temp = data[i];
        for (int x = 0; x < i; x++){
          if (data[x] > data[i]){
            replaceIndex = x;
            for (int y = i-1; y >= x; y--){
              data[y+1] = data[y];
            }
          }
        }
        data[replaceIndex] = temp;
      }
    }
  }
}
