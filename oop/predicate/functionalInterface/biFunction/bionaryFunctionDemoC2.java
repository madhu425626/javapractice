import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        
        UnaryOperator<Double> empSalaryIncrement = incrementedSalary -> incrementedSalary + incrementedSalary*0.10;

        Double amount = Double.parseDouble(IO.readln());

        IO.println("Updated Salary: "+empSalaryIncrement.apply(amount)); 

    }
}
