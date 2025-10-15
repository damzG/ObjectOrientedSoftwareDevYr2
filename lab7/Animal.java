public class Animal{
    private String type;
    private String gender;
    private int age;

    public Animal(String type, String gender, int age){
        this.type = type;
        this.gender = gender;
        this.age = age;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getType(){
        return type;
    }

    public String getGender(){
        return gender;
    }

    public int getAge(){
        return age;
    }

    public void eat(){
        System.out.println("Animal is eating");
    }

    public void sleep(){
        System.out.println("Animal is sleeping");
    }

    public void makeSound(){
        System.out.println("A generic animal sound");
    }

    @Override
    public String toString(){
        return "Type: " + this.type + " Gender: " + this.gender + " Age: " + this.age;
    }
}