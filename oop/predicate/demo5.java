import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        String userName = IO.readln();
        Predicate <String> checkName = name -> name.toUpperCase().charAt(0) == 'S';

        IO.println(checkName.test(userName));
}
}
