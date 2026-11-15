import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      blockSync b = new blockSync();
      Thread th = new Thread()
      {
        public void run()
        {
          b.table();
        }
      };

      th.start();
/*
      Runnable r = new Runnable(){
        public void run()
        {
          b.table();
        }
      };
      Thread t2 = new Thread(r);

      t2.start();

      new Thread(new Runnable()
      {
        public void run()
        {
          b.table();
        }
      }).start();


      //Runnable r1 = () -> b.table();

      Thread t3 = new Thread(() -> b.table());

      t3.start();
      */
    }
}

class blockSync
{
  public void table()
  {
      String name = Thread.currentThread().getName();

  synchronized(this)
  {
    for(int i =1; i<=10; i++)
    {
      IO.println("5 x "+i+"="+5*i+"  "+name);
    }
  }
  }
}
