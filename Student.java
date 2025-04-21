public class Student {
  String name;
  int age;

  // Constructor to initialize name and age
  Student(String name, int age) {
    this.name = name;
    this.age = age;
  }

  void printDetails() {
    System.out.println("Student Name: " + name);
    System.out.println("Student Age: " + age);
  }

  public static void main(String[] args) {
    Student student = new Student("John", 20);
    student.printDetails();
  }
}
