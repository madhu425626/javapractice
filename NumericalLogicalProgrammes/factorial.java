public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      int factorial = 1;
      for(int i = 2; i<=4; i++)
      {
        factorial *=i; 
      }
      IO.println(factorial);
    }
}
