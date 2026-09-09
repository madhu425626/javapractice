import java.util.*;

public class InterfaceDemo3 {
    public static void main(String[] args) {
        // Write your code here
        int choise = Integer.parseInt(IO.readln());
        switch(choise){
            case 1 ->
            {
                Vehicle A = new Car();
                A.start();
                A.stop();
            }
            case 2 ->
            {
                Vehicle A = new Bike();
                A.start();
                A.stop();
               
            }
            default -> IO.println("Invalid Choice.");
        }
    }
}

interface Vehicle
{
    void start();
    void stop();
} 

class Car implements Vehicle
{
    public void start()
    {
        IO.println("Car started");
    }

    public void stop()
    {
        IO.println("Car stopped");
    }


}

class Bike implements Vehicle
{
    public void start()
    {
        IO.println("Bike started");
    }

    public void stop()
    {
        IO.println("Bike stopped");
    }


}
