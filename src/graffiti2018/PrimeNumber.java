package graffiti2018;

import java.util.Arrays;

/**
 * Do it fast by eliminate unnecessary processing.
 * using
 * 1) prime / prime !=0  is prime
 * 2) stop dividing if current cursor is bigger then n square root
 */
public class PrimeNumber {
  public static void main(String... args) {
    int idx = 0;
    int[] primes = new int[500];

    primes[idx++] = 2;
    primes[idx++] = 3;

    for (int n = 5; n <= 1000; n += 2) {
      boolean isDivided = false;
      for (int i = 1; primes[i] * primes[i] <= n; i++) {
        if (n % primes[i] == 0) {
          isDivided = true;
          break;
        }
      }
      if (!isDivided) {
        primes[idx++] = n;
      }
    }

    Arrays.stream(primes).takeWhile(i -> i != 0).forEach(System.out::println);
  }
}
