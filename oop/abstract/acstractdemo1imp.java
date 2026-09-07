
class Cake 
{
private String shape;
private String flavour;
private int quantity;
private double price = 400;

public Cake(String shape, String flavour, int quantity) {
	if(quantity <= 0){
        IO.println("Invalid input. All fields must be provided, and quantity must be > 0.");
        System.exit(0);
    }
	this.shape = shape;
	this.flavour = flavour;
	this.quantity = quantity;
}
public String getShape() {
	return shape;
}

public void setShape(String shape) {
	this.shape = shape;
}


public String getFlavour() {
	return flavour;
}

public void setFlavour(String flavour) {
	this.flavour = flavour;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}



public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public String toString() {
	
	return "A "+this.shape+" "+this.flavour+" Cake Of "+this.quantity+" KG is Ready @ Rs."+this.quantity*this.price;
}


}


class OrderCake extends Cake{
	private String msg;

	public OrderCake() {
		super("Round","Vanila",1);
	}
	
	public OrderCake(String shape, String flavour, int quantity){
		super(shape,flavour,quantity);
		
	}
	public OrderCake(String shape, String flavour, int quantity,String msg){
		super(shape,flavour,quantity);
        this.msg = msg;
		
	}
	public String toString() {
        if(msg == null)
        {
            return super.toString();
        }
		
		return "A "+getShape()+" "+getFlavour()+" Cake Of "+getQuantity()+" KG is Ready with "+this.msg+" @ Rs."+getQuantity()*getPrice();
	}
}


public class acstractdemo1imp {

	public static void main(String[] args) {

		 int choise = Integer.parseInt(IO.readln());
		 
	        switch(choise){
	        case 1 ->{
	        	Cake c = new OrderCake();
                String a = IO.readln();
	        	IO.println(c);
	        	}
	        
	        case 2 ->{
	        	String shape = IO.readln();
	        	String flavour = IO.readln();
	        	int quantity = Integer.parseInt(IO.readln());
	        	
	        	
	        	Cake c = new OrderCake(flavour,shape,quantity);  
	        	IO.println(c);
	        }
	        case 3 ->{
	        	String shape = IO.readln();
	        	String flavour = IO.readln();
	        	int quantity = Integer.parseInt(IO.readln());
	        	String message = IO.readln();
	        	
	        	
	        	Cake c = new OrderCake(flavour,shape,quantity,message);  
	        	IO.println(c);
	        }
	        
	        	default ->{
	        		IO.println("Invalid input");
	        	}

	        
	        }
	}

}


 
