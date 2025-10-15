public class Cat extends Animal {
    private String furColor;

    public Cat(String gender, int age, String furColor) {
        super("Cat", gender, age);
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }

    public void scratch() {
        System.out.println("The cat is scratching the furniture");
    }

    public void purr() {
        System.out.println("The cat is purring contentedly");
    }

    @Override
    public String toString() {
        return super.toString() + " Fur Color: " + this.furColor;
    }
}