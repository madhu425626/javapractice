import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
    
  
    Thread demo = new Thread(new InterruptDemo1());
    demo.start();
    demo.interrupt();


    }
}

class InterruptDemo1 implements Runnable{
  public void run()
  {
    boolean isInterrupted = Thread.currentThread().isInterrupted();
    
    IO.println(isInterrupted);
   for(int i = 1; i<=10; i++)
    {
      IO.println(i);

      try {
        
        Thread.sleep(100);
      } catch(InterruptedException e) {
       IO.println(e);
       Thread.currentThread().interrupt(); //INterrupts evety time 

      }
    }
  }
}
