import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        int  ch = Integer.parseInt(IO.readln().trim());
        switch(ch) {
            case 3 : 
            {
                String truckNumberPlate = IO.readln();
                int maxLoad =  Integer.parseInt(IO.readln().trim());
                int currentLoad =  Integer.parseInt(IO.readln().trim());

                Vehicle v = new HeavyTruck(maxLoad,currentLoad,truckNumberPlate);
                v.display();


            }
        }
    }
}

class Vehicle
{
  String vehicleNumber;
  Vehicle(String vehicleNumber)
  {
    this.vehicleNumber = vehicleNumber;
  }
   void display()
   {
    IO.println("hi");
   }

}

class Truck extends Vehicle
{
    double maxLoad;
    Truck(double maxLoad,String vehicleNumber)
    {
        super(vehicleNumber);
        this.maxLoad = maxLoad;
    }
}

class HeavyTruck extends Truck
{
    int currentLoad;
    HeavyTruck(int maxLoad, int currentLoad,String vehicleNumber)
    {
        super(maxLoad,vehicleNumber);
        this.currentLoad = currentLoad;
    }
      double calculateLoadPercentage(double currentLoad)
     {

        return (currentLoad/maxLoad)*100;
     }

     void display()
     {
         
        IO.println("HeavyTruck Vehicle Number: "+vehicleNumber);
        IO.println("Current Load: "+currentLoad+".0 tons");
        System.out.printf("Load Utilization: %.1f%%",calculateLoadPercentage(currentLoad));
     }
}
