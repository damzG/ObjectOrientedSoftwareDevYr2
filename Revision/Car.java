public abstract class Car {
    static int saleNo = 100; //assigned sale number
    static  int noCarRecords = 0;
    private int currentSaleNo;
    private String make;
    private String model;
    private int engineSize;
    private double salePrice;

    public Car(String make, String model, int eSize, double price){
        this.currentSaleNo = saleNo++;
        noCarRecords++;
        this.make = make;
        this.model = model;
        this.engineSize = eSize;
        this.salePrice = price;
    }

    public static int getNoOfCarRecords(){
        return noCarRecords;
    }

    public int getCurrentSaleNo(){
        return this.currentSaleNo;
    }

    public static int saleCounter(){
        return saleNo;
    }

    public abstract String getCarType();

    @Override
    public String toString(){
        return "Sales Number: " + saleNo + " Make: " + make + " Model: " + model + " Engine Size: " + engineSize + " Sale Price: " + salePrice;
    }
}
