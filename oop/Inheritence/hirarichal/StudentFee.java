import java.util.*;

public class StudentFee {
    public static void main(String[] args) {
        // Write your code here
        int choice = Integer.parseInt(IO.readln().trim());
        switch(choice){
            case 1 -> {
                int id = Integer.parseInt(IO.readln().trim());
                String name = IO.readln().trim();
                double fee = Double.parseDouble(IO.readln().trim());
                double feePaid = Double.parseDouble(IO.readln().trim());

                Student s = new Student(id,name,fee,feePaid);
                IO.println(s.display());
                
            }
            case 2 -> {
                int id = Integer.parseInt(IO.readln().trim());
                String name = IO.readln().trim();
                double fee = Double.parseDouble(IO.readln().trim());
                double transFee = Double.parseDouble(IO.readln().trim());
                double feePaid = Double.parseDouble(IO.readln().trim());

                DayScholar s = new DayScholar(id,name,fee,transFee,feePaid);
                IO.println(s.display());
                
            }
            case 3 -> {
                int id = Integer.parseInt(IO.readln().trim());
                String name = IO.readln().trim();
                double fee = Double.parseDouble(IO.readln().trim());
                double hstlFee = Double.parseDouble(IO.readln().trim());
                double feePaid = Double.parseDouble(IO.readln().trim());


                Hosteler s = new Hosteler(id,name,fee,hstlFee,feePaid);
                IO.println(s.display());
                
            }


        }
    }
}

class Student{
    int id;
    String name;
    double fee;
    double feePaid;
    double remaining;
    //double paid;

    Student(int id, String name, double fee, double feePaid){
        this.id = id;
        this.name = name;
        this.fee = fee;
        this.feePaid =feePaid;
        //this.remaining = ;
    }

    public String display(){
        return "Student [name="+name+",studentId="+id+",examFee="+fee+"] Remaining Amount: "+(fee - feePaid);
    }
}

class DayScholar extends Student{
    double transFee;
   
    public DayScholar(int id, String name, double fee, double transFee,double feePaid){
        super( id,  name,  fee,  feePaid);
        this.transFee = transFee;

    }
    

    public String display(){
        return "DayScholar[transportFee="+transFee+", name="+name+",studentId="+id+",examFee="+fee+"]  Remaining Amount: "+(fee+transFee-feePaid);
    }
    
    
}

class Hosteler extends Student{
    double hstlFee;
    
    public Hosteler(int id, String name, double fee,double hstlFee,double feePaid){
        super(id,name,fee,feePaid);
        this.hstlFee = hstlFee;
        this.feePaid = feePaid;


    }
  

    public String display(){
        return"Hosteller[hostelFee="+hstlFee+", name="+name+",studentId="+id+",examFee="+fee+"]\nRemaining Amount: "+(fee+hstlFee-feePaid);
    }
}

