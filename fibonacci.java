public class fibonacci {
  public static void main(String[] args) {
    int n = 10; // Display Fibonacci series up to 10 terms
    System.out.println("Fibonacci Series:");
    for (int i = 0; i < n; i++) {
      System.out.print(fib(i) + " ");
    }
  }

  public static int fib(int n) {
    if (n <= 1) {
      return n;
    }
    return fib(n - 1) + fib(n - 2);
  }
}
