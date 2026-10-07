import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");

      int array[] = {1,2,3,4,5};

      for(int i = 0; i<array.length; i++)
      {
        for(int j = i; j<array.length; j++)
        {
          
          for(int k = j; k<array.length; k++)
          {
            
          IO.print(array[k]+" ");
          }
          IO.println();
          
        }
        
      }
    }
}
