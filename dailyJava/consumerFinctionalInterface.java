
import java.util.*;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        boolean []flag = {false};

        Consumer<Book> notify = param -> {
            if (param.dueToday) {
                flag[0] = true;
                IO.println("Notify " + param.user +
                    ": Please return '" + param.title + "' today.");
            }
        };

        int noOfBooks = Integer.parseInt(IO.readln().trim());

        for (int i = 0; i < noOfBooks; i++) {

            String title = IO.readln().trim();
            String user = IO.readln().trim();
            Boolean isDue = Boolean.parseBoolean(IO.readln().trim());

            Book b = new Book(title, user, isDue);
            notify.accept(b);
        }

        if (!flag[0]) {
            IO.println("no books due today");
        }
    }
}

class Book {
    String title;
    String user;
    Boolean dueToday;

    Book(String title, String user, Boolean dueToday) {
        this.title = title;
        this.user = user;
        this.dueToday = dueToday;
    }
}
