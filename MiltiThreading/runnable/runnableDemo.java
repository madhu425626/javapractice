import java.util.*;

class a implements Runnable
{
  public void run()
  {
    IO.println("i am Runnable method");
  }
}

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      IO.println("main started");
      Thread t = new Thread(new a());
      t.start();
      IO.println("main ended");
    }
}

