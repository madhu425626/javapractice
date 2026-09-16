import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        String s = IO.readln();
        GreetingService g =   name -> IO.println("Hello "+name+", Welcome!");
        g.greet(s);
        
    }
}

@FunctionalInterface
interface GreetingService
{
    void greet(String name);
}
