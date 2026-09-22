import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        Consumer<Transaction> cust = t -> IO.println("SMS to " + t.name() + ": Rs. " + t.amount() + " debited. Balance: Rs. " + t.balance());

        int ch = Integer.parseInt(IO.readln().trim());

        for(int  i = 1; i<=ch; i++)
        {
        
        int transId = Integer.parseInt(IO.readln().trim());
        String custName = IO.readln().trim();
        int transAmt = Integer.parseInt(IO.readln().trim());
        int bal = Integer.parseInt(IO.readln().trim());

        Transaction t1 = new Transaction(transId,custName,transAmt,bal);
        cust.accept(t1);
            
        }
    }
}


record Transaction (int id, String name, int amount, int balance)
{

}
