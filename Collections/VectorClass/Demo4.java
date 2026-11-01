
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        Vector<String> listOfProducts = new Vector<> ();
        int size = Integer.parseInt(IO.readln());

        for(int i=0; i<size; i++)
        {
            String item = IO.readln();
            listOfProducts.add(item);
        }
        int  itemToRemove = Integer.parseInt(IO.readln());
        

        // for(String s:listOfProducts)
        // {
        //     if(s.equals(itemToRemove))
        //     {
        //         listOfProducts.remove(itemToRemove);
        //         break;
        //     }
            
        // }

        listOfProducts.remove(itemToRemove);
           IO.println("Updated shopping list:"); 

        for(String s:listOfProducts)
        {
           IO.println(s); 
        }
        
        //listOfProducts.forEach(IO::println);
    }
}
