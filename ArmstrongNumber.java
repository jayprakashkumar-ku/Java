import java.util.Scanner;

public class ArmstrongNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    int original = num, sum = 0;
    while (num != 0) {
      int digit = num % 10;
      sum += digit * digit * digit;
      num /= 10;
    }
    System.out
        .println(sum == original ? original + " is an Armstrong number" : original + " is not an Armstrong number");
  }
}
