import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      client c = new client(10000);

      Runnable r = new Runnable(){
        public void run()
        {
          c.withdraw(10000);

        }
      };
      Thread scoot = new Thread(r,"scoot");
      Thread james = new Thread(r,"james");

      scoot.start();
      james.start();
    }
}

class client 
{
  private int balance = 10000 ;
  private int withdrawAmount;

  client(int withdrawAmount)
  {
    this.withdrawAmount = withdrawAmount;
  }

  public void withdraw(int amount)
  {
    String name = null;

    if(amount <= balance)
    {
      name = Thread.currentThread().getName();
      IO.println(name+" withdrawed amount transfer successfull");
      this.balance -= withdrawAmount;
      IO.println("Avilable bakance amount are :"+(balance));      //update balance

    }
    else{
      name = Thread.currentThread().getName();
      IO.println(" balance not avilable");
    }
  }
}
