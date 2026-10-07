public class MathOperations {
  int add(int a, int b) {
    return a + b;
  }

  // Overloaded method to add three integers
  int add(int a, int b, int c) {
    return a + b + c;
  }

  public static void main(String[] args) {
    MathOperations math = new MathOperations();
    System.out.println("Sum of two numbers: " + math.add(3, 4));
    System.out.println("Sum of three numbers: " + math.add(3, 4, 5));
  }
}
