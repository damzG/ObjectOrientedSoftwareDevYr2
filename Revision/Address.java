public class Address {
    
    // Attributes
    final private String city;
    final private String street;
    final private String county;


    //Constructor
    public Address(String city, String street, String county){
        this.city = city;
        this.street = street;
        this.county = county;
    }

    //toString() method
    @Override
    public String toString(){
        return "City: " + this.city + "Town: " + this.street + "County: " + this.county;
    }

}
