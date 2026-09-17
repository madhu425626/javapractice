import java.util.*;

public class interfaceDemo4 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
    
    int input1 = sc.nextInt();
    int input2 = sc.nextInt();


    CalcApp calculation  = new CalcApp();
    int result = calculation.calculate(input1,input2);
    System.out.println("Result = "+result);
    
    }

    
}


interface CalculationService
{
    default int calculate(int a, int b)
    {
        return add(a,b);
    }
    private int add(int a, int b)
    {
        return a+b;
    }
}

class CalcApp implements CalculationService
{

}
