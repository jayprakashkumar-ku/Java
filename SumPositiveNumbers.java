import java.util.Scanner;

public class SumPositiveNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    System.out.println("Enter numbers (enter 0 to stop): ");
    while (true) {
      int num = sc.nextInt();
      if (num == 0) {
        break;
      }
      if (num < 0) {
        continue; // Skip negative numbers
      }
      sum += num;
    }
    System.out.println("Sum of positive numbers: " + sum);
  }

}
