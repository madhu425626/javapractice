
public class EmployeeMain {
    public static void main(String []args){
        Employee employee = new Employee();
        
        String firstName = IO.readln();
        String lastName = IO.readln();
        int id = Integer.parseInt(IO.readln());
        double salary = Double.parseDouble(IO.readln());
        int projects = Integer.parseInt(IO.readln());
       
        employee.setEmployeeData(firstName,lastName,id,salary,projects);
        IO.println("Employee [firstName="+employee.employeeFirstName+", lastName="+employee.employeeLastName+", employeeId="+employee.employeeId+", salary="+employee.employeeSalary+", noOfProject="+employee.noOfProjects+"]");

    }
}

class Employee {
    String employeeFirstName;
    String employeeLastName;
    int employeeId;
    double employeeSalary;
    int noOfProjects;

    public void setEmployeeData(String firstName, String lastName, int id, double salary,int projects){
        employeeFirstName = firstName;
        employeeLastName = lastName;
        employeeId = id;
        employeeSalary = salary;
        noOfProjects = projects;

        getNoOfProjects(noOfProjects);

    }
    public void getNoOfProjects(int projects){
        if (projects>5 && projects<10){
            employeeSalary += 5000;
        }else if(projects>10 && projects<20){
            employeeSalary += 10000;
        }else {
            employeeSalary += 15000;
        }
    }


}
