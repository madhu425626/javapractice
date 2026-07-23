public class elc{
    void main(String []args){
        int num = Integer.parseInt(IO.readln());
        if(blc.isPalindrome(num)){
        IO.println(num+" is palindrome");
    }else
    IO.println(num+" is not palindrome.");
    }
}

class blc{
    public static boolean isPalindrome(int num){
        int temp = num;
        int palindrome = 0; 
        while(num != 0){
            int digit = num%10;
            palindrome = palindrome*10 + digit;
            num = num/10;
        }
        return palindrome == temp;
    }
}
