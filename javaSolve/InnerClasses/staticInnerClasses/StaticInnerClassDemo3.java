public class StaticInnerClassDemo3{
  public static void main(String [] args){
   Outer.Inner.innerShow();
  }
}

class Outer{
   int x = 369;

  static class Inner{

     void innerShow(){
      IO.println("cannot refer a non-static variable with a static reference :" + this.x); //cannot refer a non-static variable with a static reference 
    }
  }
}

