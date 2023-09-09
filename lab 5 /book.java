import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private int edition;

    public Book(String title, String author, int edition) {
        this.title = title;
        this.author = author;
        this.edition = edition;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getEdition() {
        return edition;
    }
}

public class BookArray {
    public static void main(String[] args) {
        // Create an array of 6 Book objects in ascending order of titles
        Book[] books = new Book[6];
        books[0] = new Book("Book A", "Author X", 1);
        books[1] = new Book("Book B", "Author X", 2);
        books[2] = new Book("Book C", "Author Y", 1);
        books[3] = new Book("Book D", "Author Y", 2);
        books[4] = new Book("Book E", "Author Z", 1);
        books[5] = new Book("Book F", "Author Z", 2);

        // Get the author name from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the author's name: ");
        String authorName = scanner.nextLine();
        scanner.close();

        // Display details of books written by the specified author
        System.out.println("Books written by " + authorName + ":");
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(authorName)) {
                System.out.println("Title: " + book.getTitle() + ", Edition: " + book.getEdition());
            }
        }
    }
}
