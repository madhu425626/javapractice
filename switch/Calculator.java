import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        // Write your code here
        

        int input1 = Integer.parseInt(IO.readln());
        int input2 = Integer.parseInt(IO.readln());
        String choise = IO.readln();

        String result = switch (choise.toLowerCase()){
            case "add" -> {
                            int x = input1+input2;
                            yield "Result: "+x;
                            }  
            case "sub" -> {
                            int x = input1-input2;
                            yield "Result: "+x;
                            }

            case "mul" -> {
                            int x = input1*input2;
                            yield "Result: "+x;
                            }     
            case "div" ->{  
                            if(input2 == 0){
                                yield "Error: Division by zero is not allowed";
                            
                            }
                            int x = input1/input2;
                            yield "Result: "+x;
                        }
            default -> {
                            
                            yield "Invalid";
            }    
            };

        IO.println(result);

    }
}
