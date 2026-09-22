import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        Consumer<Employee> companyEmployees = emp -> IO.println("Hello "+emp.name+" from "+emp.dept+" department!");
        int ch = Integer.parseInt(IO.readln().trim());

        for(int i = 1; i<=ch; i++){
        String empName = IO.readln(); 
        String empDepartment = IO.readln();
        Employee companyEmployee = new Employee(empName,empDepartment); 
        companyEmployees.accept(companyEmployee);
        }



    }
}

class Employee
{
    String name;
    String dept;

    Employee(String name, String dept)
    {
        this.name = name;
        this.dept = dept;
    }
}
