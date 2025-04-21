import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    int number = rand.nextInt(100) + 1; // Random number between 1 and 100
    int guess;
    do {
      System.out.print("Guess the number (1-100): ");
      guess = sc.nextInt();
      if (guess < number) {
        System.out.println("Too low!");
      } else if (guess > number) {
        System.out.println("Too high!");
      } else {
        System.out.println("Correct! You guessed the number.");
      }
    } while (guess != number);
  }
}
