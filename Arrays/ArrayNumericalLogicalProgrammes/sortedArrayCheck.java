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

          //--------------------------------updated
          import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      int arr[] = {2,7,11,15};
      boolean flag = true;
     
      for(int i = 1; i<arr.length; i++)
      {
          if(arr[i-1] > arr[i] )
          {
            flag = false;
          }        
      }
       if(flag)
       {
        IO.println("Array is sorted");
       }
       else{

        IO.println("Array is not sorted");
       }
       

    }
}
        
      }
            IO.println(isNonDecreasing);
      IO.println(Arrays.toString(array1));

     

    
    }
}
