import java.util.*;

class Calculator {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter 2 numbers:");
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println("Enter 1 for addition ,2 for sub ,3 for mul, 4 for div, 5 for mod");
      int ch = sc.nextInt();
      switch (ch) {
        case 1:
          System.out.println(a + b);
          break;
        case 2:
          System.out.println(a - b);
          break;
        case 3:
          System.out.println(a * b);
          break;
        case 4:
          System.out.println(a / b);
          break;
        case 5:
          System.out.println(a % b);
          break;

        default:
          System.out.println("Invalid choice");
      }
    }

  }
}