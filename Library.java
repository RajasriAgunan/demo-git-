public class Library {
    private Book[] books;

    public Library(int Capacity) {
        books = new Book[Capacity];
    }

    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                System.out.println("Book is added Successfully");
            }
        }
            System.out.println("Library is full");
        }
        public void removeBook( int Book_Id){
            for (int i = 0; i < books.length; i++) {
                if (books[i] != null && books[i].getBook_Id() == Book_Id) {
                    books[i] = null;
                    System.out.println("Book removed successfully");
                }
            }
                System.out.println("Book not found");
                }
        public Book searchBookByID(int Book_Id){
        for(Book book:books) {
            if (book != null && book.getBook_Id() == Book_Id) {
                return book;
            }
        }
        return null;

            }

public void displayallBooks(){
        for(Book book:books){
            if(book!=null){
                book.displayBookInfo();
            }
        }
}
}
