import java.lang.Math;

public class stringToInt{
  public static int stringToInt(String s){
    int start = 0;
    int answer = 0;
    int power = 0;
    if (s.charAt(0) == '-')start = 1;
    for (int i=s.length()-1; i >= start; i--){
      if (s.charAt(i) >= 48 && s.charAt(i) <= 57){
        answer += (s.charAt(i) - 48) * Math.pow(10, power);
        power++;
      }
    }
    if (start == 1)return answer * -1;
    return answer;
  }

  public static void main(String[] args){
    System.out.println(stringToInt("83724"));
    System.out.println(stringToInt("-8798234"));
    int test = stringToInt("59") + stringToInt("11");
    System.out.println(test);
  }
}
