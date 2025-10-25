public class ElectricCar extends Car{

    private  String eType; //"Hybrid", "Plug-in Hybrid", or "Fully Electric"

    public ElectricCar(String make, String model, int size, double price, String eType){
        super(make, model, size, price);
        this.eType = eType;
    }

    @Override
    public String getCarType(){
        return "Electric";
    }
}
