import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        int id = Integer.parseInt(IO.readln());
        String name = IO.readln();
        int marks = Integer.parseInt(IO.readln());

         Student s = new Student();
         s.setDetails(id,name,marks);
         s.grade(marks);
         IO.println(s.display());


    }
}

class Student{
    int id;
    String name;
    int marks;
    char grade;

    public  void setDetails(int id, String name, int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;

    }

    public char grade(int marks){
        if(marks>90){
            this.grade = 'A';
        }
        else if(marks>80 && marks<=90){
            this.grade = 'B';
        }
        else if(marks>70 && marks<=80){
            this.grade = 'C';
        }
        else if(marks>60 && marks<=70){
            this.grade = 'D';
        }
        else if(marks<=60){
            this.grade = 'E';
        }
        return this.grade;
       
    }

    public String display(){
        return "Student [name="+this.name+", studentId="+this.id+", marks="+this.marks+", grade="+this.grade+"]";
    }
}
