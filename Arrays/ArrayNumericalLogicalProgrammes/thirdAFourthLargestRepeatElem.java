    //third and fourthLargest
import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      int array [] = {1,2,55,6,55,5,52,65,99,66,99,77,3,1,2,3};
      

          int temp = 0;
      for(int i=0; i<array.length; i++)
      {
        for(int j = i;j<array.length; j++)                                
        {
          //sorting inascending order
          if(array[i]>array[j])
          {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
          }
        }
      }

    int  largest = array[array.length-1];
    int secondLargest = 0;
    int thirdLargest = 0;
    int fourthLargest = 0;
      
      for(int i = array.length-2; i>=0; i--)                      //looop will start from second last element
      {
        
          if(array[i] != largest)
          {
            secondLargest = array[i];
           
              if(array[i-1] != secondLargest)
              {
                thirdLargest = array[i-1];
                if(array[i-2] != thirdLargest)
                {
                  fourthLargest = array[i-2];
                  break;                                          //remember break

                }
              }
            
          }
         
      } 
       IO.println(Arrays.toString(array));
       IO.println(secondLargest);
       IO.println(thirdLargest);
       IO.println(fourthLargest);

    }
}
