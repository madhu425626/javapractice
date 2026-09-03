import java.util.*;

public class PaymentMethOverloding {
    public static void main(String[] args) {
        // Write your code here
        int noOfPayments = Integer.parseInt(IO.readln().trim());
        for(int i = 0; i< noOfPayments; i++){
        int choice = Integer.parseInt(IO.readln().trim());
        switch (choice){
            case 1:
            {   
                CreditCardPayment c = new CreditCardPayment();
                c.processPayment();
                break;
            }

            case 2:
            {   
                DebitCardPayment d = new DebitCardPayment();
                d.processPayment();
                break;
            }

            case 3:
            {
                UPI u = new UPI();
                u.processPayment();
                break;
            }

            default:
            {
                IO.println("Invalid Payment Type");
                System.exit(0);
               // break;

            }
        }
        }
       
           
        
    }
}

class Payment{

public void processPayment(){

IO.println("Processing Payment");

}
}

class  CreditCardPayment extends Payment{


public void processPayment(){
    IO.println("Processing Credit Card Payment");
}
}

class  DebitCardPayment extends Payment{


public void processPayment(){
    IO.println("Processing Debit Card Payment");
}
}


class UPI extends Payment{


public void processPayment(){
    IO.println("Processing UPI Payment");
}
}
