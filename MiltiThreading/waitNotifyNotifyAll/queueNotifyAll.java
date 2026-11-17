import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");

      queue line = new queue();

      Thread person1 = new Thread(()->line.waiting(),"person1");
      Thread person2 = new Thread(()->line.waiting(),"person2");
      Thread person3 = new Thread(()->line.waiting(),"person3");

      person1.start();
      person2.start();
      person3.start();

      IO.println("All persons are waiting...");


      Thread qClear = new Thread(()->line.clearWait());

      qClear.start();
      

  
    }
}

class queue
{
  boolean flag = false;
  String  name;
  public synchronized void waiting()
  {
    while(!flag)
    {
      try {
        name = Thread.currentThread().getName();
        IO.println(name+" Thread is waiting...");
        Thread.sleep(1000);
      wait();               //wait will releses the lock
        
      } catch(InterruptedException e) {

      }
      IO.println(" waiting is completed ...");
    }
  }

  public synchronized void clearWait()
  {
    flag = true;
    IO.println("setted value to true");
    notifyAll();
  }
}
