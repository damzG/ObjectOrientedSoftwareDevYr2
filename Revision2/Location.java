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



    public String getStreet() {
        return street;
    }



    public void setStreet(String street) {
        this.street = street;
    }



    public String getCity() {
        return city;
    }



    public void setCity(String city) {
        this.city = city;
    }



    public String getCounty() {
        return county;
    }



    public void setCounty(String county) {
        this.county = county;
    }
}
