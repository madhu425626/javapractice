import java.util.*;

public class Main {

    
        public static int devide(int a, int b)
        {
            if(b==0)
            {
                throw new DivisionByZero();
            }
            return a/b;
        }
        
    public static void main(String[] args) {
        // Write your code here


        Scanner sc = new Scanner(System.in);
        try
        {
        int a = sc.nextInt();
        int b = sc.nextInt();

        IO.println("Result: "+devide(a,b));

        
        }
        catch(DivisionByZero e)
        {   
            
            IO.println(e.getLocalizedMessage());
        }
        


    }
}

class DivisionByZero extends ArithmeticException 
{
    public String getLocalizedMessage()
    {
        return "Error: Division by zero!";
    }
}
