public class Author {

    private String firstName;
    private String lastName;
    private String nationality;

    public Author(String firstN, String lastN, String nation) {
        this.firstName = firstN;
        this.lastName = lastN;
        this.nationality = nation;
    }

    //Getters and Setters

    @Override
    public String toString(){
        return "Author:  Name: " + this.firstName + " " + this.lastName + " Origin: " + nationality;
    }
    
    
}
