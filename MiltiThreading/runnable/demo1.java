import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException
    {
      IO.println(" started");

      Thread th = new Thread(new TrainTicket(),"scoot");
      Thread th2 = new Thread(new TrainTicket2(),"james");
      th.start();
      th2.start();
      
    }

  
}

class TrainTicket implements Runnable{
  public void run()
  {
    Thread scoot = Thread.currentThread();
    IO.println(scoot.getName()+" got ticket");
  }

  
}
class TrainTicket2 implements Runnable{
  public void run()
  {
    Thread james = Thread.currentThread();
    IO.println(james.getName()+" got ticket");
  }

  
}
