import java.util.Scanner;

public class welcome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = sc.nextLine();
    System.out.println("Welcome " + name + " to Skill Development Training");
  }
}