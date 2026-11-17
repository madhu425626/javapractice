import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      threadGrouop t = new threadGrouop();
      
      ThreadGroup group = new ThreadGroup("grouop 1");

      Thread call1 = new Thread(group,()->t.show(),"call 1 thread");
      Thread call2 = new Thread(group,()->t.show(),"call 2 thread");
      Thread call3 = new Thread(group,()->t.show(),"call 3 thread");
      Thread call4 = new Thread(group,()->t.show(),"call 4 thread");

      IO.println("thread group name :"+group.getName());

      call1.start();
      call2.start();
      call3.start();
      call4.start();


      ThreadGroup group2 = new ThreadGroup("GROUP 2");

      Thread group2Thread = new Thread(group2,()->t.display());
      Thread group2Thread2 = new Thread(group2,()->t.display());
      Thread group2Thread3 = new Thread(group2,()->t.display());
   
      IO.println("thread group name :"+group.getName());

      group2Thread.start();
      group2Thread2.start();
      group2Thread3.start();




    }
}

class threadGrouop
{
  public void show()
  {
    Thread t = Thread.currentThread(); // creating it as variable for frequent use
    String name = t.getName();
    String groupName = t.getThreadGroup().getName();
    IO.println("Thread name "+name);
  }

  public void display()
  {
    IO.println("display");
  }
}



/*





import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      threadGrouop t = new threadGrouop();
      
      Thread call1 = new Thread(()->t.show(),"call 1 thread");
      Thread call2 = new Thread(()->t.show(),"call 2 thread");
      Thread call3 = new Thread(()->t.show(),"call 3 thread");
      Thread call4 = new Thread(()->t.show(),"call 4 thread");

      call1.start();
      call2.start();
      call3.start();
      call4.start();
    }
}

class threadGrouop
{
  public void show()
  {
    IO.println("Thread group");
  }
}

*/

/*
import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      threadGrouop t = new threadGrouop();
      
      Thread call1 = new Thread(()->t.show(),"call 1 thread");

      call1.start();
    }
}

class threadGrouop
{
  public void show()
  {
    IO.println("Thread group");
  }
}

*/
