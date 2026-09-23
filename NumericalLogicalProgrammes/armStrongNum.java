import java.util.*;
//ArmStrong Revision
public class Main {
    public static void main(String[] args) {
      int num = 153;
      int  length = String.valueOf(num).length();
      int sum = 0;
      while(num!=0)
      {
        int digit = num%10;
        sum +=  Math.pow(digit,length);
        num /= 10;
      }

      IO.println(sum);
    
    }
}
