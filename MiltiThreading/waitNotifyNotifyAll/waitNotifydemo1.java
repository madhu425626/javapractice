import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");


      test t = new test();
      t.start();

      IO.println("Main thread going to waiting state");

      synchronized(t)
      {

      try {
        
        t.wait();

      } catch(Exception e) {
      }
      }

    IO.println("lock aquired by main thread");
      IO.println("main resumed its execution ");

      IO.println("t value is :"+t.value);
      
    }
}

class test extends Thread
{
  int value;

  public synchronized void run()
  {
    IO.println("child started its execution");
    for(int i= 0; i<10; i++)
    {
      value += i;
      IO.println(value);
      notify();
    }
    IO.println("child relesed lock");

  }

}
