import java.util.*;
import java.util.function.Predicate;

public class predecateDemo3 {
    public static void main(String[] args) {
        // Write your code here
        
        int useAge = Integer.parseInt(IO.readln());
        int useEyeSight = Integer.parseInt(IO.readln());

        Citizen c = new Citizen(useAge,useEyeSight);

        Predicate<Citizen> p1 = Citizen -> Citizen.age >= 16 && Citizen.eyeSight >= 6; 
        
        boolean isEligibleForLicense = p1.test(c);
        if(isEligibleForLicense)
        {
            IO.println("Eligible for License");
        }
        else
        {
            IO.println("Not Eligible for License");

        }


    }
}

class Citizen
{
    int age;
    int eyeSight;

    Citizen(int age, int eyeSight)
    {
        this.age = age;
        this.eyeSight = eyeSight;
    }


}
/*
record Citizen(int age, int eyeSight)
{

}
*/
