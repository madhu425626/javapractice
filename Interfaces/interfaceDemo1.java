import java.util.*;

public class interfaceDemo1 {
    public static void main(String[] args) {
        // Write your code here
        int choise = Integer.parseInt(IO.readln());
        switch(choise){
            case 1 ->
            {
                Controllable c = new SmartSpeaker();
                c.turnOn();
            }
            case 2 ->
            {
                Controllable c = new SmartSpeaker();
                c.turnOff();
            }
            default -> IO.println("Invalid choice!");
        }
    }
}

interface Controllable{
    void turnOn();
    void turnOff();
}

abstract class SmartDevice implements Controllable
{
    public void turnOn()
    {
        IO.println("Smart device is turned ON.");
    }
}

class SmartSpeaker extends SmartDevice
{
   public void turnOff()
    {
        
        IO.println("Smart speaker is turned OFF.");

    }
}
