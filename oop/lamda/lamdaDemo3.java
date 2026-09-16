import java.util.*;

public class lamdaDemo3 {
    public static void main(String[] args) {
        // Write your code here

        double employeeSalary = Double.parseDouble(IO.readln());
        double employeeRating = Double.parseDouble(IO.readln());

        BonusCalaulator bonus = (salary,rating) ->
        {
            if(rating >= 4)
            {
                return salary*0.20;
            }
            else if(rating == 3)
            {
                return salary*0.10;
            }
            else if(rating < 3)
            {
                return salary*0.0;
            }
        
                return 0; //method must a value
            
            
        };

        IO.println("Bonus Amount = "+bonus.calculateBonus(employeeSalary,employeeRating));
    }
}


@FunctionalInterface
interface BonusCalaulator
{
    double calculateBonus(double salary, double rating);
}
