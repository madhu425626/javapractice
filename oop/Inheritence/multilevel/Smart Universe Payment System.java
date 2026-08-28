import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Write your code here

        int choise = Integer.parseInt(IO.readln().trim());
        switch(choise){
            case 1 -> {
                int id = Integer.parseInt(IO.readln().trim());
                String name = IO.readln().trim();
                int amount = Integer.parseInt(IO.readln().trim());
                UserAccount u = new UserAccount(id,name,amount);
                u.display();
            }
            case 2 -> {
                int id = Integer.parseInt(IO.readln().trim());
                String name = IO.readln().trim();
                int amount = Integer.parseInt(IO.readln().trim());
                GoldUser u = new GoldUser(id,name,amount);
                u.display();
            }
            case 3 -> {
                int id = Integer.parseInt(IO.readln().trim());
                String name = IO.readln().trim();
                int amount = Integer.parseInt(IO.readln().trim());
                PlatinumUser u = new PlatinumUser(id,name,amount);
                u.display();
            }
            default -> IO.println("Invalid");
        }
        
    }
}

class UserAccount{
    int userId;
    String userName;
    double walletBalance;

    UserAccount(int userId, String userName, double walletBalance){
        this.userId = userId;
        this.userName = userName;
        this.walletBalance = walletBalance;
    }

    public void display(){
        IO.println("User ID: "+this.userId);
        IO.println("Name: "+this.userName);
        IO.println("Final Balance: "+this.walletBalance);
    }
    public void setDetails(){

    }
}

class GoldUser extends UserAccount{
    GoldUser ( int userId, String userName, double walletBalance){
        super(userId,userName,walletBalance);
        super.walletBalance = walletBalance + (walletBalance*0.05);

    }
}

class PlatinumUser extends GoldUser{

    PlatinumUser( int userId,String userName, double walletBalance){
        super(userId,userName,walletBalance);
        super.walletBalance += 4000;

    }
}
