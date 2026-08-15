import java.util.*;

public class EmployeeBonusCalculateMain {
    public static void main(String[] args) {
        // Write your code here
        int salary = Integer.parseInt(IO.readln());
        if(salary>50000){
            IO.println("Bonus Eligible");
        }else{
            IO.println("Not Eligible");
        }
    }
}
