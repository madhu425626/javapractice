//third largest 
import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      int array1 []={99,22,88,33,77,44,99,77,22,88,33,77,44,99 };

      for(int i = 0; i<array1.length; i++)
      {
        for(int j = i+1; j<array1.length; j++ )
        {
          if(array1[i] > array1[j])
          {
            //sorted in ascendiing
            int temp = array1[i];
            array1[i] = array1[j];
            array1[j] = temp;

          }
        }
      }
      IO.println(Arrays.toString(array1));

      int fourthLargest = 0;
      int thirdLargest = 0;
      int secondLargest = 0;
      int largest = array1[array1.length-1];
      for(int i = array1.length-2; i>=0; i--)
      {
        if(array1[i] != largest)
        {
          secondLargest = array1[i];
          if(array1[i] != array1[i-1]) //
          {
            thirdLargest = array1[i-1];

            // if(thirdLargest != array1[i-2])
            // {
            //   fourthLargest = array1[i-2];
            //   break;
            // }
            break;

          }
         
            
        }
          
      }

      //for(int i )

      IO.println("Second Largest element is:" +secondLargest);
      IO.println("Third Largest element is:" +thirdLargest);
      IO.println("Fourtn Largest element is:" +fourthLargest);
    }
}
____________________
