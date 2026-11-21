import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");

      interruptDemo i = new interruptDemo();
      i.th.start();
    }
}

class interruptDemo
{
  Thread th = new Thread()
  {
    Thread th = Thread.currentThread();
    public void run()
    {
      IO.println("Hell0 dev");
     IO.println("Thread is interrpted : "+th.isInterrupted());
     try {
        th.interrupt();

        for(int i = 0; i<10; i++)
        {
          IO.println(i);
          Thread.sleep(500);
        }
     } catch(Exception e) {
     }
     IO.println("Thread is interrpted : "+th.isInterrupted());
    }
  };
}
