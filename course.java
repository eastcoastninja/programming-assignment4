import java.util.ArrayList;
import java.util.Scanner;
/**
 * This course class represents a course in a educational system.
 * This class hold the details of a course.
 *
 * @author Julian Rios
 * @version 2017.11.07
 */

public class course {
  // course identifier
  private String courseID;
  // course start time
  private String startTime;
  // course location
  private String location;
  // collection of students
  private ArrayList<Student> students;
  // maximum capacity of students for course
  private final int MAX_STUDENTS;

  /**
  * Create a course with an assigned capacity.
  * Set courseID, startTime, and location to unknown.
  */
  public course(int capacity) {
    courseID = "unknown";
    startTime = "unknown";
    location = "unknown";
    students = new ArrayList<>();
    MAX_STUDENTS = capacity;

  }

  /**
  * Add a student to the course.
  * Check if class is not full before adding student.
  */
  public void addStudent(Student newStudent)  {
    if(students.size() == MAX)
        System.out.println("The class is full, you cannot enroll.");
    else
    students.add(newStudent);
  }

  /**
  * Remove a student from the course.
  */
  public void addStudent(Student studentToRemove)  {
    students.remove(studentToRemove);
  }

  /**
   * Set the name of the course, such as "CS101".
   */
  public void setCourse(String courseName)  {
      courseID = courseName;
  }

  /**
   * Set the room number for this course, such as "ROB121"
   */
  public void setRoom(String roomNumber)  {
      location = roomNumber;
  }

  /**
   * Set the time for this course. The parameter should define the day
   * and the time of day, such as "M15:30".
   */
  public void setTime(String timeAndDayString)  {
      startTime = timeAndDayString;
  }

  /**
   * Print out a student list with students registered to the course to the standard
   * terminal.
   */
  public void printList() {
    System.out.println("Enter the courseID you wish to print a student list for.")
    String courseID;
    Scanner sc = new Scanner(System.in);
    courseID = sc.next()
    if(courseID != null) {
      for(Student student : students) {
        students.print();
      }
    }
  }

  public String searchStudent(String studentID) {
    int index = 0;
    boolean notFound = true;
    Student nextStudent;
    while(notFound && index < students.size()) {
      nextStudent = students.get(index);
      if(nextStudent.getStudentID().equals(studentID)) {
        notFound = false;
      }
      else {
        index++;
      }
    }
    if(notFound) {
      return -1;
    }
    else {
      return index;
    }

  }






}
