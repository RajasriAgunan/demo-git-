public class Book {
    public int Book_Id;
    public String title;
    public String Author;
    public boolean is_Available;

    public Book(int Book_Id, String title, String Author, boolean is_Available) {
        this.Book_Id = Book_Id;
        this.title = title;
        this.Author = Author;
        this.is_Available = is_Available;
    }

    public int getBook_Id()
    {
        return Book_Id;
    }

    public void setBook_Id(int Book_Id) {
        this.Book_Id = Book_Id;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        this.Author = author;

    }

    public boolean getIs_Available() {
        return is_Available;
    }

    public void setIs_Available(boolean is_Available) {
        this.is_Available = is_Available;
    }

    public void displayBookInfo() {
        System.out.println("Bookid:"+Book_Id);
        System.out.println("Title:"+title);
        System.out.println("Author:"+Author);
        System.out.println("is_Available Yes/No:"+is_Available);
    }
}