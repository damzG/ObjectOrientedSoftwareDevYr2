public class RoadVehicle {
    private int wheels;	    //How many wheels it has
	private int passengers; //How many passengers it can carry
    private double value;
 
	public RoadVehicle() {
 		this(0,0,0);	
	}
 
	public RoadVehicle(int w, int p, double v) { 
		setWheels(w);
		setPass(p);
        value = v;
	}
 
	public void setWheels(int num) {
		wheels = num;
		}
 
	public int getWheels() {
		return wheels;
		}
 
	public void setPass(int num) {
		passengers = num;
		}
 
	public int getPass() {
		return passengers;
		}

    public void setValue(double v) {
        value = v;
    }

    public double getValue() {
        return value;
    }
}
