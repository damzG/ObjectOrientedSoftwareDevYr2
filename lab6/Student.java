public class Student extends Person{
    private int numCourses = 0;
    private String[] courses;
    private int[] grades;
    private static final int MAX_COURSES = 30;

    public Student(String name, String address){
        super(name, address);
        courses = new String[MAX_COURSES];
        grades = new int[MAX_COURSES];
    }
  
    @Override
    public String toString(){
        return "Student: " + super.toString();
    }

    public void addCourseGrade(String course, int grade){
        if(numCourses < MAX_COURSES)
        {
            courses[numCourses] = course;
            grades[numCourses] = grade;
            numCourses++;
            System.out.println("Course added: " + course + "Grade added: " + grade);
        }
        else{
            System.out.println("Limit reached. Cannot add more courses");
        }
    }

    public void printGrades(){
        System.out.println("Grades: ");
        for(int i = 0; i < numCourses; i++){
            System.out.println(grades[i]);
        }
    }

    public double getAverageGrade(){
        if(numCourses == 0){
            return 0.0;
        }

        double average;
        double sum = 0;
        
        for(int i = 0; i < numCourses; i++){
            sum += grades[i];
        }
        average = sum / numCourses;
        return average;
    }
}
