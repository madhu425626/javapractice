package com.mahu.staticfactorymethod;

public class StudentMain {
	public static void main(String[] args) {
		
		while(true) {
		String name = IO.readln("Enter name: ");
		int age = Integer.parseInt(IO.readln("Enter Age: "));
		String grade = IO.readln("Enter grade: ");	
		
		Student obj = Student.getDetails(name, age, grade);
		IO.println(obj);
		
		String decision = IO.readln("Do you want to Create new Student:[Yes/No]:");
		
		if(decision.equalsIgnoreCase("yes")) {
			continue;
		}
		IO.println("Thank You. Have A Nice Day...😊");
		System.exit(0);
		}
	}

}

class Student{
	private String name;
	private int age;
	private String grade;
	
	private Student(String name, int age, String grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
	}

	
	//Static factory method
	public static Student getDetails(String name, int age, String grade) {
		Student obj = new Student(name,age,grade);
		return obj;
	}
	
}
