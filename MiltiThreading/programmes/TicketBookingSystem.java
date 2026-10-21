import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      TicketBookingSystem t = new TicketBookingSystem();
      Thread book = new Thread()
      {
        public void run()
        {
          int bookings [] = {2,4,4};

          for(int x : bookings)
          {
            t.bookTicket(x);
            try{
              Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {

            }
          }
        }
      };
      book.start();

      Thread cancel = new Thread()
      {
        public void run()
        {
          int cancellings[] = {1,3,2};

          for(int x:cancellings)
          {
            t.cancelTickets(x);
            
            try{
              Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {

            }
          }
        }

      };
      cancel.start();
    }
}

class TicketBookingSystem
{
  int avilableTickets = 5;
  public synchronized void bookTicket(int noOfTickets)
  {
    while(noOfTickets > avilableTickets)
    {
      IO.println("no tickets");
      try {
        wait();
      } catch(InterruptedException e) {
      }
    }
   // IO.println(avilableTickets+ " tickets area avilable...");
    avilableTickets -= noOfTickets;
    //IO.println(avilableTickets+ " tickets area avilable...");
    IO.println(noOfTickets+ " tickets area booked");
  }

  public synchronized void cancelTickets(int noOfTickets)
  {
    avilableTickets += noOfTickets;
    IO.println(noOfTickets+" are cancelled");
    IO.println(avilableTickets+" are AVILABLE");
    notify();

  }
}

