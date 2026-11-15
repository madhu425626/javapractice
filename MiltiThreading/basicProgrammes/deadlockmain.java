import java.util.*;

public class Main extends Thread{
    public static void main(String[] args) {
      System.out.println("Hello, World!");

      Thread th = Thread.currentThread();
     
      IO.println("thread started");
      String name = th.getName();
      for(int i = 0; i<=10; i++)
      {
        IO.println("Thread "+name);
      }
      try {

      th.join();  //deadlock main thread is waiting for main thread to complete
        
      } catch(Exception e) {
      }
      IO.println("unlocked");
    }

  public void run()
  {
    IO.println("hello");
  }
}
