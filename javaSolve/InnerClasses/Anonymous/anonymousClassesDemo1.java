import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here

        Notifier n = new Notifier()
        {
              public void notifyUser()
            {
                IO.println("User notified");
            }
        };

        int choice = Integer.parseInt(IO.readln());
        switch(choice)
        {
            case 1 ->
            {
                n.notifyUser();
            }

            case 0 ->
            {
                IO.println("Invalid choice.");
            }
        }
    }
}

abstract class Notifier{
    public abstract void notifyUser();
    
}

