import java.util.*;
import java.util.function.Predicate;

public class CarSelling {
    public static void main(String[] args) {
        // Write your code here
        String name = IO.readln();
        double price  = Double.parseDouble(IO.readln());
        int mileage = Integer.parseInt(IO.readln());

        Predicate<Car> p1 =  car -> car.price() <= 500000 && car.mileage() >= 20;
       
        Car userCar = new Car(name,price,mileage);

        if(p1.test(userCar))
        {
            IO.println(userCar.brand()+" is eligible for sale");
        }
        else
        {
            IO.println(userCar.brand()+" is not eligible for sale");
        }
    }
}

record Car(String brand, Double price, Integer mileage)
{

}

