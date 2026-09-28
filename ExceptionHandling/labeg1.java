import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        
            String str = IO.readln();
        try
        {
            Class.forName(str);
            IO.println("Class loaded successfully: "+str);
        }
        catch(ClassNotFoundException e)
        {
            
            IO.println("ClassNotFoundException: "+str);
        }
    }
}

----------------------------------------------------------------------------------

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here

        try
        {

        String str = IO.readln();
        //IO.println(str);
        if(str.equals("yes"))
        {

        int arraySize = 0;
        int indexPosition = Integer.parseInt(IO.readln());
        int [] arrayName = new int[arraySize];
        IO.println(arrayName[indexPosition]);
        }
        else
        {
        int arraySize = Integer.parseInt(IO.readln().trim());
        int indexPosition = Integer.parseInt(IO.readln().trim());
        int arrayValue = Integer.parseInt(IO.readln().trim());
        int [] arrayName = new int[arraySize];
        arrayName[indexPosition] = arrayValue;

        IO.println("Element updated successfully at index "+indexPosition+": "+arrayValue);
        //IO.println(arrayName[indexPosition]);

        }




        }

        catch(NullPointerException e)
        {
            IO.println("NullPointerException occurred!");
            e.printStackTrace();
        }

        catch(Exception e)
        {
            IO.println("General Exception"+e);
            e.printStackTrace();
        }

    }
}

---------------------------------------------------------------------------------
import java.util.*;

public class ClassNotFoundExpDemo {

    ClassNotFoundExpDemo c;

    ClassNotFoundExpDemo(String str)
    {

    }
    public static void main(String[] args) {
        // Write your code here
       try
       {

        String str = IO.readln();
        Class.forName(str);
        IO.println("Class "+str+" found: "+str);
       }
       catch(ClassNotFoundException e)
       {
        IO.println("Class mypackage.MyClass not found.");
       }
    }
}

------------------------------------------------------------------------------------
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
            int divisor = Integer.parseInt(IO.readln());
            int dividend = Integer.parseInt(IO.readln());
            //int result = 0;
        try
        {   
            //result = dividend/divisor
            IO.println("Result: "+divisor+" / "+dividend+" = "+(divisor/dividend));
        }
        catch (ArithmeticException e)
        {
            IO.println("ArithmeticException: "+e.getMessage());
        }
    }
}
-------____________________________________________________________________________
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        Main M = new Main();
        try
        {
        int a = Integer.parseInt(IO.readln());
        int b = Integer.parseInt(IO.readln());
            IO.println(M.devide(a,b));
            IO.println(M.sqrt(a));
        }
        catch(ArithmeticException  | IllegalArgumentException e)
        {
            IO.println("Cannot divide by zero");
        }

        catch(Exception e)
        {
            IO.println("General Exception "+e);
        }

    }
        public int devide(int a, int b)
        {
            return a/b;
        }

        public double sqrt(double a)
        {
            if(a < 0)
            {
                IO.println("Cannot calculate square root of negative number");
                System.exit(0);
            }
            return Math.sqrt(a);
        }
}

