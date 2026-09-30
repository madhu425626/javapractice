import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc  =  new Scanner(System.in);

        try(sc)
        {
        int x = sc.nextInt();
        int y = sc.nextInt();
        IO.println("Result: "+division(x,y));

        }
        catch(ArithmeticException e)
        {
            IO.println("Cannot divide by zero");
        }
        catch(InputMismatchException e)
        {
            IO.println("Invalid input type");

        }
    }

    public static int division(int a, int b)
    {
        return a/b;
    }
}
______________________________________________________________________________


import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc  =  new Scanner(System.in);
        try(sc){

        int sizeOfArray = sc.nextInt();
        int []arr = new int[sizeOfArray]; 

        for(int i = 0; i<sizeOfArray; i++)
        {
            arr[i] = sc.nextInt();
        }
        int arrayIndex = sc.nextInt();
        IO.println("Element at index "+arrayIndex+": "+arr[arrayIndex]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            IO.println("Index out of range");
        }
        catch(InputMismatchException e)
        {
            IO.println("Invalid input type");

        }

    }
}
___________________________________________________________________________________



import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc  =  new Scanner(System.in);
        try(sc)
        {
        int balance = sc.nextInt();
        int withdraw = sc.nextInt();

        if(withdraw > balance)
        {
            throw new ArithmeticException();
        }
        IO.println("Remaining balance: "+(balance-withdraw));
        
        }

        catch(ArithmeticException e)
        {
            IO.println("Insufficient funds");  
        }
        catch(InputMismatchException e)
        {
            IO.println("Invalid input type");  

        }
        catch(NullPointerException e)
        {
            IO.println("NullPointerException");
        }
        catch(Exception e)
        {
            IO.println("General Exception");
        }

 
    }
}
____________________________________________________________________________________--


import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc  =  new Scanner(System.in);
        try(sc)
        {
            int work = sc.nextInt();
            if(work >= 100)
            {
                IO.println("Party wins the election");
            }
            else
            {
                throw new ArithmeticException("Party loses due to insufficient work");
            }
        }
        catch(ArithmeticException e)
        
        {
            IO.println(e.getMessage());
        }
        catch(InputMismatchException e)
        {
            IO.println("Invalid input type");

        }
    }
}
___________________________________________________________________________________


import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
    Scanner sc  =  new Scanner(System.in);
    try(sc)
    {
        String dataBaseName = sc.nextLine();

        if(dataBaseName.length() != 0)
        {
            IO.println("Database connected successfully");
        }
        else
        {
            throw new DatabaseNotConnectedException("Database not connected");
        }
    }
    catch(DatabaseNotConnectedException e)
    {
        IO.println(e.getMessage());
    }
    }
}

class DatabaseNotConnectedException extends Exception
{
   //static String  dataBaseName ="employeeDB";

    DatabaseNotConnectedException(String message)
    {
        super(message);
    }
}
_____________________________________________________________________________________

