import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      syncDemo s = new syncDemo();

      Thread t = new Thread()
      {
        
        public void run()
        {
          s.table(5);
        }
      };

      Runnable r = new Runnable()
      {
        public void run()
        {
          s.table(9);
        }
      };

      Thread th = new Thread(r);

      t.start();th.start();
    }
}

class syncDemo
{
  synchronized void table(int x )
  {
    for(int i = 1; i<=10; i++)
    {
      IO.println(x+"x"+i+"="+i*x);
          
    }
  }
}
