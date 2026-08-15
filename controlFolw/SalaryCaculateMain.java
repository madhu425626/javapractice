import java.util.*;

public class SalaryCaculateMain {
    public static void main(String[] args) {
        // Write your code here
        double salary = Double.parseDouble(IO.readln());

        if(salary<20000){
            IO.println("You have: 20% Bonus");
        }
        else if(salary<50000){
            IO.println("You have: 10% Bonus");
        }
       
        else if(salary>100000){
            IO.println("You have: No Bonus");
        }
    }
}
