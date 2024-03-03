import java.util.Scanner;

public class MarkGrading {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter zero or 1:");
    int n = sc.nextInt();

    // Grading marks using while loop
    while (n == 1) {
      System.out.println("Enter the mark:");
      int m = sc.nextInt();
      if (m >= 90) {
        System.out.println("This is GOOD");
      } else if (m >= 60) {
        System.out.println("This is also GOOD");
      } else if (m > 0) {
        System.out.println("This is also GOOD");
      }
    }

    sc.close(); // Close the scanner to prevent resource leak
  }
}
