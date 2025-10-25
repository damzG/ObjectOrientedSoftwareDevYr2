public class Address {
    
    final private String city;
    final private String street;
    final private String county;


    public Address(String city, String street, String county){
        this.city = city;
        this.street = street;
        this.county = county;
    }

    @Override
    public String toString(){
        return "City: " + this.city + "Town: " + this.street + "County: " + this.county;
    }

}
