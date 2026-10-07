import java.util.Scanner;
public class Addition {
   public static void main(String[] args) {
    int x,y,sum;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first value:");
    x= sc.nextInt();
    System.out.println("Enter Second value:");
    y= sc.nextInt();
    sum=x+y;
    System.out.println("Sum of the Given Number: "+sum);
   } 
}
