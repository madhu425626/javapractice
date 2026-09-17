import java.util.*;
import java.util.function.Predicate;

public class predicateDemo1 {
    public static void main(String[] args) {
        // Write your code here
        String name = IO.readln();
        double price  = Double.parseDouble(IO.readln());
        int mileage = Integer.parseInt(IO.readln());

        Predicate<String> p1 =  Car -> 
        {
            if(price <= 500000 && mileage >= 20)
            {
                return true;
            }

            else
            {
                return false;
            }
        };

        if(p1.test(name))
        {
            IO.println(name+" is eligible for sale");
        }
        else
        {
            IO.println(name+" is not eligible for sale");
        }
    }
}

record Car(String brand, Double price, Integer mileage)
{

}

