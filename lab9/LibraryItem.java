public class LibraryItem implements LoanItem{
    private String type;
    private String id;

    public LibraryItem(String type, String id){
        this.type = type;
        this.id = id;
    }

    public double calculatePrice(){
        return 23;
    }
}
