package dailyOne.p677;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  public static void main(String[] args) {
    final var res = new Solution().sieveOfEratosthenes(104743); // 10001th prime number
    System.out.println(res.size());
  }

  public List<Integer> sieveOfEratosthenes(final int n) {
    final List<Integer> primes = new ArrayList<>();
    final boolean[] isPrime = new boolean[n + 1];

    for (int i = 2; i <= n; i++) {
      isPrime[i] = true;
    }

    for (int k = 2; k <= Math.pow(n, 0.5); k++) {
      // even numbers was filtered in k = 2
      if (k != 2 && k % 2 == 0) continue;

      for (int i = k; i <= n / k; ) {
        // System.out.printf("%s x %s, ", k, i);
        isPrime[(k * i)] = false;

        if (k == 2) i++;
        else i += 2; // it's unnecessary to check 3x4, 3x6 .. or 5x6, 5x8 ..
      }
      // System.out.println();
    }

    for (int x = 2; x <= n; x++) {
      if (isPrime[x]) primes.add(x);
    }

    return primes;
  }
}
