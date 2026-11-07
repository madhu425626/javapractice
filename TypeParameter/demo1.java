import java.util.*;

public class Main {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      Childeren<String> aman = new Childeren<>("ice-Cream");
      IO.println(aman.getItem());

      Childeren<Integer> nani = new Childeren<>(100);
      IO.println("Nani got price if ..."+nani.getItem()+" Rupees");

      Childeren<Double> chintu = new Childeren<>(99.8);
      IO.println("Chintu scored marks of "+chintu.getItem()+" in jeemanis");

      Childeren<Employee> karthik = new Childeren<>(new Employee(9,"Karthik Sharma"));
      IO.println("Congratulations "+karthik.getItem()+" got hired...!"); 
    }
}

record Employee(Integer id, String name)
{

}

class Childeren <T>
{
  T item;
  public Childeren(T item)
  {
    this.item = item;
  }

  public T getItem()
  {
    return this.item;
  }
}
