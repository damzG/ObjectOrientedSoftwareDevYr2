public class Car extends RoadVehicle implements ImportDuty{
	private String carType;
 
	public Car() {
	 	this("", 0, 0, 0.0);
	 	}
 
	public Car(String c, int w, int p, double value) { 
		super(w, p, value);
		setType(c);
	}
 
	public void setType(String t)  {
		carType = t;
	}
 
	public String getType() {
		return carType;
	}

    @Override
    public double calculateDuty(){
        return getValue() * CARTAXRATE;
    }

    public String toString() {
        return "Car type: " + carType + 
               "\nValue: " + getValue() + 
               "\nImport duty: " + calculateDuty();
    }
}
