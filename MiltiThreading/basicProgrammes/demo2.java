import java.util.*;



class even extends Thread{
  public void run()
  {
    IO.println("Even thread started");

    String name = Thread.currentThread().getName();
    for(int i = 0; i<=10; i+=2)
    {
      IO.println("Even value :"+name+" "+i);

      try{
        Thread.sleep(500);
      }
      catch(InterruptedException e)
      {
        e.printStackTrace();
      }
    }
    IO.println("Even thread Ended");
  }
}

class odd extends Thread{
  public void run()
  {
    String name = Thread.currentThread().getName();
    IO.println("Odd Thread Started");
    for(int i = 1; i<=10; i+=2)
    {
      IO.println("Odd Valules :"+name+" "+i);

      try{
        Thread.sleep(500);
      }
      catch(InterruptedException e)
      {

      }
    }
    IO.println("Odd Thread Started");
  }
}

class Main{

  void main()
  {
    IO.println("Main Method Started");

    even e1 = new even();
    e1.setName("Even ");
    e1.start();

    try{
    IO.println("Main Method paused");

    e1.join();
    }
    catch(InterruptedException e)
    {

    }
    IO.println("Main Method resume");


    odd e2 = new odd();
    e2.setName("Odd ");

    e2.start();

    IO.println("Main Method ended");


  }
}
