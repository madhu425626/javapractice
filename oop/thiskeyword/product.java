public class ProductDemo{
    public static void main(String[] args){
        Product product = new Product();

        int productId = Integer.parseInt(IO.readln());
        String productName = IO.readln();
        double productPrice = Double.parseDouble(IO.readln());

        product.setProductDetails(productId,productName,productPrice);
        
        IO.println("----- Product Details -----");
        product.calculateDiscount();
       /*  IO.println("[productId="+product.id+", productName="+product.name+",productPrice="+product.price+"]");
        IO.println("Discount Amount: "+discoint);*/
        
    }
}


class Product{
    int id;
    String name;
    double price;

    public void setProductDetails(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;

    }

    public void calculateDiscount(){
        double totalBill;
        if(price<1000){
            IO.println("Product [productId="+id+", productName="+name+", productPrice="+price+"]");
            IO.println("Discount Amount: "+(price*0.05));
            IO.println("Price After Discount: "+(price - (price*0.05)));
        }
        else if(price>1000  && price<=5000){
            IO.println("Product [productId="+id+", productName="+name+", productPrice="+price+"]");
            IO.println("Discount Amount: "+(price*0.10));
            IO.println("Price After Discount: "+(price - (price*0.10)));
        }
        else if(price>5000){
            IO.println("Product [productId="+id+", productName="+name+", productPrice="+price+"]");
            IO.println("Discount Amount: "+(price*0.15));
            IO.println("Price After Discount: "+(price - (price*0.15)));
        }
            /*
            totalBill = price-(price*0.05);
        }else if(price>= 1000 && price<=5000){
            totalBill = price - (price*0.10);
        }else{
            totalBill = price - (price*0.15); */
        }
    }

    




