import java.util.*;

public class Main {
    public static void main(String[] args) {
      Animal  a = new Dog(); //Executes on reference Type
      a.sound();
    }
}

class Animal{
  public static void sound(){
    IO.println("Animal Sound");
  }
}

class Dog extends Animal{
  public static void sound(){
    IO.println("Dog Sound");
  }
}
