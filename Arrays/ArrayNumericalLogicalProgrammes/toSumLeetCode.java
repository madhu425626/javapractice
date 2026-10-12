import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      int array1 []={2,7,6,11,15,3 };
      int target = 9;

      for(int i = 0; i<array1.length; i++)
      {
        for(int j = i+1; j<array1.length; j++ )
        {
          if(array1[i] + array1[j] == target)
          {
            //sorted in ascendiing
            IO.println("Index of i :"+i+"\nIndex of j :"+j);

          }
        }
      }
      IO.println(Arrays.toString(array1));

     

    
    }
}
