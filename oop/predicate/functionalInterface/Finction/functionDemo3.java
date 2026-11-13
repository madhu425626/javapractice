import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        Function<Integer,String> demo = num -> {
            if(num >= 1000000)
            {
                return "High Tax";
            }
            else if(num >= 500000)
            {
                return "Medium Tax";
            }
            return "Low Tax";
        };

        int salary = Integer.parseInt(IO.readln());
        IO.println(demo.apply(salary));
    }
}
