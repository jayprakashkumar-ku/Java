public class MaxValueForEach {
  public static void main(String[] args) {
    int[] arr = { 1, 3, 7, 2, 5 };
    int max = arr[0];
    for (int num : arr) {
      if (num > max) {
        max = num;
      }
    }
    System.out.println("Maximum value: " + max);
  }
}
