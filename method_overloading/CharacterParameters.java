import java.util.*;

public class CharacterParameters {
    public static void main(String[] args) {
        // Write your code here
        CharacterParameters c = new CharacterParameters();
        
        int input1 = Integer.parseInt(IO.readln());
        char input2 = IO.readln().charAt(0);
        c.display(input1,input2);
        char input3 = IO.readln().charAt(0);
        int input4 = Integer.parseInt(IO.readln());
        c.display(input4,input3);

       
    }

    public void display(int x, char y){
        IO.println("int="+x+" char="+y);
    }

   
}
