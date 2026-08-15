import java.util.*;

public class AreaOfCircleMain{
    public static void main(String[] args) {
        // Write your code here
        double radius = Double.parseDouble(IO.readln());   
       IO.println(Circle.getArea(radius));    
    }
}

class Circle{
    public static String getArea(double radius){
        if(radius<=0){
            return "0";
        }
        return String.format("%.2f%n",Math.PI*radius*radius);
       
    }
}
