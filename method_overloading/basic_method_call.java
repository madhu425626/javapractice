public class Main{
    public static void main(String []args){
    int a = Integer.parseInt(IO.readln());
    char x = IO.readln().charAt(0);
    char y = IO.readln().charAt(0);
    int b = Integer.parseInt(IO.readln());
      IO.println(method.input(a, x));
      IO.println(method.input(y,b));  
    }

}

class method{
    public static String input(int x, char y){
        return "int="+x+" char="+y;
    }

    public static String input(char x, int y){
        return "int="+y+" char="+x;
    }
}
