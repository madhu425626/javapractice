
import java.util.*;

record Books(Integer id ,String title,String author)
{

}

public class Main {
    public static void main(String[] args) {
        // Write your code here
        Vector<Books> listOfBooks = new Vector<>();

        int size = Integer.parseInt(IO.readln());
            if(size == 0)
            {
                IO.println("Number of books must be greater than 0");
            }
            else{

            
        for(int i = 0; i<size; i++)
        {
            Integer id = Integer.parseInt(IO.readln());
            String title = IO.readln();
            String author = IO.readln();

            listOfBooks.add(new Books(id,title,author));


        }

        String bookToRemove = IO.readln();
        boolean flag = false;
        IO.println("Total Books: "+listOfBooks.size());

        for(int i = 0; i<listOfBooks.size(); i++)
        {
            if(listOfBooks.get(i).title().equals(bookToRemove))
            {
                listOfBooks.remove(i);
            flag = true;
            }
        }
        if(flag)
        {
            IO.println("Book found and removed");
        }

            if(!flag)
            {
                IO.println("Book not found");;
            }
            IO.println("Remaining Books:");

        for(int i = 0; i<listOfBooks.size(); i++)
        {
            IO.print(listOfBooks.get(i).id()+" "+listOfBooks.get(i).title()+" "+listOfBooks.get(i).author());
        }
            }
    }
}


