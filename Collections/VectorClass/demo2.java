
import java.util.*;

record item(Integer id, String name, Integer quantity,Double price){

}

public class Main {
    public static void main(String[] args) {
        // Write your code here
       Vector <item> listOfItems = new Vector<>();
        int size = Integer.parseInt(IO.readln());

        if(size == 0)
            {
                IO.println("Number of books must be greater than 0");
                System.exit(0);
            }

        for(int i = 0; i<size; i++)
        {
            Integer id = Integer.parseInt(IO.readln());
            String name = IO.readln();
            Integer quantity = Integer.parseInt(IO.readln());
            if(quantity<= 0)
            {
                IO.println("Quantity must be greater than 0");
                System.exit(0);
            }
            Double price = Double.parseDouble(IO.readln());

            listOfItems.add(new item(id, name, quantity,price));
        }

        IO.println("Items in Cart: "+listOfItems.size());

        Double sum = 0.0;
        for(item i:listOfItems)
        {
            IO.println(i.id()+" "+i.name()+" "+i.quantity()+" "+i.price());
            sum += i.price()*i.quantity();

        }
        IO.println("Total Bill Amount: "+sum);

    }
}
