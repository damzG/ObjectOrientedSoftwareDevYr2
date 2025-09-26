public class Address{
    final private String city;
    final private String town;
    final private String county;


    public Address(String city, String town, String county){
        this.city = city;
        this.town = town;
        this.county = county;
    }

    @Override
    public String toString(){
        return "City: " + this.city + "Town: " + this.town + "County: " + this.county;
    }
}