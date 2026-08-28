import java.util.*;

public class Main {
    public static void main(String[] args) {
        String name = IO.readln();
        int accNum = Integer.parseInt(IO.readln().trim());
        double balance = Double.parseDouble(IO.readln().trim());
        String intrest = (IO.readln());
        double depositAmount = Double.parseDouble(IO.readln().trim());
        int period = Integer.parseInt(IO.readln().trim());

        FixedDeposit s = new FixedDeposit(name,accNum,balance,intrest,depositAmount,period);
        s.displayFDInfo();
        

    }
}

class BankAccount{
    String accHolder;
    int accNumber;
    BankAccount(String name,int accNum){
        this.accHolder = name;
        this.accNumber = accNum;
    }

    public void displayBankAccountInfo(){
        IO.println("Account Holder: "+accHolder);
        IO.println("Account Number: "+accNumber);
    }
}

class SavingAccount extends BankAccount{
    double balance;
    String intrestRate;

    SavingAccount(String name,int accNum,double balance,String intrest){
        super(name,accNum);
        this.balance = balance;
        this.intrestRate = intrest;
    }
    
   

    public void displaySavingInfo(){
        super.displayBankAccountInfo();
        IO.println("Balance: "+this.balance);
        IO.println("Interest Rate: "+this.intrestRate);
    }

}

class FixedDeposit extends SavingAccount{
    double depoditAmount;
    int lockPeriodlnMonths;

    FixedDeposit(String name,int accNum,double balance,String intrest,double depoditAmount,int periodString ){
        super(name,accNum,balance,intrest);

        this.depoditAmount = depoditAmount;
        this.lockPeriodlnMonths = periodString;

    }

    public void displayFDInfo(){
        super.displaySavingInfo();
        IO.println("Deposit Amount: "+depoditAmount);
        IO.println("Lock Period (Months): "+lockPeriodlnMonths);
    }
}
