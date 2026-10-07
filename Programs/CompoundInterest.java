public class CompoundInterest {
  public static void main(String[] args) {
    double P = 1000, R = 10, T = 2;
    double CI = P * Math.pow((1 + R / 100), T);
    System.out.println("Compound Interest: " + CI);
  }
}
