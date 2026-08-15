import java.util.*;

public class CalculateResultMain {
    public static void main(String[] args) {
        int marks = Integer.parseInt(IO.readln());

        if( marks >= 90 & marks < 100 ){
            IO.println("Class Obtained: Outstanding");
        }
        else if(marks >= 75 & marks < 90){
            IO.println("Class Obtained: Distinction");
        }
         else if(marks >= 60 & marks < 75 ){
            IO.println("Class Obtained: First Class");
        }
        else if(marks > 35 & marks < 60){
            IO.println("Class Obtained: Pass");
        }
        else
            IO.println("Class Obtained: Fail");
        }
        
    }

