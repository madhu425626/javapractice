import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        int x = Integer.parseInt(IO.readln().trim());
        int y = Integer.parseInt(IO.readln());

        Calculator sum =   ( a,b) -> {
            return a+b;
        };
       


        IO.println("Result = "+sum.calculate(x,y));
        
           
        
    }
}
@FunctionalInterface
interface Calculator
{
    int calculate(int c, int d);
}
