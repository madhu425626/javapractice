import java.util.*;

public class EmployeeMain {
    public static void main(String[] args) {
        // Write your code here
        String name = IO.readln();
        int id = Integer.parseInt(IO.readln());
        
        Employee e = new Employee(name,id);
        IO.println("EmployeeID: "+e.id+" Name: "+e.name);

        Employee e2 = new Employee(e);
        IO.println("EmployeeID: "+e2.id+" Name: "+e2.name);

        
    }
}

class Employee{
    String name;
    int id;

    public Employee(String name, int id){
        this.name = name;
        if(id<=0){
            IO.println("Invalid employee ID");
            System.exit(0);
        }
        this.id = id;
    }
    public Employee(Employee e){
        this.name = e.name;
        this.id = e.id;
    }
}
