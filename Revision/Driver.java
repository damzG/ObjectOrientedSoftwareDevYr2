
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Random addresses for dealerships
        String[] name = {"AutoZone", "CarMax", "DriveAway Motors", "WheelDeal", "SpeedyCars"};
        String[] cities = {"123 Elm St", "45 Oak Rd", "67 Pine Ave", "89 Maple Blvd", "101 Birch Way"};
        String[]  streets = {"Swords", "Cobh", "Tuam", "Adare", "Tramore"};
        String[] counties = {"Dublin", "Cork", "Galway", "Limerick", "Waterford"};

        //Initialise 5 dealership automatically
        Dealership[] dealers = new Dealership[5];
        for (int i = 0; i < 5; i++) {
            Address address = new Address(cities[i], streets[i], counties[i]);
            dealers[i] = new Dealership(name[i], address);
        }

        //Maximum number of records -> 10
        Car[] cars = new Car[10];

        System.out.println("Welcome to Ireland CarSales System");
        System.out.println("1. List all dealerships.");
        System.out.println("2. Create a new car record");
        System.out.println("3. List all cars");

        //Creating a new car record
        System.out.println("Enter the number of car records you want to create: ");
        int carRecords = input.nextInt();

        if(carRecords >= 10){
            System.out.println("Maximum number is 10, input another number");
            carRecords = 10;
        }

        for(int j = 0; j < carRecords && Car.getNoOfCarRecords() < 10; j++){
            System.out.println("Enter car make: ");
            String carMake = input.next();

            System.out.println("Enter the car model: ");
            String carModel = input.next();

            System.out.println("Enter the car size: ");
            int carSize = input.nextInt();

            System.out.println("Enter the price of the car: ");
            double carPrice = input.nextDouble();

            System.out.print("Enter type (Petrol / Diesel / Electric): ");
            String type = input.nextLine().trim().toLowerCase();

            switch(type){
                case "Petrol":
                    cars[j] = new PetrolCar(carMake, carModel, carSize, carPrice);
                    break;
                case "Diesel":
                    cars[j] = new DieselCar(carMake, carModel, carSize, carPrice);
                    break;
                case "Electric":
                    System.out.println("Indicate Hybrid, Plug-in Hybrid or Fully Electric");
                    String electricType = input.next();
                    cars[j] = new ElectricCar(carMake, carModel, carSize, carPrice, electricType);
                    break;
                default:
                    System.out.println("Invalid type! Defaulting to Petrol.");
                    cars[j] = new PetrolCar(carMake, carModel, carSize, carPrice);
                    break;
            }
                
            System.out.println("Car " + cars[j].saleCounter() + " has been created!");


            System.out.println("\nAssign this car to a dealership:");
            for (int k = 0; k < dealers.length; k++) {
                System.out.println((k + 1) + ". " + dealers[k].getTradingName());
            }

            System.out.print("Enter dealership number (1-5): ");
            int choice = input.nextInt();
            input.nextLine(); // consume newline
            dealers[choice - 1].addCar(cars[j]);  // assign car to that dealership
        }

        // List all cars
        for(int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
            System.out.println("Type: " + cars[i].getCarType());
            System.out.println("--------------------");
        }

        // Display all dealerships and cars assigned
        System.out.println("\n===== Dealerships and Cars =====");
        for (Dealership d : dealers) {
            System.out.println(d);
            System.out.println("Number of cars: " + d.noOfCarsAssigned());
            d.printCarsAssigned();
            System.out.println("===============================");
        }

        input.close();

    }
}
