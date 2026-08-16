import java.util.*;

public class CalculateAreaPerimeterOfRectangleMain {
    public static void main(String[] args) {
        // Write your code here
        double width = Double.parseDouble(IO.readln());
        double height = Double.parseDouble(IO.readln());

        Area a = new Area(width,height);
        IO.println("Area of Rectangle : "+a.getArea());
        IO.println("Perimeter of Rectangle : "+a.getPerimeter());
    }
}

class Area{
    private double width;
    private double height;

    public Area(double width, double height){
        if((width<0|height<0)){
            IO.println("Error: Width and height must be non-negative.");
            System.exit(0);
        }
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return width*height;
    }

    public double getPerimeter(){
        return 2*(width+height);
    }
}
