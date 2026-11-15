import java.util.*;
//no gaurentee that high priority  thead will execute first, thread scheduler dominates priority
public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");

      Runnable r1 = ()->IO.println("first");
      Runnable r2 = ()->IO.println("last");

      Thread t1 = new Thread(r1);
      Thread t2 = new Thread(r2);

      t1.setPriority(Thread.MAX_PRIORITY);
      t2.setPriority(Thread.MIN_PRIORITY);
      t2.start();
      t1.start();

    }
}

