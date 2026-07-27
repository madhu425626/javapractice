public class PenMain{
    public static void main(String[] args){
       Pen pen = new Pen(); 
       /*
       " Enter Pen Name : "
       "Enter pen color : "
       "Enter pen color : "
       "Enter type pen : "
       */

       pen.PenName = IO.readln();
       pen.PenColor = IO.readln();
       pen.PenPrise = Double.parseDouble(IO.readln());
       pen.PenBrand = IO.readln();

       IO.println("Pen Details:");
       IO.println("Brand : "+pen.PenName);
       IO.println("Color : "+pen.PenColor);
       IO.println("Price : "+pen.PenPrise);
       IO.println("Type : "+pen.PenBrand);
       //IO.println("Type : "+penColor(pen.penColor));


    }
}

class Pen{

    String PenName;
    String PenBrand;
    double PenPrise;
    String PenColor;

    
    
}
