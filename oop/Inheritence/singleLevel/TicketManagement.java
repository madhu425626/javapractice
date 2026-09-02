import java.util.*;

public class TicketManagement {
    public static void main(String[] args) {
        int choice = Integer.parseInt(IO.readln());
       
        switch(choice){
            case 1 -> {
                 Ticket t  = new Ticket();
                IO.println("Ticket Created Successfully");
                String name = IO.readln();
                t.setEventName(name);

                int num = Integer.parseInt(IO.readln());
                t.setSeatNo(num);

                double price = Double.parseDouble(IO.readln());
                t.setPrice(price);

                IO.println("Event Name: "+t.getEventName());
                IO.println("Seat Number: "+t.getSeatNo());
                IO.println("Price: "+t.getPrice());
             }

             case 2 ->{
                 VipTicket t  = new VipTicket();
                 IO.println("Ticket Created Successfully");
                String name = IO.readln();
                t.setEventName(name);

                int num = Integer.parseInt(IO.readln());
                t.setSeatNo(num);

                double price = Double.parseDouble(IO.readln());
                t.setPrice(price);

                String access = IO.readln();
                t.setSpeciallAccess(access);

                

                IO.println("Event Name: "+t.getEventName());
                IO.println("Seat Number: "+t.getSeatNo());
                IO.println("Price: "+t.getPrice());
                IO.println("Special Access: "+t.getSpeciallAccess());
             }

             default -> IO.println("Error Invalid Input");
        }
    }
}

class Ticket{
    private String eventName;
    private int seatNo;
    private double price;

    public Ticket( /* String eventName,int seatNo, double price*/){
       /* this.eventName = eventName;
        this.seatNo = seatNo;
        this.price = price;*/
    }

    public void setEventName(String name){
        this.eventName = name;
    }

    public String getEventName(){
        return this.eventName;
    }

    public void setSeatNo(int no){
        this.seatNo  = no;
    }

    public int getSeatNo(){
        return seatNo;
    }

    public void setPrice(double price){
        this.price  = price;
    }

    public double getPrice(){
        return this.price;
    }
}

class VipTicket extends Ticket{

    private String specialAccess; 

    public void setSpeciallAccess(String access){
        this.specialAccess = access;
    }

    public String getSpeciallAccess(){
        return this.specialAccess;
    }

   
    public  VipTicket(/*String eventName,int seatNo, double price*/){
       // super(eventName,seatNo,price);
    }

}

