public class PetrolCar extends Car{

    public PetrolCar(String make, String model, int size, double price){
        super(make, model, size, price);
    }

    public String getCarType(){
        return "Petrol";
    }
}
