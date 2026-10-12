//left rotate array

import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      int array1 []={1,3,5,5,8,9,10,5,9};

      int temp = array1[0];
      for(int i = 0; i<array1.length - 1; i++)
      {
        array1[i] = array1[i+1];
      }
      array1[array1.length-1] = temp; 
            //IO.println(isNonDecreasing);
      IO.println(Arrays.toString(array1));
    }
}
