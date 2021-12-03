import java.util.Arrays;
import java.util.Random;
import java.util.Collections;

public class selectionSort{
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
    selectionSort(example1);
    selectionSort(example2);
    selectionSort(example3);
    selectionSort(example4);
    selectionSort(example5);
    selectionSort(example6);
    selectionSort(example7);
    selectionSort(example8);
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
  public static void selectionSort(int[] ary){
    for (int i = ary.length - 1; i >= 0; i--){
      int max = 0;
      for (int a = 0; a < i; a++){
        if (a == 0)max=ary[a];
        else if (ary[a] >= max){
          max = ary[a];
        }
      }
      System.out.println("the max is: "+max);
      for (int x = 0; x < i; x++){
        if (ary[x] >= max){
          System.out.println(ary[x] + " is greater than or equal to " + max);
          max = ary[x];
          int replace = ary[i];
          ary[i] = ary[x];
          ary[x] = replace;
          System.out.println(replace + "was replaced with " + max);
          System.out.println("the new array is" + Arrays.toString(ary));
        }
      }
    }
  }
}
