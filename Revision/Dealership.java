public class Dealership{
    static int uniqueId = 1000; //unique identifier
    private int currentNo;
    private String tradingName;
    Address dealAddress;  //aggregation (composition tightly coupled)
    Car[] carsDeal = new Car[3]; //aggregation
    private int carCount = 0; //number of cars assigned to it

    public Dealership(String tName, Address address){
        this.currentNo = uniqueId;
        uniqueId++;
        this.tradingName = tName;
        this.dealAddress = address;
    }

    public void setTradingName(String tName){
        this.tradingName = tName;
    }

    public String getTradingName(){
        return this.tradingName;
    }

    public boolean addCar(Car car){
        if(carCount < carsDeal.length){
            carsDeal[carCount++] = car;
            return true;
        }
        else
        {
            System.out.println("Dealership " + tradingName + " already has 3 cars assigned!");
            return false;    
        }
    }

    public int noOfCarsAssigned(){
        return carCount;
    }

    public void printCarsAssigned(){
        System.out.println("Dealership " + tradingName + " has about: ");
        if(carCount == 0){
            System.out.println("No cars are assigned to this dealership.");
        }
        else{
            for(int i = 0; i < carCount; i++){
                System.out.println(carsDeal[i]);
                System.out.println("Type: " + carsDeal[i].getCarType());
                System.out.println("--------------------");
            }
        }
    }

    @Override
    public String toString() {
        return "ID: " + uniqueId + "\n" +
               "Name: " + tradingName + "\n" +
               "Address: " + dealAddress;
    }

}