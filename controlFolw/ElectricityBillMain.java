import java.util.*;

public class ElectricityBillMain {
    public static void main(String[] args) {
        // Write your code here
        double x = Double.parseDouble(IO.readln());

        if(x <= 100){
            IO.println("Final Electricity Bill = "+ (x*1.5));                      //100
        }
        if(x>100 && x <= 300){
            IO.println("Final Electricity Bill = "+ ((x-100)*2.5 +150));               //300
        }
        if(x > 300 && x <= 500){
            IO.println("Final Electricity Bill = "+ ((x-300)*4 + 500 + 150));           //500   
        }
        if(x > 500){
            IO.println("Final Electricity Bill = "+ ((x-500)*6 + 800 + 500 + 150));    //600
        }
    }
}
