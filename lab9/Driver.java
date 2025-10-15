public class Driver {
    public static void main(String[] args) {
        LibraryItem items[] = new LibraryItem[2];
        items[0] = new Book("Fiction", "001", "Dickens", "Oliver Twist", 120);
        items[1] = new CD("Movie", "002", "Amazon", "9", 45);

        System.out.println("Price of item1: " + items[0].calculatePrice());
        System.out.println("Price of item2: " + items[1].calculatePrice());

        Car myCar = new Car("Sedan", 4, 5, 30000.0);
        System.out.println(myCar);
        Hgv myHgv = new Hgv(20, 15, 34, 5908.4);
        System.out.println(myHgv);

    }
}
