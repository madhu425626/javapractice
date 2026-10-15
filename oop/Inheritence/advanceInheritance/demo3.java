import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        String name = IO.readln();
        double salary = Double.parseDouble(IO.readln());
        String project = IO.readln();

        juniour j = new juniour(project,salary,name);
        j.display();
    }
}

class Employee {
    String name;

    Employee(String name)
    {
        this.name = name;
    }

}

class intern extends Employee
{
    double salary;
    intern(double salary, String name)
    {
        super(name);
        this.salary = salary;
    }
}

class juniour extends intern
{
    String project;

    juniour(String project,double salary,String name)
    {
        super(salary,name);
        this.project = project;
    }


    void display()
    {
        IO.println("Junior Intern Name: "+name +"\nSalary: "+salary +" Assigned Project: "+project);
    }
}
