import java.util.*;

public class anonymousClassDemo3 {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num <= 0)
        {
            IO.println("Error: Invalid bill amount");
            System.exit(0);
        }

        TipCalculator tip = new TipCalculator()
        {
            public double calculateTip(double num)
            {

                return num*0.10;
            }
        };
       IO.println("Tip Amount: "+tip.calculateTip(num));
    }
}

interface TipCalculator
{
    double calculateTip(double billAmount);
    
    
}
