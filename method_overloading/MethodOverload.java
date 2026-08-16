import java.util.*;

public class MethodOverload {

    public static void main(String[] args) {
        MethodOverload m = new MethodOverload(); 

        byte type1 = (byte)Integer.parseInt(IO.readln());
        m.printData(type1);
        short type2 = (short)Integer.parseInt(IO.readln());
        m.printData(type2);
        int type3 = Integer.parseInt(IO.readln());
        m.printData(type3);
        long type4 = Long.parseLong(IO.readln());
        m.printData(type4);
        float type5 = Float.parseFloat(IO.readln());
        m.printData(type5);
        double type6 = Double.parseDouble(IO.readln());
        m.printData(type6);
        char type7 = (IO.readln()).charAt(0);
        m.printData(type7);
        boolean type8 = Boolean.parseBoolean(IO.readln());
        m.printData(type8);
        String type9 = IO.readln();
        m.printData(type9);

      
    } public void printData(byte type1){
        IO.println("Byte value: "+type1);
       } 
       public void printData(short type2){
        IO.println("Short value: "+type2);
       } 
       public void printData(int type3){
        IO.println("Int value: "+type3);
       } 
       public void printData(long type4){
        IO.println("Long value: "+type4);

       } 
       public void printData(float type5){
        IO.println("Float value: "+type5);

       } 
       public void printData(double type6){
        IO.println("Double value: "+type6);

       } 
       public void printData(char type7){
        IO.println("Char value: "+type7);

       } 
       public void printData(boolean type8){
        IO.println("Boolean value: "+type8);

       } 
       public void printData(String type9){
        IO.println("String value: "+type9);

       } 
}
