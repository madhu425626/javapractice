import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");

      int array[] = {5,6,-3,7,-13,8,-2,5,-6,7,-11,3,10,-10,-6,-10,7,2};

      IO.println(maxSumOfSubArray(array));
    }

    public static int maxSumOfSubArray(int [] array)
    {
      int sum = 0;
      int maxSum = 0;

      for(int i = 0; i<array.length; i++)
      {
        if(sum >= 0)
        {
          sum = sum + array[i];
        }
        else{
          sum = array[i];
        }

        if(sum > maxSum)
        {
          maxSum = sum;
        }
      }
      return maxSum;
    }
}
