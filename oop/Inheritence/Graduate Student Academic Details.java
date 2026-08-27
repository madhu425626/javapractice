import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
    String name = IO.readln();
    int age = Integer.parseInt(IO.readln());
    String id = IO.readln();
    String course  = IO.readln();
    String degree = IO.readln();
    int year  =  Integer.parseInt(IO.readln());

    GraduateStudent  g = new GraduateStudent(name,age,id,course,degree,year);
    g.displayGraduateDetails();
        
    }
}

class Person{
    String name;
    int age;

    public  Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void displayPersonalDetails(){
        IO.println("Name: "+name);
        IO.println("Age: "+age);
    }
}

class Student extends Person{
    String studentId;
    String course;

    public Student(String name, int age,String studentId, String course){
       super(name,age);
        this.studentId  = studentId;
        this.course  =  course;
    }

    public void displayStudentDetails(){
        super.displayPersonalDetails();
        IO.println("Student ID: "+studentId);
        IO.println("Course: "+course);
    } 
}

class GraduateStudent extends Student{
   
    String degreeType;
    int yearOfPassing;

    public GraduateStudent(String name, int age,String studentId, String course,String degreeType, int yearOfPassing){
        super(name,age,studentId,course);
        this.degreeType = degreeType;
        this.yearOfPassing = yearOfPassing;
    }

    public void displayGraduateDetails(){
        super.displayStudentDetails();
        IO.println("Degree Type: "+degreeType);
        IO.println("Year of Passing: "+yearOfPassing);
    }
}
