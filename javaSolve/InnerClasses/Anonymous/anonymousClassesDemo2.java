import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
     Notification app = new Notification()
     {
        public void send()
        {
            IO.println("Email sent to user@example.com");
            IO.println("SMS sent to +911234567890");
            IO.println("Push notification sent to device ID 101");
        }

        
     };  

        app.send();
    }
}

interface Notification
{
    void send(); //internally it is public abstract void send()
}
