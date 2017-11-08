import java.util.ArrayList;
/**
 * This registrar class represents a registrar in a educational system.
 * This class hold the details of a registrar.
 *
 * @author Julian Rios
 * @version 2017.11.07
 */
 public class registrar
 {
   // collection of courses offered
   private ArrayList<Course> courses;

   /**
    * Create a new registrar with an empty collection of courses.
    */
   public registrar()
   {
     courses = new ArrayList<>();
   }

   /**
   * Add a course to the collection.
   */
   public void addCourse(Course newCourse)
   {
     course.add(newCourse);
   }

   /**
   * Remove a course from the collection.
   */
   public void addStudent(Course courseToRemove)
   {
     course.remove(courseToRemove);
   }

   /**
   * Print a list of all the courses offered.
   */
   public void printAll()
   {
     for(Course course : courses)
     {
       System.out.println(courses);
     }
   }

   /**
   * Print a list of all the courses not at capacity.
   */
   public void printAvailable()
   {
       int index = 0;
       Course checkCourse;
       boolean notFound = true;
       while(index < courses.size() && != max)
       {
         checkCourse = courses.printAll(index)
         System.out.println(checkCourse);
         notfound = false;
         index++;
       }
      if(notFound)
      {
        return -1
      }
      else
      {
        return index;
      }
   }
}





















 }
