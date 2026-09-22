import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
    BiFunction<Integer,Double,Double> currencyExChange = (amount,exChangeRate) -> 
    {
        return amount*exChangeRate;
    };
        
    int amount = Integer.parseInt(IO.readln());
    double exChangeRate = Double.parseDouble(IO.readln());

    IO.println("Converted Amount: "+currencyExChange.apply(amount,exChangeRate));


    }
}

