import java.util.*;

class myThread extends Thread
{
  public void run()
  {
    IO.println("Thread started...");
    String name = Thread.currentThread().getName();
    for(int i = 0; i<=10; i++)
    {
      IO.println(i+" "+name);
      try
      {
        Thread.sleep(500);
      }
      catch(InterruptedException e)
      {

      }
    }
  }
}
public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      myThread m = new myThread();
      String threadName = myThread.currentThread().getName();
      
      m.start();
      try{
      m.join();

      }
      catch(InterruptedException e)
      {

      }
      IO.println(threadName);
    }
}
