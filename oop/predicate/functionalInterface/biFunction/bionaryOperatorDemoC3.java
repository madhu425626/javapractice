import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
      BinaryOperator<Integer> bigOfTwo = (a,b) -> 
      {
        if(a>b)
        {
            return a;
        }
        else
        {
            return b;
        }
      };

      Integer input1 = Integer.parseInt(IO.readln());
      Integer input2 = Integer.parseInt(IO.readln());

      IO.println("Highest Marks: "+bigOfTwo.apply(input1,input2));


    }
}
