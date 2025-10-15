public class AnimalTest {
    public static void main(String[] args) {
        Animal dog1 = new Dog("male", 3, "husky");
        Animal cat1 = new Cat("male", 2, "Orange");

        Vet bob = new Vet("Bob");
        bob.Vaccinate(cat1);
        bob.Vaccinate(dog1);
    }
}
