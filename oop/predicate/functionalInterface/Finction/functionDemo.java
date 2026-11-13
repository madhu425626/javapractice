import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        Function<Integer,Integer> func = num ->{

        int qty = Integer.parseInt(IO.readln().trim());
        return num*qty;
        } ;
        
        int amount = Integer.parseInt(IO.readln().trim());
       
        IO.println("Total Amount = "+func.apply(amount));
        
    }
}
