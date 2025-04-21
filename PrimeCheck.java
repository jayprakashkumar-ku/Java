import java.util.Scanner;

public class PrimeCheck {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    boolean isPrime = true;
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        isPrime = false;
        break;
      }
    }
    System.out.println(isPrime ? num + " is prime" : num + " is not prime");
  }
}
