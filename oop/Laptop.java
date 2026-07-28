package com.madhu.laptop.elc;

//-----------------------------------------------------------------------Elc----------------------------------------------------------------
//File Name : MainLaptop.java
/*
 
 
Write a Program on OOPs to define Product class properties and behaviour.

Properties/Field/Attribute :

productId : int
productName : String
productPrice : double

Initialize these properties with the help of method using parameter variable.

behavior/Method:
setProductData(int id, String name, double price) : public void
getProductInfo() : public void


 */
public class MainLaptop {

	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		
		IO.println("Enter Laptop Details...");
	    String laptoppName = IO.readln("Enter Laptop name : ");
	    int laptoppModel = Integer.parseInt(IO.readln("Enter laptop model : "));
	    double laptoppPrice = Double.parseDouble(IO.readln("Enter laptop price : "));
	    String isGaming = (IO.readln("Is a gaming Loptop : "));
	    
	    laptop.laptopName = laptoppName;
	    laptop.laptopModel = laptoppModel;
	    laptop.laptopPrice = laptoppPrice;
	    laptop.gamingLaptop = isGaming;
	    
	    
	    
	    
	    
	    IO.println("-----------Your Laptop Details are : -------------");
	    IO.println(laptoppName);
	    IO.println(laptoppModel);
	    IO.println(laptoppPrice);
	    
	    if(laptop.gamingLaptop.equalsIgnoreCase("YES")){
	    	IO.println("Yes "+laptop.laptopName+" IS a Gaming Laptop...");
	    }else {
	    	IO.println("NO "+laptop.laptopName+" IS not a Gaming Laptop...");

	    }
	    
	   // IO.println(isGaming);
	    
		//laptop.setLaptopDetails("HP Victus...", 15, 90000,true);
		//laptop.getLaptopDetails();
	}

}


//-------------------------------------------------Blc--------------------------------------------------------------
// File name : Loptop.java
class Laptop{
	
	String laptopName;
	int laptopModel;
	double laptopPrice;
	String gamingLaptop;
	

	public void setLaptopDetails(String name, int model, double price, String gaming) {
		laptopName = name;
		laptopModel = model;
		laptopPrice = price;
		gamingLaptop = gaming;
		
	}
	
	public void getLaptopDetails() {
		IO.println("Laptop details.................");
		IO.println("Laptop Name : "+laptopName);
		IO.println("Laptop Model: "+laptopModel);
		IO.println("Laptop Price : "+laptopPrice);
		IO.println("Is "+laptopName+"a gaming loptop."+gamingLaptop);
	}
	
	/*public boolean isGamingg(String isGaming) {
		if()
	}*/
	
}
