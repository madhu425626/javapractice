import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      client c = new client(1);
      Thread scoot = new Thread(c,"scoot");
      Thread james = new Thread(c,"james");

      scoot.start();
      james.start();
    }
}

class client implements Runnable
{
  private int availableSeats = 1 ;
  private int wantedSeats;

  client(int wantedSeats)
  {
    this.wantedSeats = wantedSeats;
  }

  public void run()
  {
    String name = null;

    if(wantedSeats <= availableSeats)
    {
      name = Thread.currentThread().getName();
      IO.println(name+" seat booked");
    }
    else{
      IO.println("no available seat booked");
    }
  }
}
