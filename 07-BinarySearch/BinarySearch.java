public class BinarySearch{
  public static int binarySearch(int[] data, int target){
    int min = 0;
    int max = data.length -1;
    while (min <= max){
      int midVal = min + (max - min)/2;
      if (data[midVal] == target){
        return midVal;
      }
      else if (data[midVal] > target){
        max = midVal - 1;
      }
      else{
        min = midVal + 1;
      }
    }
    return -1;
  }

  //testing stuff
  /**
  public static void main(String args[]){
    int result;
    result = binarySearch(new int[]{0,0,0,0,0,0,0},0);
    System.out.println(result);//should be 3

    result = binarySearch(new int[]{0,0,0,0,0,0,0},1);
    System.out.println(result);//should be -1

    result = binarySearch(new int[]{0,1,2,3,4,5,6},0);
    System.out.println(result);//should be 0

    result = binarySearch(new int[]{0,1,2,3,4,5,6},6);
    System.out.println(result);//should be 6

    result = binarySearch(new int[]{}, 0);
    System.out.println(result);

    result = binarySearch(new int[]{3}, 3);
    System.out.println(result);

    result = binarySearch(new int[]{3}, 1);
    System.out.println(result);

    result = binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16}, 8);
    System.out.println(result);
  }
  **/
}
