public class Driver {
    public static void main(String[] args) {
        // Using circle reference
        Shape circle = new Circle("Circle One", "Red", 10.0);
        System.out.println("--Using circle reference");
        System.out.println(circle);

        // Using rectangle reference
        Shape rectangle = new Rectangle("Rectangle One", "Yellow", 15.0, 20.0);
        System.out.println("--Using rectangle reference");
        System.out.println(rectangle);

        // Using cylinder reference
        ThreeDShape cylinder = new Cylinder("Cylinder One", "Green", 6.0, 8.0);
        System.out.println("--Using cylinder reference");
        System.out.println(cylinder);

        Shape triangle = new Triangle("Triangle One", "Orange", 2, 4);
        System.out.println("---Using triangle reference");
        System.out.println(triangle);
    }
}
