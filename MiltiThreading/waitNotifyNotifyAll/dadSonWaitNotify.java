import java.util.*;

public class Main {
    public static void main(String[] args) {
     
      Amount a = new Amount(15000);
      Runnable r1 = () ->{
        IO.println("son withdrawing amoount..");
        a.withdraw();
      };

      Thread son = new Thread (r1);
      son.start();

      Runnable r2 = () ->{
        IO.println("dad talked to son...");
        a.deposit(10000);
        IO.println("dad added amount...");
      }; 

      Thread dad = new Thread (r2);
      dad.start();
    }
}

class Amount 
{
  private int balance = 10000;
  private int withdrawAmount;

  public Amount(int withdrawAmount)
  {
    this.withdrawAmount =  withdrawAmount;
  }

    public synchronized void withdraw()
    {

      if(withdrawAmount>balance)
      {
        IO.println("insufficient amount call to dad");

      try{
        wait();   //must be used in synchronized area
      }
        catch(InterruptedException e)
        {

        }
      }
          //else will not come
      
        IO.println("Amount "+withdrawAmount+" withdrawed successfully!!!");
        this.balance = balance - withdrawAmount;
        IO.println("remaining balance amount is :"+this.balance);
      
    }

    public synchronized void deposit(int balance)
    {
      this.balance += balance;
      IO.println("amoount credited");
      notify();
    }
}
