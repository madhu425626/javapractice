import java.util.*;

public class StudentVectorDemo {
    Vector<String> students;
    String name;
    int n;

    public static void main(String[] args) {
        // Write your code here
        int size = Integer.parseInt(IO.readln());

        Vector<Object> listOfStudent = new Vector<> (size);

        for(int i = 0; i<size; i++)
        {
        String name = IO.readln();
            listOfStudent.add(name);
        }

        IO.println("Students in Vector:");
       
        for(Object std : listOfStudent)
        {
            IO.println(std);
        }
        
    }
}
  
