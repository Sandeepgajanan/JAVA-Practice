import java.util.*;

public class Power2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number:");
    int n = sc.nextInt();
    if (n > 0 && (n & (n - 1)) == 0) {
      System.out.println("It's a power of 2");
    } else {
      System.out.println("It's not a power of 2");
    }
    sc.close();
  }
}
