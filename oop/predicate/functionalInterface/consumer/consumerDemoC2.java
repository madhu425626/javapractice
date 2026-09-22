import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here

        Consumer<User> c1 = user -> IO.println(user.name+" walked "+user.steps+" steps today.");

        int ch = Integer.parseInt(IO.readln().trim());

        for(int i = 1; i<=ch; i++)
        {
        String name = IO.readln();
        int steps = Integer.parseInt(IO.readln().trim());
        User u = new User(name,steps);
        c1.accept(u);

        }
    }
}



class User
{
    String name;
    int steps;

    User(String name, int steps)
    {
        this.name = name;
        this.steps = steps;
    }
}
