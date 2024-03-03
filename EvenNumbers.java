import java.util.Scanner;

public class EvenNumbers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int n = sc.nextInt();

    // Print even numbers from 2 to n
    for (int i = 2; i <= n; i += 2) {
      System.out.println(i);
    }

    sc.close(); // Close the scanner to prevent resource leak
  }
}
