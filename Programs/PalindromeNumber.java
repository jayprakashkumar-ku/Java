import java.util.Scanner;

public class PalindromeNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    int original = num, reverse = 0;
    while (num != 0) {
      reverse = reverse * 10 + num % 10;
      num /= 10;
    }
    System.out.println(original == reverse ? original + " is a palindrome" : original + " is not a palindrome");
  }
}
