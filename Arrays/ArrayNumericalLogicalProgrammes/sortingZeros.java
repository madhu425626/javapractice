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
__
