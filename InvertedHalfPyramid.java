import java.util.*;

public class InvertedHalfPyramid {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = 1;
    int n = 5;
    for (int i = n; i > 1; i--) {

      for (int j = 1; j < i; j++) {
        System.out.print(number);
      }
      number++;

      System.out.println("");
    }

  }
}
