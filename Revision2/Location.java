public class Location {
    
    private String street;
    private String city;
    private String county;

    public Location(String street, String city, String county){
        this.street = street;
        this.city = city;
        this.county = county;
    }

    @Override
    public String toString(){
        return "BookStore Location: " + " Street: " + this.street + " City: " + this.city + " County: " + this.county;
    }
}
