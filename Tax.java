public class Tax {
  public static void main(String[] args) {
    int[] arr = { 100, 200, 300, 400, 500 };
    double tax = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > 100) {

        tax += (arr[i] - 100) * 0.1;
      }

    }
    System.out.println(tax);
  }
}
