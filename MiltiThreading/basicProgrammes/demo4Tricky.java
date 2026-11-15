import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException
    {
      IO.println(" started");
      BalanceCheck b = new BalanceCheck();

      Thread th = new Thread("hai");
                  new Thread(b).start();
      //th.start();
      IO.println("child name "+th.getName());
      IO.println(" end");
    }

  
}

class BalanceCheck implements Runnable{
  public void run()
  {
    IO.println("running");
  }

  
}
