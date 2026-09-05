import java.util.*;

public class equalsMethodOverriding {
    public static void main(String[] args) {
        int id1 = Integer.parseInt(IO.readln());
        String name1 = IO.readln();
        String course1 = IO.readln();

        int id2 = Integer.parseInt(IO.readln());
        String name2 = IO.readln();
        String course2 = IO.readln();

        Student s1 = new Student(id1,name1,course1); 
        Student s2 = new Student(id2,name2,course2);

        
        if(s1.equals(s2)){
            IO.println("Students are equal");
        }else{
            IO.println("Students are not equal");
        }

        //IO.println(s1.id == s2.id);
        }
}

class Student{
    int id;
    String name;
    String course;
     
    public Student(int id, String name, String course){
        if(id <= 0){
            IO.println("Error: Student ID must be greater than zero");
            System.exit(0);
        }
        this.id = id;
        this.name = name;
        this.course = course;

    }

   public boolean equals(Object obj){

    // obj one data retrived
        int id1 = this.id;
        String name1 = this.name;
        String course1 = this.course;

    //2nd obj data
        Student s3 = null;
        s3 = (Student)obj;
        int id2 = s3.id;
        String name2 = s3.name;
        String course2 = s3.course;

        if(id1 == id2){
            return true;
        }else{
            return false;
        }


    }

}
