import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Write your code here

     Function<Integer,Integer> func = num -> num*num;
     int num = Integer.parseInt(IO.readln().trim());

     IO.println("Square = "+func.apply(num));
  
    }
}
