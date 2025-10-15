public class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(String name, String colour, double length, double breadth) {
        super(name, colour);
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLength = " + length + "\nBreadth = " + breadth + "\n";
    }
}
