import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int choise  = sc.nextInt();
        switch(choise){
            case 1 -> {
                sc.nextLine();
                String brand = sc.nextLine();
                Laptop l = new Laptop(brand);
                IO.println("Laptop Details:");
                IO.println("Brand: "+l.brand);

            }

            case 2 -> {
                sc. nextLine();
                 String brand = sc.nextLine();
                 //nextLine();
                 String gpu = sc.nextLine();
                 GamingLaptop g = new GamingLaptop(brand,gpu);
                 IO.println("Gaming Laptop Details:");
                IO.println("Brand: "+g.brand);
                IO.println("GPU: "+g.gpu);
            }

            default -> IO.println("Invalid Choice");
        }

    }
}

class Laptop{
    String brand;
    Laptop (String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return this.brand;
    }
}

class GamingLaptop extends Laptop{
    String gpu;
    GamingLaptop(String brand,String gpu){
        super(brand);
        this.gpu = gpu;
    }
}
