import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
       try
       {
        Scanner sc =  new Scanner(System.in);
        int totalMarks = sc.nextInt();
        int noOfSubjects = sc.nextInt();
        if(noOfSubjects == 0)
        {
            throw new ArithmeticException();
        }
        IO.println("Average Marks: "+(totalMarks/noOfSubjects));
       }
       catch(InputMismatchException e)
       {
            IO.println("Enter a valid input");
       }
       catch(ArithmeticException e)
       {
        IO.println("Cannot divide by zero");
       }
       catch(Exception e)
       {
        IO.println("General problem "+e);
       }
       finally
       {
        IO.println("Calculation Completed.");
       }

        
    }
}
/*
class StudentMarks
{
    public double calculateAvg()
    {

    }
}*/
