public class Dog extends Animal {
    private String breed;

    public Dog(String gender, int age, String breed) {
        super("Dog", gender, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    public void fetch() {
        System.out.println("The dog is fetching the ball");
    }

    public void wagTail() {
        System.out.println("The dog is wagging its tail happily");
    }

    @Override
    public String toString() {
        return super.toString() + " Breed: " + this.breed;
    }
}