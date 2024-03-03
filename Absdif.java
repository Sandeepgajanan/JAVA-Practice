import java.util.Scanner;

public class Absdif {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];
    int temp;
    int r = 0;
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    for (int i = 1; i < arr.length; i++) {
      r += Math.abs(arr[i] - arr[i - 1]);
    }
    System.out.println(r);
    sc.close();
  }
}
