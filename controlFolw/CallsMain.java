import java.util.*;

public class CallsMain {
    public static void main(String[] args) {
        // Write your code here
        double calls = Integer.parseInt(IO.readln());

        if(calls<=100){
            IO.println("Final Bill Amount = 360.0"); 
        }
        else if(calls>100 && calls<=200){
            IO.println("Final Bill Amount = "+(360 + (calls-100)*1));
        }
        else if(calls>200 && calls<=500){
           IO.println("Final Bill Amount = "+(360 +100+ (calls-200)*2));
        }
        else{
            IO.println("Final Bill Amount = "+(360 +100+300*2+ (calls-500)*5));
        }
        

    }
}
