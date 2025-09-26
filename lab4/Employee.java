import java.util.Scanner;

public class Employee {
    static int latestID = 1000; //starting assigned employee number
    final private int currentID; //automatically assigned employee number
    Address empAddress;  // has an address location (aggregation)
    final private String empPosition; //either staff or manager
    private CompanyCar car; //employee object who is a manager has a car
    private Office office; //employee is in an office
    private static int noOfEmp = 0; //total no of employees max is 5

    //Constructor
        public Employee(String city, String town, String county, String job){
                this.currentID = latestID;
                latestID++;

                empAddress = new Address(city, town, county);
                this.empPosition = job;
                noOfEmp++; //tracking number of employees

                //Checking if job position is manager
                if (job.equalsIgnoreCase("Manager")) {
                    String make;
                    String model;
                    String reg;
                    try (Scanner input = new Scanner(System.in)) {
                        System.out.print("Enter car make: ");
                        make = input.next();
                        System.out.print("Enter car model: ");
                        model = input.next();
                        System.out.print("Enter reg number: ");
                        reg = input.next();
                    }
                this.car = new CompanyCar(make, model, reg);
    }
        }

        public int getLatestId(){
            return currentID;
        }

        // public String checkManager(){
        //     return "";
        // }

        public Address getAddress(){
            return empAddress;
        }

        public String getEmpPosition(){
            return empPosition;
        }

        public CompanyCar getCar(){
            return car;
        }
        //Maximum of two offices stuff
        public void setOffice(Office workPlace){
            this.office = workPlace;
        }

        public Office getOffice(){
            return this.office;
        }


        public static int getNoOfEmps(){
            return noOfEmp;
        }

        @Override
    public String toString() {
        return "Employee ID: " + currentID +
            ", Position: " + empPosition +
            ", Address: " + empAddress;
            }

}