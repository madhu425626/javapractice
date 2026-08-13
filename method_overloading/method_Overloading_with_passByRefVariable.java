package com.madhu.methodoverloadingobj;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee(1,"a",50000,9,9);
		Manager m = new Manager(1,"a",50000,9,9,9);
		Trainer t = new Trainer(1,"a",50000,9,9,9,9);
		Sourcing s = new Sourcing(1,"a",50000,9,9,9,9,9);
		IO.println(TaxUtil.calculateTax(e));
		IO.println(TaxUtil.calculateTax(m));
		IO.println(TaxUtil.calculateTax(t));
		IO.println(TaxUtil.calculateTax(s));

	
	}

}

class Employee{
	private int id;
	private String name;
	private double salary;
	private double 	hra;
	private double daper;
	
	
	
	

	
	public Employee(int id, String name, double salary, double hra, double daper) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.hra = hra;
		this.daper = daper;
	}






	public double calculateGrossSalary() {
		return this.salary + this.hra + this.daper;
	}
	
	
}


class Manager{
	private int manId;
	private String manName;
	private double manSalary;
	private double manHra;
	private double manDaper;
	double allowance;
	
	
	
	public Manager(int manId, String manName, double manSalary, double manHra, double manDaper, double allowance) {
		super();
		this.manId = manId;
		this.manName = manName;
		this.manSalary = manSalary;
		this.manHra = manHra;
		this.manDaper = manDaper;
		this.allowance = allowance;
	}



	public double calculateGrossSalary() {
		return this.manSalary + this.manHra + this.manDaper + this.allowance;
	}
}

class Trainer{
	private int tId;
	private String tName;
	private double tSalary;
	private double tHra;
	private double tDaper;
	private int bCount;
	private double pbCount;
	
	
	
	public Trainer(int tId, String tName, double tSalary, double tHra, double tDaper, int bCount, double pbCount) {
		super();
		this.tId = tId;
		this.tName = tName;
		this.tSalary = tSalary;
		this.tHra = tHra;
		this.tDaper = tDaper;
		this.bCount = bCount;
		this.pbCount = pbCount;
	}



	public double calculateGrossSalary() {
		return this.tSalary + this.tHra + this.tDaper + (this.bCount*this.pbCount);
	}
}


class Sourcing{
	private int sId;
	private String sName;
	private double sSalary;
	private double 	sHra;
	private double sDaper;
	private int et;
	private int er;
	private double pe;
	
	

	
	public Sourcing(int sId, String sName, double sSalary, double sHra, double sDaper, int et, int er, double pe) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sSalary = sSalary;
		this.sHra = sHra;
		this.sDaper = sDaper;
		this.et = et;
		this.er = er;
		this.pe = pe;
	}




	public double calculateGrossSalary() {
		return this.sSalary + this.sHra + this.sDaper+(((this.er/this.et)*100)*this.pe);
	}
	
	
}


class TaxUtil
{
	public static double calculateTax(Employee e)
	{
		double tax=0.0;
		if(e.calculateGrossSalary() > 50000)
		{
			tax = e.calculateGrossSalary()*0.20;
		}
		else
		{
			tax = e.calculateGrossSalary()*0.05;
		}
		return tax;
	}
	
	
	public static double calculateTax(Manager m)
	{
		double tax=0.0;
		if(m.calculateGrossSalary() > 50000)
		{
			tax = m.calculateGrossSalary()*0.20;
		}
		else
		{
			tax = m.calculateGrossSalary()*0.05;
		}
		return tax;
	}
	
	public static double calculateTax(Trainer m)
	{
		double tax=0.0;
		if(m.calculateGrossSalary() > 50000)
		{
			tax = m.calculateGrossSalary()*0.20;
		}
		else
		{
			tax = m.calculateGrossSalary()*0.05;
		}
		return tax;
	}
	
	public static double calculateTax(Sourcing m)
	{
		double tax=0.0;
		if(m.calculateGrossSalary() > 50000)
		{
			tax = m.calculateGrossSalary()*0.20;
		}
		else
		{
			tax = m.calculateGrossSalary()*0.05;
		}
		return tax;
	}
}











