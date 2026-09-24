import java.util.*;
//import java.util.Exception;

public class Main {

    

    public static void main(String[] args) {
        // Write your code here

       double payment = 0;
        String paymentMethod = null;
        double totalAmount = 0;

        Scanner sc =  new Scanner(System.in);

       try
       {
        payment  = sc.nextDouble();
        if(payment <= 0)
        {
            IO.println("Error: Unexpected error occurred. ");
            IO.println("Thank you for shopping with Flipkart!");
            System.exit(0);

        }
        sc.nextLine();
        paymentMethod = sc.nextLine();

        switch (paymentMethod)
        {
            case "CARD" -> 
            {
               // totalAmount = ;
                 IO.println("Flipkart Payment Summary ");
            IO.println("------------------------");
            IO.println("Payment Method: "+paymentMethod);
            IO.println("Payment Amount: "+payment);
            IO.println("Discount Applied: 0.0" );
            IO.println("Final Amount Paid: "+(payment - (payment*0.05)));
            IO.println("Payment Status: SUCCESS ");

            }
            case "UPI" -> 
            {
                //totalAmount = payment - (payment*0.10);

                 IO.println("Flipkart Payment Summary ");
            IO.println("------------------------");
            IO.println("Payment Method: "+paymentMethod);
            IO.println("Payment Amount: "+payment);
            IO.println("Discount Applied: 0.0" );
            IO.println("Final Amount Paid: "+(payment - (payment*0.05)));
            IO.println("Payment Status: SUCCESS ");

            }
            case "NETBANKING" -> 
            {
               // totalAmount = payment - (payment*0.05);

                IO.println("Flipkart Payment Summary ");
            IO.println("------------------------");
            IO.println("Payment Method: "+paymentMethod);
            IO.println("Payment Amount: "+payment);
            IO.println("Discount Applied: 0.0" );
            IO.println("Final Amount Paid: "+payment);
            IO.println("Payment Status: SUCCESS ");

            }
            default ->
            {
                IO.println("Error: Invalid payment method. ");
            }
        }


       }

       catch(InputMismatchException e)
       {
            IO.println("Error: Invalid payment method. ");
            IO.println("Thank you for shopping with Flipkart!");
       }

       catch(IllegalArgumentException e)
       {
            //IO.println("Error: Unexpected error occurred. ");
            IO.println("Thank you for shopping with Flipkart!");
       }

       catch(ArithmeticException e)
        {

        }

        catch(Exception e)
        {

        }

        finally
        {
            sc.close();
            IO.println("Thank you for shopping with Flipkart!");
        }
           
            
        
    }
}


