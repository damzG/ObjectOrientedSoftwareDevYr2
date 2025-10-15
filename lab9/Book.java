public class Book extends LibraryItem{
    private String author;
    private String title;
    private int numPages;

    public Book(String type, String id, String author, String title, int num){
        super(type, id);
        this.author = author;
        this.title = title;
        this.numPages = num;
    }

    public double calculatePrice(){
        return 23.0 * numPages;
    }
}
