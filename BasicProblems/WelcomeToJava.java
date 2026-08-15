public class WelcomeToJava{
    public static void main(String []args){
        String msg = IO.readln();
        IO.println(welcomeClass.welcome(msg));
    }
}

class welcomeClass{
   public static String welcome(String msg){
    return " Welcome to Java";
       }
}
