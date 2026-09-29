import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        try(sc)
        {
            votingEligibility(age);
        }

        catch(IllegalArgumentException e)
        {
            IO.println("Not eligible for voting");
        }
    }

    public static void votingEligibility(int age)
    {
        if(age < 18)
        {
            throw new IllegalArgumentException();
        }
        else
        {
            IO.println("Eligible for voting");
        }
    }   
}
___________________________________________________________________________________
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        try(sc)
        {
            isPasswordValid(password);
        }
        catch(IllegalArgumentException e)
        {
            IO.println("Password length must be at least 6 characters");
        }
    }

    public static void isPasswordValid(String password) throws IllegalArgumentException
    {
        if(password.length() < 6 )
        {
            throw new IllegalArgumentException();

            
        }
         else
         {
            IO.println("Password accepted");
         }
    }
}
_____________________________________________________________________________________import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(); 
        try(sc)
        {
            numberCheck(number);
        }
        catch(Exception e)
        {
           // IO.println(e.getMessage());
        }
    }

    public static void numberCheck(int num) throws numberCheck

    {
        if(num > 0)
        {
            IO.println("Valid positive number");
        }else if(num==0){
            throw new numberCheck("Zero is not a positive number");
        }
        else
        {
            throw new numberCheck("Negative numbers not allowed");
        }
    }
}

class numberCheck extends Exception
{
   
    public numberCheck(String message)
    {
        IO.println(message);
    }
}
_____________________________________________________________________________________
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int balance = sc.nextInt();
        int amount = sc.nextInt();

        try(sc)
        {
            withdrawAmount(amount,balance);
        }
        catch(customeException e)
        {
            IO.println(e.getMessage());
        }
    }

    public static void withdrawAmount(int amount,int balance) throws customeException
    {
        if(amount <= 0 || balance <= 0)
        {
            throw new customeException("Invalid withdrawal amount ");
        }else if(amount > balance)
        {

            throw new customeException("Insufficient balance");
            
        }
        else{
            IO.println("Withdrawal successful. Balance: "+(balance-amount));
            //IO.println("Balance: "+);
        }
    }
}

class customeException extends Exception
{
    public customeException(String message)
    {
        super(message);
    }
}
_____________________________________________________________________________________
