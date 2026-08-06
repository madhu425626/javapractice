package com.mahu.staticfactorymethod;

public class EmployeeMain {

	public static void main(String[] args) {
		
		while(true) {
		
		int countOfEmployee = Integer.parseInt(IO.readln("How many employees do you want to create?"));
		
		for(int i = 1; i<= countOfEmployee; i++) {
			IO.println("Enter details for Employee "+i+":");
		   int id = Integer.parseInt(IO.readln("Enter Employee ID: "));
			String name = IO.readln("Enter Employee Name: ");
			String department = IO.readln("Enter your choise... : [Sales/Engineering/HR/Other]").toUpperCase();
			double salary = Double.parseDouble(IO.readln("Enter Monthly Salary: "));
			
		
			Employee e = Employee.getEmployeeObj(name,id,department,salary);
			
			IO.println("before Salary Update : "+e); // printing to string
			

			e.toString(); //calling 
			e.calculateAnnualSalary();
			

			IO.println("After Update"+e);
			
			

			
	//	IO.println("--- Employee Details ---");
		
		

	}
		
		String choise = IO.readln("Do you want to continue...[Yes/no]");
		if(choise.equalsIgnoreCase("no")) {
			System.exit(0);			}
		
	}
	}

	
	}



class Employee{
	private String name;
	private int id;
	private String department;
	private double salary;
	private Employee(String name, int id, String department, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.department = department;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", department=" + department + ", salary=" + salary + "]";
	}
	public static Employee getEmployeeObj(String name, int id, String department, double salary) {
		
		Employee obj = new Employee(name,id, department,salary);
		return obj;
		
		//return (new Employee(name,id, department,salary);
	}
	
	public double calculateAnnualSalary() {
	
				
		switch (this.department) {
		case "SALES" -> this.salary += salary*0.10;
		case "ENGINEERING" -> this.salary += salary*0.15;
		case "HR" -> this.salary += salary*0.08;
		default -> this.salary += salary*0.05;
		
		
		
		}
		
		return this.salary;
	};
}
