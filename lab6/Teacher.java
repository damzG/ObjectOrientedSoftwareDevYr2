public class Teacher extends Person{
    private int numCourses = 0;
    private String[] courses;
    private static final int MAX_COURSES = 30;

    public Teacher(String name, String address) 
    {
        super(name, address);
        courses = new String[MAX_COURSES];
    }

    @Override
    public String toString(){
        return "Teacher: " + super.toString();
    }

    public boolean addCourse(String course){
        if(numCourses < MAX_COURSES)
        {
            courses[numCourses] = course;
            numCourses++;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean removeCourse(String course){
        for(int i = 0; i < numCourses; i++){
            //Checking for nullpointer exception
            if(courses[i] != null && courses[i].equals(course)){
                //Shift all the elements to the left
                for(int j = i; j < numCourses - 1; j++)
                {
                    courses[j] = courses[j + 1];
                }
                courses[numCourses - 1] = null; //clear last slot
                numCourses--;
                return true;
            }
        }
        return false;
    }
}
