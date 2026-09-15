package com.madhu.abstract_class;
import java.util.Scanner;


public class ProductStore {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choise = sc.nextInt();
		sc.nextLine(); 
		
		switch(choise) {
		
		case 1 ->{
			
			
			String product = sc.nextLine();
			double price = sc.nextDouble();
			sc.nextLine(); 
			String category = sc.nextLine();
			String License = sc.nextLine();
			double discount = sc.nextDouble();
			
			Product p = new DigitalProduct(product,price,category,License);
			//p.applyDiscount(discount);
			DigitalProduct d = (DigitalProduct)p;
			d.display(discount);
//			IO.println("Discount : "+p.applyDiscount(discount));
//			IO.println("New Price : "+(p.getPrice() - p.applyDiscount(discount)));
//			IO.println("Tax : "+(p.getPrice() - p.applyDiscount(discount))*0.05);
		}
		
			case 2 ->{
			
			String product = sc.nextLine();
			double price = sc.nextDouble();
			sc.nextLine(); 
			String category = sc.nextLine();
			double weight = sc.nextDouble();
			double discount = sc.nextDouble();
			sc.close();
			
			Product p = new PhysicalProduct(product,price,category,weight);
			PhysicalProduct pp = (PhysicalProduct)p;
			
			pp.display(discount);
//			IO.println("Discount : "+p.applyDiscount(discount));
//			IO.println("New Price : "+(p.getPrice() - p.applyDiscount(discount)));
//			IO.println("Tax : "+(p.getPrice() - p.applyDiscount(discount))*0.08);
//			IO.println("Shopping Cost : "+pp.calculateShippingCost());
		}
			default -> IO.println("Invalid Input");
		};

		
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

	

	public double getPrice() {
		return price;
	}

	

	public String getCategory() {
		return category;
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
 
 
 /*
 // package com.madhu.abstract_class;
import java.util.Scanner;


public class ProductStore {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choise = sc.nextInt();
		sc.nextLine(); 
		
		switch(choise) {
		
		case 1 ->{
			
			
			String product = sc.nextLine();
			double price = sc.nextDouble();
			sc.nextLine(); 
			String category = sc.nextLine();
			// sc.nextLine(); 

			String License = sc.next();
			
			
			Product p = new DigitalProduct(product,price,category,License);
			double discount = sc.nextDouble();
			p.display();
			// DigitalProduct d = (DigitalProduct)p;
			//d.applyDiscount(discount);
			IO.println("Discount : "+p.applyDiscount(discount));
			IO.println("New Price : "+(p.getPrice() - p.applyDiscount(discount)));
			IO.println("Tax : "+(p.getPrice() - p.applyDiscount(discount))*0.05);
		}
		
			case 2 ->{
			
			String product = sc.nextLine();
			double price = sc.nextDouble();
			sc.nextLine(); 
			String category = sc.nextLine();
			
			double weight = sc.nextDouble();
			// sc.close();
			
			Product p = new PhysicalProduct(product,price,category,weight);
			double discount = sc.nextDouble();
			PhysicalProduct pp = (PhysicalProduct)p;
			if(discount<=0){
				IO.println();
				System.exit(0);
			}
			p.display();
			IO.println("Discount : "+p.applyDiscount(discount));
			IO.println("New Price : "+(p.getPrice() - p.applyDiscount(discount)));
			IO.println("Tax : "+(p.getPrice() - p.applyDiscount(discount))*0.08);
		    IO.println("Shipping Cost : "+pp.calculateShippingCost());
		}
			default -> IO.println("Invalid Input");
		};

		
	}
}

 abstract class Product{
	private String name;
	private double price;
	private String category;
	
	public Product(String name, double price, String category) {
		super();
		this.name = name;
		if(price<=0){
			IO.println("Error Invalid Input.");
			System.exit(0);
		}
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
  double discount=getPrice()*(percentage/100);
	// double newPrice=getPrice()-discount;
	// 	setPrice(newPrice);
	// 	IO.println(discount);
		return discount;
	}
	
	
	
	public  double calculateTax() {
		return (this.applyDiscount(5));
	}

	public void display() {
		IO.println("Digital Product:");
		IO.println("Product Name : "+this.getName());
		IO.println("Category : "+this.getCategory());
		IO.println("Price : "+this.getPrice());
		IO.println("License Key : "+this.getLicenseKey());
		// IO.println("Discount : "+this.applyDiscount(discount));
		// IO.println("New Price : "+(this.getPrice() - this.applyDiscount(discount)));
		// IO.println("Tax : "+(this.getPrice() - this.applyDiscount(discount))*0.05);
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
	
	public void display() {
		IO.println("Physical Product:");
		IO.println("Product Name : "+this.getName());
		IO.println("Category : "+this.getCategory());
		IO.println("Price : "+this.getPrice());
		IO.println("Shipping Weight : "+this.getShippingWeight()+" KG");
		// IO.println("Discount : "+this.applyDiscount(discount));
		// IO.println("New Price : "+(this.getPrice() - this.applyDiscount(discount)));
		// IO.println("Tax : "+(this.getPrice() - this.applyDiscount(discount))*0.08);
		// IO.println("Shopping Cost : "+this.calculateShippingCost());
		//		
	}
	 
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 */
 
 
 
 
 
 
 
 
 
 
 
 
 
 
