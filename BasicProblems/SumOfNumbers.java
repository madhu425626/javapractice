import java.util.*;

public class SumOfNumbers{
    public static void main(String[] args) {
        // Write your code here
        int a = Integer.parseInt(IO.readln());

        int sum = 0;
        while(a>0){
            int rem = a%10;
            sum += rem; 
            a /=10;
        }
        IO.println("Sum of digits: "+sum);
    }
}
