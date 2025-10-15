public class Vet {
    private String name;

    public Vet(String name){
        this.name = name;
    }

    public void Vaccinate(Animal animal){
        System.out.println(this.name + " is vaccinating!");
         if(animal instanceof Dog)
         {
            System.out.println("Dog has been vaccinated: " + animal);
         }

         if(animal instanceof  Cat)
         {
            System.out.println("Cat has been vaccinated: " + animal);
         }
    }
}
