import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        Bank b = new Bank();
        IO.println("===== Welcome to ICICI Bank =====");
        IO.println("Bank Address : Hyderabad");
        IO.println("Bank IFSC Code : ICICI0001234");


        String name = IO.readln();
        int acc = Integer.parseInt(IO.readln());
        double bal = Double.parseDouble(IO.readln());

        b.setDetails(name,acc,bal);
       
        IO.println("\nCustomer account created successfully!  ");


        while(true){
        int choise = Integer.parseInt(IO.readln());
        
        switch (choise){
            case 1 -> {
                        double amt = Double.parseDouble(IO.readln()); 
                        if(amt<=0){
                            IO.println("Error: Deposit amount must be greater than zero.");
                            System.exit(0);
                        }
                        b.deposit(amt);
                         IO.println("Deposit successful! "+amt+" credited.");


                        }       
            case 2 -> {
                        
                        double amt = Double.parseDouble(IO.readln()); 
                        b.withdraw(amt);
                        }
            case 3 -> { 
                        IO.println("Current Balance: "+b.currBal());
                        }
            case 4 -> IO.println(b.display());
            case 5 -> b.exit();
        };
        }
    }
}

class Bank{
    private String name;
    private int acc;
    private double balance;

    public static String bName;
    public static String bAddress;
    public static String ifsc;

    public void setDetails(String name, int acc, double balance){

        this.name = name;
        this.acc = acc;

        if(balance<=0){
            IO.println("Error");
            System.exit(0);
        }
        this.balance = balance;

    } 

    public void withdraw(double amount){
        if(amount>balance){
            IO.println("Insufficient Balance");
            System.exit(0);

        }
        this.balance-=amount;
        IO.println("Withdrawal successful! "+amount+" debited.");
    }
      
      public void deposit(double amt){
        
        if(amt <= 0){
            IO.println("Error");
            System.exit(0);
        }
        this.balance += amt; 
      }

      public double currBal(){
        return this.balance;
      }

      public String display(){
        return "Customer [Name="+this.name+", AccountNumber="+this.acc+", Balance="+this.balance+"]";
      }

        public void exit(){
            IO.println("Thank you for banking with ICICI Bank");
            System.exit(0);
        }
    }


