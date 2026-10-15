import java.util.*;

public class Main {
   
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        sc.nextLine();
        
        switch(ch)
        {
            case 1 ->
            {   
                
                String employeeName = sc.nextLine();
                //sc.nextLine();
                int basicSalary = sc.nextInt();
              // sc.nextLine();
                int projectBonus = sc.nextInt();

          Employee e = new Developer(employeeName,basicSalary,projectBonus);
                IO.println("Final Salary: "+e.calculateSalary());    
            }    
            case 2 ->
            {   
                
                String employeeName = sc.nextLine();
                //sc.nextLine();
                int basicSalary = sc.nextInt();
               // sc.nextLine();
                int projectBonus = sc.nextInt();
                sc.close();
                Employee e = new Tester(employeeName,basicSalary,projectBonus);  
                IO.println("Final Salary: "+e.calculateSalary());    
  
            }  
            default -> IO.println("Final Salary: ");  
        }
    }
}

class Employee
{
    String employeeName;
    double basicSalary;

    public Employee(String employeeName,double basicSalary)
    {
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    double calculateSalary()
    {
        return basicSalary;
    }
}

class Developer extends Employee
{
    double projectBonus;

    public Developer(String employeeName,double basicSalary,double projectBonus)
    {
        super(employeeName,basicSalary);
        this.projectBonus = projectBonus;
    }

    double calculateSalary()
    {
        return basicSalary+projectBonus;
    }
}

class Tester extends Employee
{
    double testingAllowance;

    public Tester(String employeeName,double basicSalary,double testingAllowance)
    {
        super( employeeName, basicSalary);
        this.testingAllowance = testingAllowance;
    }

    double calculateSalary()
    {
        return basicSalary+testingAllowance;
    }

}

