public class Triangle extends Shape{
    private double base;
    private double height;

    public Triangle(String name, String color, double b, double h){
        super(name,color);
        this.base = b;
        this.height = h;
    }

    @Override
    public double area(){
        return  0.5 * base * height;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBase = " + base + "\nHeight = " + height + "\n";
    }
}
