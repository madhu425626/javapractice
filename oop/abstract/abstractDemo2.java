import java.util.*;

public class abstractDemo2 {
    public static void main(String[] args)
    {
        // Write your code here
       // IO.println("hi");

        int choise = Integer.parseInt(IO.readln());
         
        switch(choise)
        {
            case 1 ->
            {
                String name = IO.readln();
                double sal = Double.parseDouble(IO.readln());
                double alowance = Double.parseDouble(IO.readln());

                Employee p = new PermanentEmployee(name,sal,alowance);
                p.displayIngo();
                p.calculateSalary();
                
            }

            case 2 ->
            {
                 String name = IO.readln();
                double hourlyRate = Double.parseDouble(IO.readln());
                double hoursWorked = Double.parseDouble(IO.readln());

                Employee c = new ContractEmoloyee(name,hourlyRate,hoursWorked);

                c.displayIngo();
                c.calculateSalary();
            }

            default ->
            {
                IO.println("Invalid choice!");
            }
        }
               
    }
}

 abstract class Employee
{
    String name;

    Employee(String name)
    {
        this.name = name;
    }

    public abstract void calculateSalary();

    public void  displayIngo(){

        IO.println("Employee Details:");
        IO.println("Employee Name: "+name);
    }
}


class PermanentEmployee extends Employee
{
    double sal;
    double allowances;

    PermanentEmployee(String name, double sal, double allowances){
        super(name);
        this.sal = sal;
        this.allowances = allowances;
    }

    public void calculateSalary()
    {

        IO.println("Salary: "+(this.sal + this.allowances));

    }
}

class ContractEmoloyee extends Employee
{

    double hourlyRate;
    double hoursWorked;

    ContractEmoloyee(String name,double hourlyRate, double hoursWorked)
    {
        super(name);

        this.hourlyRate = hourlyRate;
        this.hoursWorked  = hoursWorked;

    }

   public void calculateSalary()
   {

    IO.println("Salary: "+this.hourlyRate*this.hoursWorked);

    }
   
    
}



