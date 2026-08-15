import java.util.*;

public class WeekDay {
    public static void main(String[] args) {
        // Write your code here
        String choise = IO.readln();

        String result =  switch (choise.toLowerCase()){
            case "monday" -> "MONDAY is a Weekday";
            case "tuesday"  -> "TUESDAY is a Weekday";
            case "wednesday" -> "WEDNESDAY is a Weekday";
            case "thursday" -> "THURSDAY is a Weekday";
            case "friday" -> "FRIDAY is a Weekday";
            case "saturday" -> "SATURDAY is a Weekend";
            case "sunday" -> "SUNDAY is a Weekend";
            default  -> "Invalid Day";
        };

        IO.println(result);
    }
}
