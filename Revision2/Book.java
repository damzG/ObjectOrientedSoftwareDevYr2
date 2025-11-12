public class Book{

    static private int UNIQUE_BOOK_ID = 500;
    static private int bookTotals = 0;  //Total is 15

    public static int getUniqueBookId() {
        return UNIQUE_BOOK_ID;
    }
    private String genre;
    private String title;
    private double price;
    private Author author;
    private int bookId;

    public Book(String title, String genre, double price, Author author){
        this.bookId = UNIQUE_BOOK_ID++;
        this.genre = genre;
        this.title = title;
        this.price = price;
        this.author = author;
        bookTotals++;
    }

    //Getters and Setters

    public static int returnBookTotal(){
        return bookTotals;
    }

    @Override
    public String toString(){
        return "Book ID: " + bookId +  "Book Title: " + this.title + " Genre: " + this.genre + " Price: " + this.price + " Written by: " + this.author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
}