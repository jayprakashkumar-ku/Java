import java.util.Scanner;

public class SumOddNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number N: ");
    int N = sc.nextInt();
    int sum = 0;
    for (int i = 1; i <= N; i++) {
      if (i % 2 != 0) {
        sum += i;
      }
    }
    System.out.println("Sum of odd numbers: " + sum);
  }
}
