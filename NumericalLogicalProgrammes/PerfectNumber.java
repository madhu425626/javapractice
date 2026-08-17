import java.util.*;

public class PerfectNumer {
    public static void main(String[] args) {
        // Write your code here
        int num = Integer.parseInt(IO.readln());
        int factor = 0;
        for(int i = 1; i<=num/2; i++){
            if(num%i == 0){
                factor += i;
            }

        }
        if(num == factor){
            IO.println(num+" is a Perfect Number");
        }else{
            IO.println(num+" is NOT a Perfect Number");
        }
    }
}
