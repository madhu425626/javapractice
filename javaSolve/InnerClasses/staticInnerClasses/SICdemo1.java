public class SICdemo1{
  public static void main(String [] args){
    Outer out  = new Outer();
    Outer.Inner in = new Outer.Inner();
    in.show();
    Outer.display();
  }
}

class Outer{

  static class Inner{
    void show(){
      IO.println("Obj creation for inner class becoz non-static method show() is exist in inner class");
    }
  }

  static void display(){

    IO.println("***************************************");
    IO.println("Obj creation for outer class is not required becoz it have onlly static members");
    IO.println("***************************************");
    IO.println("static metnods are executed with class name reference");
  }
}
