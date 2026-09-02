import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here

        String choice = (IO.readln());
        switch(choice){
            case "doctor" -> {
                Doctor d = new Doctor("D001","Smith");
                d.displayDoctorDetails();
            }
            case "nurse" -> {
                Nurse n = new Nurse("N001","Jane");
                n.displayNurseDetails();
            }
            default ->  IO.println("Invalid Choice");
        }
       
    }
}
class Staff {
    String id;
    String name;

    Staff(String id, String name){
        this.id = id;
        this.name = name;
    }
}

class Doctor extends Staff{
    String specialization = "Cardiology";

    Doctor(String id, String name ){
        super(id,name);
    }
    public void displayDoctorDetails(){
        IO.println("ID: "+id);
        IO.println("Name: Dr. "+ name);
        IO.println("Specialization: "+specialization);
    }
}

class Nurse extends Staff{
    String department = "Pediatrics";
    Nurse(String id, String name ){
        super(id,name);
    }
    public void displayNurseDetails(){
        IO.println("ID: "+id);
        IO.println("Name: Nurse "+ name);
        IO.println("Department: "+department);
    }
}
