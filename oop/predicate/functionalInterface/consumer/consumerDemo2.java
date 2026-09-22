//package com.madhu.functionalInterfaceConsumer;
import java.util.function.*;

record Product(Integer id, String name, Double price) {
	
	
}

public class ConsumerDemo1
{
	void main()
	{
    
		IO.println("hi");
		Consumer<Product> c1 = prod ->
		{
			IO.println("Product Id : "+prod.id());
			IO.println("Product Name : "+prod.name());
			IO.println("Product Price : "+prod.price());

		};
		Product p = new Product(101,"Laptop",99999D);
		c1.accept(p);
    

    

	}
}


