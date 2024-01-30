import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Library library = new Library(5);
        while (true) {
            System.out.println("\nLibrary Management System Menu\n:");
            System.out.println("1.Display all books:");
            System.out.println("2.Add a book:");
            System.out.println("3.Remove a book:");
            System.out.println("4.Search for a book:");
            System.out.println("5.Exit:");
            System.out.println("Enter your choice:");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    library.displayallBooks();
                    break;
                case 2:
                    System.out.println("Enter book details:");
                    System.out.println("Add BookId:");
                    int newBookId = scan.nextInt();
                    scan.nextLine();
                    String newTitle = scan.nextLine();
                    String newAuthor = scan.nextLine();
                    library.addBook(new Book(newBookId, newTitle, newAuthor, true));
                    break;
                case 3:
                    System.out.println("Remove a book:");
                    library.removeBook(scan.nextInt());
                case 4:
                    System.out.println("Search by book_id:");
                    Book foundbook = library.searchBookByID(scan.nextInt());
                    if (foundbook != null) {
                        System.out.println("book found:");
                        foundbook.displayBookInfo();
                    }
                    break;
                default:
                    System.out.println("Book not Exit");
            }
        }
    }
}
