public class OccurrencesForEach {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 2, 4, 2 };
    int target = 2;
    int count = 0;
    for (int num : arr) {
      if (num == target) {
        count++;
      }
    }
    System.out.println("Occurrences of " + target + ": " + count);
  }
}
