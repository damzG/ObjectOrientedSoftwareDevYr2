//If they are a manager, have details about company car (aggregation)

public class CompanyCar {
    //Attributes
    private String make;
    private String model;
    private String regNo;

    //Constructor
    public CompanyCar(String make, String model, String regNo) {
        this.make = make;
        this.model = model;
        this.regNo = regNo;
    }

    @Override
    public String toString() {
        return this.make + " " + this.model + " (" + this.regNo + ")";
    }
}
