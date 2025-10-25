public class DieselCar extends Car{

    public DieselCar(String make, String model, int size, double price){
        super(make, model, size, price);
    }

    @Override
    public String getCarType(){
        return "Diesel";
    }
}
