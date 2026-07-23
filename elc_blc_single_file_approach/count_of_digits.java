public class elc{
    void main(String []args){
        long num = Long.parseLong(IO.readln());
        IO.println("Total num of digits in a given num "+num+" are :" +blc.totalNumOfDigits(num));
}
}

class blc{
    public static long totalNumOfDigits(long num){
        long sum = 0;
         
        while(num != 0){
            long digit = num%10;
            sum = sum + digit;
            num = num/10;
        }
        return sum;
    }
}
