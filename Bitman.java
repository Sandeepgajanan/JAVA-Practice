import java.util.*;

public class Bitman {

  public static void main(String[] args) {

    int n = 5;
    int pos = 1;
    int bm = 1 << pos;

    // getbit [bitwise and]
    int result1 = bm & n;
    System.out.println(result1);

    // setbit [bitwise or]
    int result2 = bm | n;
    System.out.println(result2);

    // clear bit [bitwise and with not]
    int nbm = ~(bm);
    int result3 = nbm & n;
    System.out.println(result3);

    // updatebit requires operation either 1 or 0
    // if it is 1 [bitwise or]
    // if it is 0 [bitwise and with not]
  }
}
