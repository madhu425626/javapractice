import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        String name = IO.readln();
        int price = Integer.parseInt(IO.readln());
        int  quantity = Integer.parseInt(IO.readln());

        Order o = new Order();
        o.setOrder(name,price,quantity);
       
                
       
        IO.println("Order Placed Successfully");

        o.orders();

    }
}

class Order{
    private String name;
    private int unit;
    private int quantity;
    private int price;

    public Order(){
        String name = "unknown";
        int unit = 0;
        int quantity = 0; 
        int charge = 50;
    } 

    public void setOrder(String name, int price, int quantity){
        this.name = name;

        if(price<=0){
            IO.println("Error: Price and quantity must be positive values.");
            System.exit(0);
        }
        this.price = price;
        this.quantity = quantity;
    }

    public void calculateDiscount(double price){
        if(price<=1000){
        IO.println("Delivery Charge: 50");
        IO.println("Final Payable Amount: "+(this.quantity * this.price + 50));
        }else{
        IO.println("Delivery Charge: 0");
        IO.println("Final Payable Amount: "+(this.quantity * this.price ));
    }
    }

    public void orders(){
        IO.println("Product: "+this.name);
        IO.println("Total  Product Cost: "+this.price);
        calculateDiscount(price);
    }


}
