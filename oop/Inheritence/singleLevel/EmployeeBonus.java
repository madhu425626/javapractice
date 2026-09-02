
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int choise = (sc.nextInt());
        switch(choise){
            case 1 ->{
                double salary = (sc.nextDouble());
                Employee e  = new Employee(salary);
                IO.println("Employee Salary: "+e.getSalary());
                //IO.println(e.getSalary(salary));
            }
            case 2 ->{
                double salary = (sc.nextDouble());
                double percent = sc.nextInt();
                Manager e  = new Manager(salary);
                //IO.println(e.getSalary());
                IO.println("Manager Salary: "+e.getSalary());
                IO.println("Manager Bonus at "+percent+"%: "+e.calculateBonus(percent));
            }
            default -> IO.println("Invalid Choice");
        }
        sc.close();
        
    }
}
class Employee {
    private double salary;

    public Employee(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return this.salary;
    }
}

class Manager extends Employee{
  public Manager(double salary){
    super(salary);
  }
    public double calculateBonus(double percent){
       return getSalary()*(percent/100);
    }
}
