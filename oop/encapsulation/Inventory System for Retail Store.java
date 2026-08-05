import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        String item = IO.readln();
        double price = Double.parseDouble(IO.readln());
        int quantity = Integer.parseInt(IO.readln());

        InventoryItem i = new InventoryItem(item,price,quantity);

        IO.println("Inventory Item Details:");
        IO.println("Item Name: "+i.getInventaryItem());
        IO.println("Price Per Unit: "+i.getPricePerUnit());
        IO.println("Quantity in Stock: "+i.getQuantityInStock());
       System.out.printf("Total Inventory Value: %.2f",i.calculateTotalValue());
       IO.println();


        String updation = IO.readln();
        IO.println("Any updation in Stock Price OR Quantity : "+updation);
        IO.println();
            if(updation.equals("YES")){
           
             double updatePrice = Double.parseDouble(IO.readln());
             i.setPricePerUnit(updatePrice);
             int updateQuantity = Integer.parseInt(IO.readln());
             i.setQuantityInStock(updateQuantity);

            IO.println("\nUpdated Inventory Item Details:");
            IO.println("Item Name: "+i.getInventaryItem());
            IO.println("Price Per Unit: "+i.getPricePerUnit());
            IO.println("Quantity in Stock: "+i.getQuantityInStock());
            double finalPrice = i.calculateTotalValue();
            System.out.printf("Total Inventory Value: %.2f",finalPrice);
              

        }
        
    }
}


class InventoryItem {
    private String itemName;
    private double pricePerUnit;
    private int quantity;

    public InventoryItem(String itemName, double pricePerUnit, int quantity){
        this.itemName = itemName;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;

    }

    public void setInventoruItem(String item){
        this.itemName = item;
    }

    public String getInventaryItem(){
        return this.itemName;
    }

    public void setPricePerUnit(double price){
        this.pricePerUnit = price;
    }

    public double getPricePerUnit(){
        return pricePerUnit; 
    }

    public void setQuantityInStock(int quantity){
        this.quantity = quantity;
    }

    public int getQuantityInStock(){
        return this.quantity;
    }

    public double calculateTotalValue(){
        return ((double)getPricePerUnit()*getQuantityInStock());
    }

    
}
