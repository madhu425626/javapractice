import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here

       double custSalary =  Integer.parseInt(IO.readln());
       int custCibil =  Integer.parseInt(IO.readln());
       double custLoan = Integer.parseInt(IO.readln());
       double custTenure = Integer.parseInt(IO.readln());

       Loan customerLoan = (salary,cbill,amount,tenure) ->
       {
            if(salary > salary/2 && cbill >= 600 && amount >= 100000 )
            {
                return true;
            }
            else 
            {
                return false;
            }
       };

       if(customerLoan.isLoanApproved(custSalary,custCibil,custLoan,custTenure))
       {
        IO.println("Loan Approved");
        IO.println("EMI: "+custLoan/custTenure);
        IO.println("Risk Level: Low Risk");
       }

       else{
        IO.println("Loan Not Approver");

       }

    }
}

interface Loan
{
    boolean isLoanApproved(double sal,int cbill, double amount, double tenure);
}
