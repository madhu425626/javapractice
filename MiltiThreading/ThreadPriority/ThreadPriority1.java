import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      Thread m = Thread.currentThread();
      int p = m.getPriority();
      IO.println(p);

      m.setPriority(Thread.MAX_PRIORITY);
      p = m.getPriority();
      
      IO.println(p);

      Runnable r = () -> IO.println("hello"); //default priority is same as parent
      Thread t = new Thread(r);
      //t.setPriority(Thread.MIN_PRIORITY);
      IO.println(t.getPriority());

    }
}

//later priority changes if we modify child thread priority 

import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      Thread m = Thread.currentThread();
      int p = m.getPriority();
      IO.println(p);

      m.setPriority(Thread.MAX_PRIORITY);
      p = m.getPriority();
      
      IO.println(p);

      Runnable r = () -> IO.println("hello"); //default priority is same as parent
      Thread t = new Thread(r);
      t.setPriority(Thread.MIN_PRIORITY);
      IO.println(t.getPriority());

    }
}



