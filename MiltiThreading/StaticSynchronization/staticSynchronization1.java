import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      blockSync b = new blockSync(); //lock 1
      blockSync b1 = new blockSync(); //lock 2
      Thread th = new Thread()
      {
        public void run()
        {
          b.table();
        }
      };

      th.start();


      Thread th1 = new Thread()
      {
        public void run()
        {
          b.table();
        }
      };

      th1.start();


      Runnable r1 = () -> b1.table(); //   ------------      //b1
                                    //                 |
      Runnable r2 = () -> b1.table(); //               |
                                      //               |
      Thread a = new Thread(r1);      //               |------- static block synchronization, since static block present in nonstatic method so 
      Thread a2 = new Thread(r2);     //               |        we need to call by obj reference but lock will be aquired from class only and single lock
                                      //               |
      a.start();                      //               |
      a2.start();                     //  -------------
    
    }
}

class blockSync
{
  public void table()
  {
      String name = Thread.currentThread().getName();

   synchronized(blockSync.class)
  {
    for(int i =1; i<=10; i++)
    {
      IO.println("5 x "+i+"="+5*i+"  "+name);
    }
  }
  }
}
