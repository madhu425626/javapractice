import java.util.*;

public class EvenOddCheckerMain {
    public static void main(String[] args) {
        // Write your code here
        int  x = Integer.parseInt(IO.readln());
        if(EvenOrOdd.isEven(x) == true){
            IO.println("Even");
        }else{
            IO.println("Odd");
        }
       
    }
}

class EvenOrOdd{
    public static boolean isEven(int x)
    {
        return x%2 == 0;
    }
}
