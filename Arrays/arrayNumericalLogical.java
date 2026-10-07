third largest 
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
_____________________________________________________________________
 twosum LeetC
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
_____________________________________________________________________
//Cheching array is sorted or not...

import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      int array1 []={1,3,5,5,8,9,10};
      boolean isNonDecreasing = true; 

      for(int i = 0; i<array1.length - 1; i++)
      {
        
          if(array1[i] > array1[i+1] )
          {
            isNonDecreasing = false;

          }
        
      }
            IO.println(isNonDecreasing);
      IO.println(Arrays.toString(array1));

     

    
    }
}
_____________________________________________________________________
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
______________________________________________________________________
//sort all zwroes in too last with out disturbing order
//Unnessaryly allowing loop to rotate even though condition is false @ if(array1[i] == 0)
import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      int array1 []={1,3,0,5,5,8,9,0,10,5,9};

      int temp = array1[0];
      for(int i = 0; i<array1.length; i++)
      {
       for(int j = i+1; j<array1.length; j++) 
       {
          if(array1[i] == 0 && array1[j] != 0)  //good..!!! But not Great
          {
            temp = array1[i];
            array1[i] = array1[j];
            array1[j] = temp;
          }
        }
      }      
      IO.println(Arrays.toString(array1));
    }
}

//-------------
import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      int array1 []={1,3,0,5,5,8,9,0,10,5,9};

      int temp = array1[0];
      //int temp = 0;
      for(int i = 0; i<array1.length; i++)
      {
        if(array1[i] == 0 )
            for(int j = i+1; j<array1.length; j++)
            {
                if(array1[j] != 0)
                {
                  temp = array1[i];
                  array1[i] = array1[j];
                  array1[j] = temp;
                }
              }
      }      
      IO.println(Arrays.toString(array1));
    }
}
_______________________________________________________________________

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
