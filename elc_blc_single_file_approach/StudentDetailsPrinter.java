import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        int id = Integer.parseInt(IO.readln());
        String name = IO.readln();
        double fee = Double.parseDouble(IO.readln());
        
        IO.println(Student.getStudentDetails(id,name,fee));
    }
}

class Student{
    public static String getStudentDetails(int id, String name, double fee){
        return "[ Roll is :"+id+", Name is :"+name+", Fees is :"+fee+"]";
    }
}


