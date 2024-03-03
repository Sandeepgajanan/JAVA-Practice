public class Countoddeven {
  public static void main(String[] args) {
    int[] arr = { 10, 20, 30, 40, 55, 66, 77, 83 };
    int ev = 0;
    int od = 0;
    for (int i = 0; i < arr.length; i++) {

      if (arr[i] % 2 == 0) {
        ev++;
      } else {
        od++;
      }

    }
    System.out.println(od - ev);
  }
}
