
//count of consecutive 1's.

import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      int array1 []={1,1,1,0,1,1,1,1,0,1,1,1,1,1,0,1,1,1,1,1,1,0};

      
      int count = 0;
      int maxCount = 0;
      for(int i = 0; i<array1.length; i++)
      {
        if(array1[i] == 1 )
          {
            count++;             
            if(count > maxCount)
            {
              maxCount = count;
            }
          }
          else{
            count = 0;
          }
      }   
      IO.println(maxCount);   
      IO.println(Arrays.toString(array1));
    }
}

//----------2nd logic --------
    import java.util.*;

public class Main {
    public static void main(String[] args) {
      int a [] = {1,0,1,0,1,0,1,1,1,1,1,1,0,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,0};
      int sum = 0;
      int maxSum = 0;
      int i = 0;
      while(i<a.length)
      {
        if(a[i] != 0)
        {
        sum += a[i];

        }
        else{

        maxSum = sum;
          sum = 0;
        }
        i++;
      }     
      IO.println(maxSum);
    }
}
