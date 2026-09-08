public class staticInnerClassDemo4{
  public static void main(String [] args){
   Outer out = new Outer();
   out.OuterMethod();
  }
}

class Outer{

   int x = 369;

    void OuterMethod(){
      IO.println("Iam outer method and my value is :"+x);

      class Inner{

        int y = 639;

        void InnerMethod(){
          IO.println("Iam inner method and my value is :"+y);
        }

      }
        Inner in = new Inner();
        in.InnerMethod();
    }

  
}
