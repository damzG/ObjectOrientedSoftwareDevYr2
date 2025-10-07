public class Test {
	   public static void main(String[] args) {
	      // Test Student class
	      Student s1 = new Student("John Doe", "1 FairyLand Ave");
	      s1.addCourseGrade("H2215", 92);
	      s1.addCourseGrade("H2202", 68);
	      s1.printGrades();
	      System.out.println("Average grade is " + s1.getAverageGrade());
	      
	      // Test Teacher class
	      Teacher t1 = new Teacher("Oisin Cawley", "8 Yellow Brick Road");
	      System.out.println(t1);
	      String[] courses = {"H2215", "H2202"};
	      for (String course: courses) 			
	      {
	         if (t1.addCourse(course)) 			
	         {
	            System.out.println(course + " added.");
	         } 
	         else 
	         {
	            System.out.println(course + " cannot be added.");
	         }
	      }
	      for (String course: courses) 
	      {
	         if (t1.removeCourse(course)) 
	         {
	            System.out.println(course + " removed.");
	         } 
	         else 
	         {
	            System.out.println(course + " cannot be removed.");
	         }
	      }
	   }
	}
