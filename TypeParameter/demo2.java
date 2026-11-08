import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");

      Box<Integer> b = new Box<> (9);
      IO.println(b.getValue());

      Box<Double> c = new Box<> (12.90);
      IO.println(c.getValue());

      Box<Character> d = new Box<> (';');
      IO.println(d.getValue());

      Box<Employee> e = new Box<> (new Employee("John",9));
      IO.println(e.getValue());
    }
}

class Box<T>
{
  public T value;

  public Box(T val)
  {
    this.value  = val;

  }

  public T getValue()
  {
    return this.value;
  }
} 

record Employee(String name, Integer id){}

