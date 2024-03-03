public class Countps {
  public static void main(String[] args) {
    int[] arr = { 4, 20, 30, 40, 55, 64, 77, 83 };
    int ans = 0;
    int x;
    for (int i = 0; i < arr.length; i++) {

      x = (int) Math.sqrt(arr[i]);
      if (x * x == arr[i]) {

        ans++;

      }

    }
    System.out.println(ans);
  }
}
