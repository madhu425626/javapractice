public class SICdemo2{
  public static void main(String [] args){
   Outer.Inner.innerShow();
  }
}

class Outer{
  static int x = 369;

  static class Inner{

    static void innerShow(){
      IO.println("Iam Static innerShow methos i dont need obj creation to call me, i can came just with class name reference "+x);
    }
  }
}
