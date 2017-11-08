/**
 * The Student class represents a student in a educational system.
 * It hold the details of a student.
 *
 * @author Julian Rios
 * @version 2017.11.07
 */

public class student
{
  // the student's first name
  private String firstName;
  // the student's last name
  private String lastName;
  // the student's id
  private String studentID;

  /**
   * Create a new student with a given name and ID number.
   */
  public Student(String firstName, String lastName, String studentID)
  {
      name = firstName + " " + lastName;
      id = studentID;
  }

  /**
   * Return the full name of this student.
   */
  public String getName()
  {
      return name;
  }

  /**
   * Return the student ID of this student.
   */
  public String getStudentID()
  {
      return id;
  }

  /**
   * Print the student's name and ID number to the output terminal.
   */
  public void print()
  {
      System.out.println(name + ", student ID: " + id);
  }
}
