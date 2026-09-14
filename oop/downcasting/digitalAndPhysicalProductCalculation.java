package com.madhu.abstract_class;

public class ProductStore {
	public static void main(String[] args) {
		
		int choise = Integer.parseInt(IO.readln("enter"));
		
		switch(choise) {
		
		case 1 ->{
			
			String product = IO.readln();
			double price = Double.parseDouble(IO.readln());
			String category = IO.readln();
			String License = IO.readln();
			double discount = Double.parseDouble(IO.readln());
			
			Product p = new DigitalProduct(product,price,category,License);
			//p.applyDiscount(discount);
			DigitalProduct d = (DigitalProduct)p;
			d.display(discount);
//			IO.println("Discount : "+p.applyDiscount(discount));
//			IO.println("New Price : "+(p.getPrice() - p.applyDiscount(discount)));
//			IO.println("Tax : "+(p.getPrice() - p.applyDiscount(discount))*0.05);
		}
		
			case 2 ->{
			
			String product = IO.readln();
			double price = Double.parseDouble(IO.readln());
			String category = IO.readln();
			double weight = Double.parseDouble(IO.readln());
			double discount = Double.parseDouble(IO.readln());
			
			Product p = new PhysicalProduct(product,price,category,weight);
			PhysicalProduct pp = (PhysicalProduct)p;
			
			pp.display(discount);
			IO.println("Discount : "+p.applyDiscount(discount));
			IO.println("New Price : "+(p.getPrice() - p.applyDiscount(discount)));
			IO.println("Tax : "+(p.getPrice() - p.applyDiscount(discount))*0.08);
			IO.println("Shopping Cost : "+pp.calculateShippingCost());
		}
		}

		
	}
}

 abstract class Product{
	private String name;
	private double price;
	private String category;
	
	public Product(String name, double price, String category) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	public abstract double applyDiscount(double percentage);
	public abstract double calculateTax();
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void display() {
		//IO.println("Digital Product");
		IO.println("Product Name : "+this.getName());
		IO.println("Category : "+this.getCategory());
		IO.println("Price : "+this.getPrice());
		/*IO.println("License Key : "+getl);
		IO.println("Discount : ");
		IO.println("New Price : ");
		IO.println("Tax : ");*/
	}
	
	
}
 
 class DigitalProduct extends Product{
	 
	 private String licenseKey;
	 
	 
	public DigitalProduct(String name, double price, String category, String licenseKey) {
		super(name, price, category);
		this.licenseKey = licenseKey;
	}


	public String getLicenseKey() {
		return licenseKey;
	}


	public void setLicenseKey(String licenseKey) {
		this.licenseKey = licenseKey;
	}


	public  double applyDiscount(double percentage) {
		
		return getPrice()*(percentage/100);
	}
	
	
	
	public  double calculateTax() {
		return (this.getPrice() - this.applyDiscount(getPrice())) * 5;
	}

	public void display(double discount) {
		IO.println("Digital Product");
		IO.println("Product Name : "+this.getName());
		IO.println("Category : "+this.getCategory());
		IO.println("Price : "+this.getPrice());
		IO.println("License Key : "+this.getLicenseKey());
		IO.println("Discount : "+this.applyDiscount(discount));
		IO.println("New Price : "+(this.getPrice() - this.applyDiscount(discount)));
		IO.println("Tax : "+(this.getPrice() - this.applyDiscount(discount))*0.05);
		//		
	}
	 
 }

 class PhysicalProduct extends Product{

	public PhysicalProduct(String name, double price, String category, double shippingWeight) {
		super(name, price, category);
		this.shippingWeight = shippingWeight;
		
	}

	private double shippingWeight;

	@Override
	public double applyDiscount(double percentage) {
		// TODO Auto-generated method stub
		return getPrice()*percentage/100;
	}

	@Override
	public double calculateTax() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public double getShippingWeight() {
		return shippingWeight;
	}

	public void setShippingWeight(double shippingWeight) {
		this.shippingWeight = shippingWeight;
	}

	public double calculateShippingCost() {
		return getShippingWeight()*5;
	}
	
	public void display(double discount) {
		IO.println("Physical Product:");
		IO.println("Product Name : "+this.getName());
		IO.println("Category : "+this.getCategory());
		IO.println("Price : "+this.getPrice());
		IO.println("Shipping Weight : "+this.getShippingWeight()+" KG");
		IO.println("Discount : "+this.applyDiscount(discount));
		IO.println("New Price : "+(this.getPrice() - this.applyDiscount(discount)));
		IO.println("Tax : "+(this.getPrice() - this.applyDiscount(discount))*0.08);
		IO.println("Shopping Cost : "+this.calculateShippingCost());
		//		
	}
	 
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
