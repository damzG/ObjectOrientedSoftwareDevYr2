public class Book{

    static private int uniqueBookId = 500;
    static private int bookTotals = 0;  //Total is 15
    private String genre;
    private String title;
    private double price;
    private Author author;

    public Book(String title, String genre, double price, Author author){
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
        return "Book Title: " + this.title + " Genre: " + this.genre + " Price: " + this.price + " Written by: " + this.author;
    }
}