import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException
    {
    //  Runnable r = new Runnable()
    //  {
    //     public void run()
    //     {
    //         IO.println("Implementing Runnable with innerclasses and with reference");
    //     }
    //  };

    //  Thread t = new Thread(r);
    //  t.start();     

    // Thread t = new Thread(
    // new Runnable()
    // {
    //   public void run()
    //   {
    //     IO.println("runnable without Reference");
    //   }
    // }
    // );
    // t.start();

/*
    // anonymous innerclass +
    // assigning runnable target directly with imolwmwntation to thread object +
    // starting thread
    new Thread(new Runnable()
      {
      public void run()
      {
        IO.println("direct start");
      }
      }
    ).start();
    */

/*
    Runnable r1 = () -> IO.println(Thread.currentThread().getName());
    new Thread(r1).start();

    new Thread(()->IO.println(Thread.currentThread().getName())).start();
*/
    }  
}
