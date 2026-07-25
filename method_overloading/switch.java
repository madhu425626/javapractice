/*void main(){
  int a = Integer.parseInt(IO.readln("eNTER a week day : "));
  switch (a){
    
    case 1 :
    IO.println("mon");
    break;

    case 2 :
    IO.println("tue");
    break;

    case 3 :
    IO.println("wed");
    break;

    case 4 :
    IO.println("thur");
    break;

    case 5 :
    IO.println("fri");
    break;

    case 6 :
    IO.println("sat");
    break;

    case 7 :
    IO.println("sun");
    break;


    default :
    IO.println("INVALID");


  }
}

*/



/*
void main(){
  int a = Integer.parseInt(IO.readln("enter a num : "));

  switch (a){
    case 1 -> IO.println("mon");
    case 2 -> IO.println("tue");
    case 3 -> IO.println("tue");
    case 4 -> IO.println("tue");
    case 5 -> IO.println("tue");
    case 6 -> IO.println("tue");
    case 7 -> IO.println("tue");
    default -> IO.println("Invalid input");
  }
}


*/


//--------------------------------------------------------------------------------------------------------------


class blc{
  
  public static String areaOfPerimeter(int side){
    return "Perimeter of Square : "+(side*4);
  }

  public static String  areaOfPerimeter(int length, int width){
    return "Perimeter of rectangle : "+(2*(length+width));
  }

  public static String areaOfPerimeter(double radius){
    //return "Perimeter of Circle : "+((2*radius)*3.14);
    return String.format("%.2f",(2*radius*3.14));
  }
} 

public class elc{
  
  
  
  public static void main(String []args){
    
   int choise = Integer.parseInt(IO.readln("Enter user choise :"));

    switch (choise){
      case 1 -> {
        int side = Integer.parseInt(IO.readln("enter a side of cube :"));
        IO.println(blc.areaOfPerimeter(side));
        }
      case 2 -> {
         int length = Integer.parseInt(IO.readln("enter a length of rectangle :"));
         int width = Integer.parseInt(IO.readln("enter a width of rectangle :"));
         IO.println(blc.areaOfPerimeter(length,width));
      }
      case 3 -> {
        double radius = Double.parseDouble(IO.readln("enter a radius of circle :"));
        IO.println(blc.areaOfPerimeter(radius));
        }
      default -> IO.println("Invalid choise");
    }

  }
}


















