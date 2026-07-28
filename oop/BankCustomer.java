package com.madhu.bank.elc;

public class MainBank {

	public static void main(String[] args) {
	Customer scoot = new Customer();
	
	int id           = Integer.parseInt(IO.readln("Enter customer Id :"));
	long accNum      = Long.parseLong(IO.readln("Enter customer AccNum :"));
	String name      = IO.readln("Enter customer Name :");
	int balance      = Integer.parseInt(IO.readln("Enter Amount :"));
	
	scoot.setCustomerDetails(id, accNum, name, balance);
	scoot.getCustomerDetails();	
	
		
	}

}


class Customer{
	int customerId;
	long customerAccNum;
	String customerName;
	int customerBalance;
	
	String branchName = "Ameetpet";
	String branchIfscCode = "AMPT3693";
	
	public void setCustomerDetails(int id, long accNum, String name, int balance) {
		customerId = id;
		customerAccNum = accNum;
		customerName = name;
		customerBalance = balance;
	}
	
	public void getCustomerDetails() {
		IO.println("------------Customer Details are-----------");
		IO.println("Customer Id IS :"+customerId);
		IO.println("Customer Acc Num Is:"+customerAccNum);
		IO.println("Customer Name is : "+customerName);
		IO.println("Customer Bank Balance is :"+customerBalance);
		IO.println("Customer Bank Branch is at : "+branchName);
		IO.println("Customer Ifsc Code Is : "+branchIfscCode);
	}
}
