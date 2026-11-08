import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Write your code here

        int input = Integer.parseInt(IO.readln());

        Predicate<Integer> a = num -> num%2 == 0;
        Predicate<Integer> b = num -> num>10;
        Predicate<Integer> c = num -> {
            int count = 0;
            for(int i = 1; i < input; i++ )
            {
                if(input%i == 0)
                {
                    count++;
                }
            }

            if(count >= 2)
            {
                return false;
            }
            return true;

    };
    IO.println(input+" is Even: "+a.test(input));
    IO.println(input+" is Greater Than 10: "+b.test(input));
    IO.println(input+" is Prime: "+c.test(input));
    }
}
