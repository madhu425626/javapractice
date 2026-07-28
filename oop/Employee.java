package com.madhu.employee.elc;


/*
 * Program 02:
-----------
Format :
---------
EmployeeDemo.java (File name)
----------------------------
//ELC
public class EmployeeDemo
{
   void main()
    {
    }
}

//BLC
class Employee
{
   //Properties
        +
   //Behaviour 
}

Write a Program on OOPs to define Employee class properties and behaviour.

properties/Field/Attribute :

employeeId : int
employeeName : String
employeeSalary : double

Initialize these properties with the help of method using parameter variable.

behavior/Method:
setEmployeeData(int id, String name, double salary) : public void
getEmployeeData() : public void

  */

//file name  : MainEmployee
public class MainEmployee {

	public static void main(String[] args) {
		// TEmployeODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setEmployeeData(369, "Ravi", 90000);
		employee.getEmployeeData();
		

	}

}


//---------------------------------------------------------Blc------------------------------
//file name : Employee
class Employee{
	int employeeId;
	String employeeName;
	double employeeSalary;
	
	public void setEmployeeData(int id, String name, double salary) {
		
		employeeId = id;
		employeeName = name;
		employeeSalary = salary;
		
	}
	
	public void getEmployeeData() {
		IO.println(employeeId);
		IO.println(employeeName);
		IO.println(employeeSalary);
	}
	
	
}
