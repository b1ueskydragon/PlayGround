package dailyOne.p677;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  public static void main(String[] args) {
    var res = new Solution().sieveOfEratosthenes(1000);
    System.out.println(res);
  }

  public List<Integer> sieveOfEratosthenes(final int n) {
    final List<Integer> primes = new ArrayList<>();
    final boolean[] isPrime = new boolean[n + 1];

    for (int i = 2; i <= n; i++) {
      isPrime[i] = true;
    }

    for (int k = 2; k <= Math.pow(n, 0.5); k++) {
      for (int i = k; i <= n / k; i++) {
           // System.out.printf("%s ,", k * i);
        isPrime[(k * i)] = false;
      }
       // System.out.println();
    }

    for (int x = 2; x <= n; x++) {
      if (isPrime[x]) primes.add(x);
    }

    return primes;
  }
}
