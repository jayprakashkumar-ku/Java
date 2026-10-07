public class GradeCalculator {
  public static void main(String[] args) {
    int marks = 85;
    char grade;
    if (marks > 90)
      grade = 'A';
    else if (marks > 75)
      grade = 'B';
    else if (marks > 60)
      grade = 'C';
    else if (marks > 30)
      grade = 'D';
    else
      grade = 'F';
    System.out.println("Grade: " + grade);
  }
}
