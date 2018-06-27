package graffiti2018.isPrime;

import java.util.Scanner;

/**
 * Sieve of Eratosthenes.
 * (Simply edition)
 */
public class Eratosthenes {

  /**
   * 2 <= k <= range
   * filtering 2m, 3m, 4m .... sqrt(range) * m
   */
  private static void solve(int range) {
    int[] buff = new int[range + 1]; // MAX

    for (int k = 2; k <= range; k++) {
      buff[k] = 1;
    }
    for (int m = 2; m <= (int) Math.sqrt(range); m++) {
      for (int k = 2 * m; k <= range; k += m) {
        buff[k] = 0;
      }
    }

    for (int k = 2; k <= range; k++) {
      if (buff[k] != 0) {
        System.out.println(k);
      }
    }
  }

  public static void main(String... args) {
    solve(new Scanner(System.in).nextInt());
  }
}
