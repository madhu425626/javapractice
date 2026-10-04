import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        int size = Integer.parseInt(IO.readln().trim());
        int arr[] = new int[size];

        for(int i = 0; i<size; i++)
        {
            arr[i] = Integer.parseInt(IO.readln().trim());
        }

        int sum = 0;
        for(int x: arr)
        {
            sum += x;
        }

        IO.println("Sum of all elements stored in the array is : "+sum);
    }
}
__________________________________________________________________________________-

import java.util.*;

public class Main {
   public static void main(String[] args) {
        // Write your code here
        int size = Integer.parseInt(IO.readln().trim());
        int arr[] = new int[size];

        for(int i = 0; i<size; i++)
        {
            arr[i] = Integer.parseInt(IO.readln().trim());
        }

        IO.println("Maximum element is : "+maxOfArray(arr));
        IO.println("Minimum element is : "+minOfArray(arr));
        //int sum = 0;

        //IO.println("Sum of all elements stored in the array is : "+sum);
    }

    public static int minOfArray(int arr[]){
        
        int min = arr[0];
        for(int x: arr)
        {
            if(x < min)
            {
                min = x;
            }
        }
        return min;
    }
    public static int maxOfArray(int arr[]){
        
        int max = arr[0];
        for(int x: arr)
        {
            if(x > max)
            {
                max = x;
            }
        }
        return max;
    }
}
__________________________________________________________________________________

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
       int size = Integer.parseInt(IO.readln().trim());
        int arr[] = new int[size];

        for(int i = 0; i<size; i++)
        {
            arr[i] = Integer.parseInt(IO.readln().trim());
        } 

        IO.println("The values store into the array are : ");
        for(int x: arr)
        {
            IO.print(x+" ");
        }

        IO.println("\nThe values store into the array in reverse are : ");

        for(int i = arr.length -1 ; i>=0; i-- )
        {
            IO.print(arr[i]+" ");
        }
    }

    //public static void 
}
____________________________________________________________________________________
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        int sizeOfArray = Integer.parseInt(IO.readln().trim());
        int arr [] = new int[sizeOfArray];

        int i = 0;
        while(i < sizeOfArray)
        {
            arr[i] = Integer.parseInt(IO.readln().trim());
            i++;
        }

        IO.println("Elements in array are: ");
       
        for(int x : arr)
        {
            
            IO.print(x+" ");
        }

    }
}
_________________________________________________________________________________
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
      try
      {

       int size = Integer.parseInt(IO.readln().trim());

        int arr[] = new int[size];

        for(int i = 0; i<size; i++)
        {
            arr[i] = Integer.parseInt(IO.readln().trim());
        } 
       int getElement = Integer.parseInt(IO.readln().trim());

        boolean isfound =false;
        for(int i = 0; i<size; i++)
        {
            if(getElement == arr[i]){
                isfound = true;
            IO.println("The element which you have searched is present inside the "+i+" th index");
            
            
            }

             
            
              
        }
            if(!isfound){

            throw new ArrayIndexOutOfBoundsException("The element which you have searched is not present inside the Array.");
            }
       
      }

      catch(ArrayIndexOutOfBoundsException e)
      {
        IO.println(e.getMessage());
      }
    }
}
_______________________________________________________
