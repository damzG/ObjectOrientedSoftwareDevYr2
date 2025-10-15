public class CD extends LibraryItem implements LoanItem{
    private  String title;
    private String band;
    private int numTracks;

    public CD(String type, String id, String title, String band, int num){
        super(type, id);
        this.title = title;
        this.band = band;
        this.numTracks = num;
    }

    public double calculatePrice(){
        return 23.0 * numTracks;
    }
}
