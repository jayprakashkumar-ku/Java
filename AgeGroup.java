
import java.util.Scanner;

public class AgeGroup {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        if (age < 13) {
            System.out.println("Child");
        } else if (age < 20) {
            System.out.println("Teen");
        } else if (age < 60) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }

       
    }
}

