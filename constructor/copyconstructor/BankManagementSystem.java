import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        String no = IO.readln();
        String name = IO.readln();
        String type = IO.readln();
        double balance = Double.parseDouble(IO.readln());
        Bank b = new Bank(no,name,type,balance);
        
        IO.println("Original Account Details");
        IO.println("Account Number: "+b.no);
        IO.println("Holder Name: "+b.name);
        IO.println("Account Type: "+b.type);
        IO.println("Balance: "+b.balance);

        Bank c = new Bank(b);
        IO.println("\nCopied Account Details (Before Transaction)");
        IO.println("Account Number: "+c.no);
        IO.println("Holder Name: "+c.name);
        IO.println("Account Type: "+c.type);
        IO.println("Balance: "+c.balance);

        IO.println("Deposit 1000.0 -> New Balance: "+(c.balance+1000));
      
        IO.println("Withdraw 2000.0 -> New Balance: "+(c.balance-1000));
    




    }
}

class Bank{
    String no;
    String name;
    String type;
    double balance;

    public Bank(String no, String name, String type, double balance){
        this.no = no;
        this.name = name;
        this.type = type;
        if(balance<=0){
            IO.println("Error: Initial balance cannot be negative.");
            System.exit(0);
        }
        this.balance = balance;
    }
    public Bank(Bank b){
        this.no = b.no;
        this.name = b.name;
        this.type = b.type;
        this.balance = b.balance;
    }
}
