import java.util.*;
import java.util.function.Predicate;

public class predicateDemo2 {
    public static void main(String[] args) {
       
    int useArge = Integer.parseInt(IO.readln());
    boolean userAssistance = Boolean.parseBoolean(IO.readln());

    Passenger  p = new Passenger( useArge,  userAssistance);
  
    Predicate<Passenger> p1 = (passenger)  -> passenger.age >= 18 && passenger.assistanceRequired != true;
    //Predicate<Passenger> p2 = (passenger) -> passenger.assistanceRequired == true;

    boolean isAgeGrater = p1.test(p);
   // boolean isUserAssistanceRequired = p2.test(p);

    if(isAgeGrater /*&& !isUserAssistanceRequired*/)
    {
        IO.println("Seat Allowed");
    }
    else
    {
        IO.println("Seat Not Allowed");

    }
    }
}

class Passenger
{
    int age;
    boolean assistanceRequired;

    Passenger(int age, boolean userAssistance)
    {
        this.age = age;
        this.assistanceRequired = userAssistance;
    }

}
