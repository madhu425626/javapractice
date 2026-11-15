import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException
    {
      IO.println("Amount checking started");
    
     BalanceCheck b = new BalanceCheck();
     b.start();
      b.join();

      IO.println("amount checked");
    }

  
}

class BalanceCheck extends Thread{
  public void run()
  {
    IO.println("balance verification started");

    try{
      Thread.sleep(1000);
      OtpVerification o = new OtpVerification();
      o.start();
      o.join();
    }catch(InterruptedException e)
    {
      e.printStackTrace();
    }
    IO.println("balance verification completed");
  }
}

class OtpVerification extends Thread{
  public void run()
  {
    IO.println("Otpverifiiciation started");

    try
    {
      Thread.sleep(1000);
    }catch(InterruptedException e)
    {
      e.printStackTrace();
    }
    IO.println("Otpverifiiciation completed");

  }
}
