import java.util.*;

public class CalcuateArea {
    public static void main(String[] args) {
        // Write your code here
      int side = Integer.parseInt(IO.readln());
      int length = Integer.parseInt(IO.readln());
      int width = Integer.parseInt(IO.readln());
      double radius = Double.parseDouble(IO.readln());

      IO.println("Area of the Square :"+side*side);
      IO.println("Area of the Rectangle :"+length*width);
      System.out.printf("Area of the Circle is %.2f%n",3.14*radius*radius);
    }
}
