import java.util.*;

public class CalculateEmployeeDisignation {
    public static void main(String[] args) {
        // Write your code here

        int num = Integer.parseInt(IO.readln());
        String name = IO.readln();
        double salary = Double.parseDouble(IO.readln());
        double increment = Double.parseDouble(IO.readln());
        Employee  e = new Employee(num,name,salary);
        IO.println("Employee Details : ");
        e.display();
        e.setSalary(increment);
        IO.println("\nUpdated Employee Details : ");
        e.display();
        IO.println("\n"+e.getName()+e.getEmployeeDesignation(e.getSalary()));

        
    }
}

class Employee{
    private int num;
    private String name;
    private double salary;

    public Employee(int num, String name, double salary){
        this.name = name;
        this.num = num;
        this.salary = salary;
    }

    public String getEmployeeDesignation(double salary){
        if(salary>=120000){
            return " is a HR Manager.";
        }
        else if(salary>=90000){
            return " is a Developer.";
        }
        else if(salary>=60000){
            return " is a Designer.";
        }
        
         return " is a HR Tester.";
        
    }

    public void setSalary(double increment){
        this.salary += increment;
    }

    public double getSalary(){
        return this.salary;
    }

    public String getName(){
        return this.name;
    }

    public int getNum(){
        return this.num;
    }

    public void display(){
        IO.println("Employee Number : "+getNum());
        IO.println("Employee Name   : "+getName());
        IO.println("Employee Salary : "+getSalary());
    }
}
