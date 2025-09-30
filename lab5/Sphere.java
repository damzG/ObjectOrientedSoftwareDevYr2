public class Sphere extends Circle{
    
    public Sphere(double r){
        super(r);
    }

    public double area(){
        return (4 * super.area());
    }

    public double volume(){
        return (4/3) * super.area() * getRadius();
    }

    public String toString(){
         return (super.toString() + "Area" + area() + "Volume" +  volume());
    }
}
