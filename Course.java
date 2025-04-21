import java.util.ArrayList;

public class Course {
  String courseName;
  ArrayList<String> enrolledStudents = new ArrayList<>();
  static int maxCapacity;

  Course(String courseName) {
    this.courseName = courseName;
  }

  void enrollStudent(String studentName) {
    if (enrolledStudents.size() < maxCapacity) {
      enrolledStudents.add(studentName);
      System.out.println(studentName + " has been enrolled in " + courseName);
    } else {
      System.out.println("Course is full. Cannot enroll " + studentName);
    }
  }

  void unenrollStudent(String studentName) {
    if (enrolledStudents.contains(studentName)) {
      enrolledStudents.remove(studentName);
      System.out.println(studentName + " has been unenrolled from " + courseName);
    } else {
      System.out.println(studentName + " is not enrolled in " + courseName);
    }
  }

  static void setMaxCap(int capacity) {
    maxCapacity = capacity;
  }

  public static void main(String[] args) {
    Course.setMaxCap(3); // Set max capacity of 3 students

    Course course = new Course("Java Programming");

    course.enrollStudent("Alice");
    course.enrollStudent("Bob");
    course.enrollStudent("Charlie");
    course.enrollStudent("David"); // This will fail as the course is full

    course.unenrollStudent("Bob");
    course.enrollStudent("David"); // After Bob is unenrolled, David can be enrolled
  }
}
