import java.util.*;;

public class Pathw {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 60 };

    int bg = arr[0];
    int sm = arr[0];
    for (int i = 1; i < arr.length; i++) {

      if (arr[i] > bg) {

        bg = arr[i];
      } else if (arr[i] < sm) {
        sm = arr[i];
      }

    }
    System.out.println(bg - sm);
  }
}
