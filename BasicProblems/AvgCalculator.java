import java.util.*;

public class AvgCalculator {
    public static void main(String[] args) {
        // Write your code here
        int a = Integer.parseInt(IO.readln());
        int b = Integer.parseInt(IO.readln());
        int c = Integer.parseInt(IO.readln());

        double total = ((a+b+c));
        double avg = (total/3);
        IO.println("Total Marks: "+total+" \nAverage Marks: "+avg);
    }
}
