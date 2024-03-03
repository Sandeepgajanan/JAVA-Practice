import java.util.Scanner;

public class Ceaser {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string:");
    String str = sc.nextLine();
    String str1 = "";
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      char changech = (char) (ch + 3);
      if (changech > 'z') {
        changech = (char) (changech - 26);
      }
      str1 += changech;
    }
    System.out.println("Encrypted string: " + str1);
    sc.close();
  }

}
