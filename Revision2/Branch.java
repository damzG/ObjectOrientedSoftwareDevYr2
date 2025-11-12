import java.util.ArrayList;

public class Branch {
    static private int uniqueId = 2000;
    private int branchId;
    private String branchName;
    private Location loc;
    ArrayList<Book> books;
    
    public Branch(String name, Location location){
        this.branchId = uniqueId++;
        this.branchName = name;
        this.loc = location;
        this.books = new ArrayList<>();
    }

    //Getters and Setters

    // Add books
    public boolean addBook(Book b){
        if(books.size() < 5){
            books.add(b);
            return true;
        }
        else{
            System.out.println("Error, Maximum of five books");
            return false;
        }
    }

    //Books quantity
    public int getBookCount(){
        return books.size();
    }

    // List books
    public void listBooks(){
        if(books.isEmpty()){
            System.out.println("No books in this branch.");
        }else{
            for(Book b : books){
                System.out.println("Book: " + b);
            }
        }
    }

    @Override
    public String toString(){
        return "Branch Name: " + this.branchName + " Branch Id: " + this.branchId + " Location: " + this.loc;
    }
}
