
import java.util.*;

class Book {
    private int bookId;
    private String bookTitle;
    private String authorName;
    private int quantity;

    Book(int bookId, String bookTitle, String authorName, int quantity) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.quantity = quantity;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return bookId + " " + bookTitle + " " +
               authorName + " " + quantity;
    }
}

public class Main {

    Vector<Book> lob = new Vector<>();

    // Add book or update quantity if title already exists
    public void addBook(Book newBook) {
        for (int i = 0; i < lob.size(); i++) {
            Book existingBook = lob.get(i);

            if (existingBook.getBookTitle()
                    .equals(newBook.getBookTitle())) {

                existingBook.setQuantity(
                    existingBook.getQuantity() + newBook.getQuantity()
                );

                return;
            }
        }

        lob.add(newBook);
    }

    // Remove book using book ID
    public void removeBook(int bookId) {
        boolean flag= false;
        for (int i = 0; i < lob.size(); i++) {
            if (lob.get(i).getBookId() == bookId) {
                flag= true;
            IO.println("Duplicate book found, quantity updated\nBook removed");

                lob.remove(i);
                break;
            }           
        }
        if(!flag)
        {
            IO.println("Book not found");
        }
    }

    // Calculate total quantity
    public int totalNumOfBooks() {
        int sum = 0;

        for (Book b : lob) {
            sum += b.getQuantity();
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main m = new Main();

        int size = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < size; i++) {
            int id = sc.nextInt();
            sc.nextLine();

            String title = sc.nextLine();
            String author = sc.nextLine();
            int quantity = sc.nextInt();
            sc.nextLine();

            Book b = new Book(id, title, author, quantity);
            m.addBook(b);
        }

        int bookToRemove = sc.nextInt();

        m.removeBook(bookToRemove);

        IO.println("Remaining Books:");

        for (Book b : m.lob) {
            IO.println(b);
        }

        IO.println("Total Quantity: " + m.totalNumOfBooks());

        sc.close();
    }
