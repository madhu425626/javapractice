//writing a thread programme, with anonymous inner class for runnable interface

multi threading programmes 
import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");

      Runnable r = new Runnable()
      {
        public void run ()
        {
          String name = Thread.currentThread().getName();
          IO.println(name);
        }
      };
      Thread th = new Thread(r);
      th.start();
    }
}

-------------------------------------------------------------------------
// same like above, but no reference var for runnable, insteading of passing reference of runnable, directly writing anonymous inner class at their.

import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
    
    Thread th = new Thread(new Runnable()
    { 
      @Override
      public void run()
      {
        String name = Thread.currentThread().getName();
        IO.println(name);
      }
    });
    th.start();
    }
}
---_____________________________________________________________________________
//instead of writing reference and passing that reference into thread constructor, we directly writing inside , not recomended

import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      new Thread(()->IO.println(Thread.currentThread().getName()),"child").start();
    }
}
