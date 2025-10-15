public class TestPerson {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Jubril", 23000);
        Student student1 = new Student("Damola", "Biology");

        Person guys[] = {emp1, student1};
        System.out.println("Employee Name: " + guys[0].getName() + " " + "Description: " + guys[0].getDescription());
        System.out.println("Student Name: " + guys[1].getName() +  " " +  "Description: " + guys[1].getDescription());

    }
}
