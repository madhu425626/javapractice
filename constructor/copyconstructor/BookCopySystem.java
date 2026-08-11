import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here

        String id = IO.readln();
        String title = IO.readln();
        String name = IO.readln();
        double price = Double.parseDouble(IO.readln());

        Book b = new Book(id,title,name,price);
        IO.println("Original Book Details");
        IO.println("ID: "+b.id);
        IO.println("Title: "+b.title);
        IO.println("Author: "+b.name);
        
        IO.println("Price: "+b.price);

        Book c = new Book(b);

        IO.println("Copied Book Details");
        IO.println("ID: "+b.id);
        IO.println("Title: "+b.title);
        IO.println("Author: "+b.name);
        
        IO.println("Price: "+b.price);

    }
}

class Book{
    String id;
    String title;
    String name;
    double price;

   public Book(String id, String title, String name, double price){
    this.id = id;
    this.title = title;
    this.name = name;
    if(price <=0 ){
        IO.println("Error: Price must be greater than 0.");
        System.exit(0);
    }
    this.price = price;
   } 

   public Book(Book a){
    this.id = a.id;
    this.title = a.title;
    this.name = a.name;
    this.price = a.price;
   } 
}
