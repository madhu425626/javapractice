import java.util.*;

public class Main {
    public static void main(String[] args) {

        double principal = Double.parseDouble(IO.readln(""));
        double intrest = Double.parseDouble(IO.readln());
        int durationMonths = Integer.parseInt(IO.readln());

      Loan l = new Loan(principal,intrest,durationMonths); 
       IO.println("Principal: "+ l.getPrincipal());
       IO.println("Interest Rate (Yearly %): "+l.getInrest());
      IO.println("Duration (months): "+l.getMonths());
        
    }
}

class Loan{
   private double principal;
   private double intrest;
   private int durationMonths;

    public Loan(double principal,double intrest,int durationMonths){

        if(principal <= 0| intrest <= 0| durationMonths <= 0){
            IO.println("Error");
            System.exit(0);
        }
        this.principal = principal;
        this.intrest = intrest;
        this.durationMonths = durationMonths;

    }

    public void setPrincipal(double amount){
        this.principal = amount;
    }

    public double getPrincipal(){
        return this.principal;
    }

    public void setIntrest(double intrest){
        this.intrest = intrest;
    }

    public double getInrest(){
        return this.intrest;

    }

    public void setMonths(int months){
        this.durationMonths = months;
    }

    public int getMonths(){
        return this.durationMonths;
    }
}
