import java.util.*;

public class InterfaceDemo2 {
    public static void main(String[] args) {
        // Write your code here
         int choise = Integer.parseInt(IO.readln());
        switch(choise){
            case 1 ->
            {
                Animal A = new Dog();
                A.Sound();
            }
            case 2 ->
            {
                Animal A = new Cat();
                A.Sound();
            }
            default -> IO.println("Invalid Choice");
        }
}
}

interface Animal
{
    void Sound();
}

class Dog implements Animal
{
   public void Sound()
    {
        IO.println("Dog barks");
    }
}

class Cat implements Animal
{
    public void Sound()
    {
        IO.println("Cat meows");
    }
}

