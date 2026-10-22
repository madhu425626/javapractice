import java.util.*;

public class DaemonThreaddemo1 {
    public static void main(String[] args) {
      System.out.println("Hello, World!");

      IO.println("Main thread started");

      Thread daemonThread = new Thread(
        ()->{
          
             IO.println("daemon thread started");

            while(true)
            {
              IO.println("daemon thread is runnng");
              try {
                Thread.sleep(100);
                
              } catch(InterruptedException e) {
              }


            }
             
       }
      );

      daemonThread.setDaemon(true);
      daemonThread.start();

      Thread userThread = new Thread(() -> {
              IO.println("user thread started");

              for(int i = 1 ; i<= 10; i++)
              {
               IO.println("user thread is running");
                try {
                Thread.sleep(100);
                
              } catch(InterruptedException e) {
              }

                
              }
              IO.println("completed user thread");


      });

      userThread.start();

    }
}
