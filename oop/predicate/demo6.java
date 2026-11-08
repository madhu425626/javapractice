import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Write your code here
        Main m = new Main();
        int size = Integer.parseInt(IO.readln().trim());
        Room roomOfObjects[] = new Room[size];
        for(int i=0 ; i<size; i++)
        {
            int roomNo = Integer.parseInt(IO.readln().trim());
            boolean isAvilable = Boolean.parseBoolean(IO.readln().trim());
            roomOfObjects[i] = new Room(roomNo,isAvilable);
        }

        Predicate<Room> availability = room -> room.isAvilable;
        IO.println("Available Rooms:");

            for(int i = 0; i<size; i++)
            {
               
                if(!availability.test(roomOfObjects[i]))
                {
                    IO.println(roomOfObjects[i].roomNum);
                }
            }
    }
}

class Room
{
    int roomNum;
    boolean isAvilable;

    public Room(int roomNum, boolean isAvilable)
    {
        this.roomNum = roomNum;
        this.isAvilable = isAvilable;
    }

}
