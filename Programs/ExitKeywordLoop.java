import java.util.Scanner;

public class ExitKeywordLoop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input;
    do {
      System.out.print("Enter a command (type 'exit' to quit): ");
      input = sc.nextLine();
      if (input.equalsIgnoreCase("exit")) {
        break;
      }
      System.out.println("You entered: " + input);
    } while (true);
  }
}
